package arrays.medium

/**
 * Given an array nums of integers, return the length of the longest arithmetic subsequence in nums.
 *
 * Note that:
 *
 * A subsequence is an array that can be derived from another array by deleting some or no elements without
 * changing the order of the remaining elements.
 * A sequence seq is arithmetic if `seq[i + 1] - seq[i]` are all the same value (for 0 <= i < seq.length - 1).
 *
 * [URL](https://leetcode.com/problems/longest-arithmetic-subsequence/)
 */
object LongestArithmeticSubsequence {
    fun longestArithSeqLength(nums: IntArray): Int {
        var result = 0
        val dp = Array(nums.size) { HashMap<Int, Int>(nums.size) }

        for (right in nums.indices) {
            for (left in 0 until right) {
                val diff = nums[right] - nums[left]
                val newValue = dp[left].getOrDefault(diff, 1) + 1
                dp[right][diff] = newValue
                result = maxOf(result, newValue)
            }
        }

        return result
    }
}
