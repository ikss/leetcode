package arrays.medium

import kotlin.math.max

/**
 * You are given an integer array nums and a positive integer k.
 * A subsequence sub of nums with length x is called valid if it satisfies:
 * * (sub[0] + sub[1]) % k == (sub[1] + sub[2]) % k == ... == (sub[x - 2] + sub[x - 1]) % k.
 *
 * Return the length of the longest valid subsequence of nums.
 *
 * [URL](https://leetcode.com/problems/find-the-maximum-length-of-valid-subsequence-ii/)
 */
object FindTheMaximumLengthOfValidSubsequenceII {
    fun maximumLength(nums: IntArray, k: Int): Int {
        val dp = Array(k) { IntArray(k) }
        var res = 0
        for (num in nums) {
            var num = num
            num %= k
            for (prev in 0..<k) {
                dp[prev]!![num] = dp[num]!![prev] + 1
                res = max(res, dp[prev]!![num])
            }
        }
        return res
    }
}
