package arrays.hard

import java.util.*

/**
 * You are given two 0-indexed integer arrays nums1 and nums2 of length n.
 *
 * A range `[l, r]` (inclusive) where 0 <= l <= r < n is balanced if:
 * For every i in the range `[l, r]`, you pick either `nums1[i]` or `nums2[i].`
 * The sum of the numbers you pick from nums1 equals to the sum of the numbers you pick from nums2
 * (the sum is considered to be 0 if you pick no numbers from an array).
 * Two balanced ranges from `[l1, r1]` and `[l2, r2]` are considered to be different if at least one of the following is true:
 * * l1 != l2
 * * r1 != r2
 * * `nums1[i] `is picked in the first range, and `nums2[i]` is picked in the second range or vice versa for at least one i.
 *
 * Return the number of different ranges that are balanced. Since the answer may be very large, return it modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/closest-subsequence-sum/)
 */
object ChooseNumbersFromTwoArraysInRange {
    fun countSubranges(nums1: IntArray, nums2: IntArray): Int {
        val n = nums1.size
        val mid = 10000 // max sum of nums1 or nums2 (100 elements * 100 max value)
        val maxDpSize = 2 * mid + 1
        val mod = 1_000_000_007
        val dp = Array(n + 1) { IntArray(maxDpSize) }
        for (i in 0..n) {
            dp[i][mid] = 1
        }
        var result = 0
        for (j in 0 until n) {
            for (k in 0 until maxDpSize) {
                // move right from mid-value
                if (k + nums1[j] < maxDpSize) {
                    dp[j + 1][k + nums1[j]] += dp[j][k]
                    dp[j + 1][k + nums1[j]] %= mod
                }
                // move left from mid-value
                if (k - nums2[j] >= 0) {
                    dp[j + 1][k - nums2[j]] += dp[j][k]
                    dp[j + 1][k - nums2[j]] %= mod
                }
            }
            // if returned to mid add to result
            result += dp[j + 1][mid] - 1
            result %= mod
        }
        return result
    }
}

