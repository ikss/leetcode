package medium

/**
 * You are given an integer array nums of size n.
 *
 * Consider a non-empty subarray from nums that has the maximum possible bitwise AND.
 *
 * * In other words, let k be the maximum value of the bitwise AND of any subarray of nums
 * Then, only subarrays with a bitwise AND equal to k should be considered.
 *
 * Return the length of the longest such subarray.
 *
 * The bitwise AND of an array is the bitwise AND of all the numbers in it.
 *
 * A subarray is a contiguous sequence of elements within an array.
 *
 * [URL](https://leetcode.com/problems/longest-subarray-with-maximum-bitwise-and/)
 */
object LongestSubarrayWithMaximumBitwiseAND {
    fun longestSubarray(nums: IntArray): Int {
        var result = 0
        var maxVal = 0
        var currentStreak = 0

        for (num in nums) {
            if (maxVal < num) {
                maxVal = num
                currentStreak = 0
                result = currentStreak
            }

            if (maxVal == num) {
                currentStreak++
            } else {
                currentStreak = 0
            }

            result = maxOf(result, currentStreak)
        }
        return result
    }
}
