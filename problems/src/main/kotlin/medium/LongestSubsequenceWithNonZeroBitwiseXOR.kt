package medium

/**
 * You are given an integer array nums.
 *
 * Return the length of the longest subsequence in nums whose bitwise XOR is non-zero.
 * If no such subsequence exists, return 0.
 *
 * [URL](https://leetcode.com/problems/longest-subsequence-with-non-zero-bitwise-xor/)
 */
object LongestSubsequenceWithNonZeroBitwiseXOR {
    fun longestSubsequence(nums: IntArray): Int {
        var hasNonZero = false

        var allXored = 0

        for (n in nums) {
            if (n != 0) {
                hasNonZero = true
            }

            allXored = allXored xor n
        }

        if (!hasNonZero) {
            return 0
        }
        if (allXored != 0) {
            return nums.size
        }
        return nums.size - 1
    }

}
