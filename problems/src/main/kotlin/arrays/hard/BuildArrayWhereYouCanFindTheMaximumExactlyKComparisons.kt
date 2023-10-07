package arrays.hard

import java.util.*

/**
 * You are given three integers n, m and k. Consider the following algorithm to find the maximum element
 * of an array of positive integers:
 *
 *
 * You should build the array arr which has the following properties:
 * * arr has exactly n integers.
 * * `1 <= arr[i] <= m where (0 <= i < n)`.
 * * After applying the mentioned algorithm to arr, the value search_cost is equal to k.
 *
 * Return the number of ways to build the array arr under the mentioned conditions.
 * As the answer may grow large, the answer must be computed modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/build-array-where-you-can-find-the-maximum-exactly-k-comparisons/)
 */
object BuildArrayWhereYouCanFindTheMaximumExactlyKComparisons {
    private const val MOD = 1_000_000_007

    fun numOfArrays(n: Int, m: Int, k: Int): Int {
        val dp = Array(n + 1) {
            Array(m + 1) {
                LongArray(k + 1)
            }
        }
        val prefix = Array(n + 1) {
            Array(m + 1) {
                LongArray(k + 1)
            }
        }
        for (num in 1..m) {
            dp[1][num][1] = 1
            prefix[1][num][1] = prefix[1][num - 1][1] + 1
        }
        for (i in 1..n) {
            for (maxNum in 1..m) {
                for (cost in 1..k) {
                    var ans = maxNum * dp[i - 1][maxNum][cost] % MOD
                    ans = (ans + prefix[i - 1][maxNum - 1][cost - 1]) % MOD
                    dp[i][maxNum][cost] += ans
                    dp[i][maxNum][cost] %= MOD.toLong()
                    prefix[i][maxNum][cost] = prefix[i][maxNum - 1][cost] + dp[i][maxNum][cost]
                    prefix[i][maxNum][cost] %= MOD.toLong()
                }
            }
        }
        return prefix[n][m][k].toInt()
    }
}
