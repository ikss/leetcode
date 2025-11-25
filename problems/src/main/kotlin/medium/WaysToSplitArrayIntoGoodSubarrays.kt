package medium

/**
 * You are given a binary array nums.
 *
 * A subarray of an array is good if it contains exactly one element with the value 1.
 *
 * Return an integer denoting the number of ways to split the array nums into good subarrays.
 * As the number may be too large, return it modulo 109 + 7.
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 * [URL](https://leetcode.com/problems/ways-to-split-array-into-good-subarrays/)
 */
object WaysToSplitArrayIntoGoodSubarrays {
    fun numberOfGoodSubarraySplits(nums: IntArray): Int {
        var zeroesBetween = 0
        var oneSeen = false
        var result = 1L

        for (n in nums) {
            if (n == 0) {
                if (oneSeen) {
                    zeroesBetween++
                }
                continue
            }
            oneSeen = true
            result *= zeroesBetween + 1
            result %= 1_000_000_007
            zeroesBetween = 0
        }

        return if (oneSeen) result.toInt() else 0
    }
}
