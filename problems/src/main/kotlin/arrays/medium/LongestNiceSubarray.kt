package arrays.medium

/**
 * You are given an array nums consisting of positive integers.
 *
 * We call a subarray of nums nice if the bitwise AND of every pair of elements that are in different
 * positions in the subarray is equal to 0.
 *
 * Return the length of the longest nice subarray.
 *
 * A subarray is a contiguous part of an array.
 *
 * Note that subarrays of length 1 are always considered nice.
 *
 * [URL](https://leetcode.com/problems/longest-nice-subarray/)
 */
object LongestNiceSubarray {
    fun longestNiceSubarray(nums: IntArray): Int {
        var runningOr = 0
        var currCount = 0
        var result = 0
        var i = 0

        while (i < nums.size) {
            if (runningOr and nums[i] == 0) {
                runningOr = runningOr or nums[i]
                currCount++
                i++
                result = maxOf(result, currCount)
            } else {
                runningOr = remove(i - currCount, i, nums)
                currCount--
            }
        }

        return result
    }

    private fun remove(toRemove: Int, curr: Int, nums: IntArray): Int {
        var running = 0
        for (i in toRemove + 1 until curr) {
            running = running or nums[i]
        }
        return running
    }
}
