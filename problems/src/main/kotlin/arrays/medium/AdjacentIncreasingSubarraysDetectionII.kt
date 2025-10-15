package arrays.medium

/**
 * Given an array nums of n integers, your task is to find the maximum value of k for which there exist two adjacent
 * subarrays of length k each, such that both subarrays are strictly increasing. Specifically, check if there are two
 * subarrays of length k starting at indices a and b (a < b), where:
 * * Both subarrays `n`ums[a..a + k - 1]` and `nums[b..b + k - 1]` are strictly increasing.
 * * The subarrays must be adjacent, meaning b = a + k.
 *
 * Return the maximum possible value of k.
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 * [URL](https://leetcode.com/problems/adjacent-increasing-subarrays-detection-ii/)
 */
object AdjacentIncreasingSubarraysDetectionII {
    fun maxIncreasingSubarrays(nums: List<Int>): Int {
        var currCount = 1
        var prevCount = 0
        var max = 0

        for (i in 1 until nums.size) {
            max = maxOf(max, currCount / 2, minOf(currCount, prevCount))
            if (nums[i] > nums[i - 1]) {
                currCount++
            } else {
                prevCount = currCount
                currCount = 1
            }
        }
        max = maxOf(max, currCount / 2, minOf(currCount, prevCount))

        return max
    }
}
