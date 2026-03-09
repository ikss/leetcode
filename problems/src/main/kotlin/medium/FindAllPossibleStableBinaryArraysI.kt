package medium

/**
 * You are given 3 positive integers zero, one, and limit.
 *
 * A binary array arr is called stable if:
 *
 * * The number of occurrences of 0 in arr is exactly zero.
 * * The number of occurrences of 1 in arr is exactly one.
 * * Each subarray of arr with a size greater than limit must contain both 0 and 1.
 *
 * Return the total number of stable binary arrays.
 *
 * Since the answer may be very large, return it modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/find-all-possible-stable-binary-arrays-i/)
 */
object FindAllPossibleStableBinaryArraysI {
    fun numberOfStableArrays(zero: Int, one: Int, limit: Int): Int {
        val mod = 1_000_000_007L
        val dp = Array(zero + 1) { Array(one + 1) { LongArray(2) } }
        for (i in 0..minOf(zero, limit)) {
            dp[i][0][0] = 1
        }
        for (j in 0..minOf(one, limit)) {
            dp[0][j][1] = 1
        }
        for (i in 1..zero) {
            for (j in 1..one) {
                if (i > limit) {
                    dp[i][j][0] = dp[i - 1][j][0] + dp[i - 1][j][1] - dp[i - limit - 1][j][1]
                } else {
                    dp[i][j][0] = dp[i - 1][j][0] + dp[i - 1][j][1]
                }
                dp[i][j][0] = ((dp[i][j][0] % mod) + mod) % mod
                if (j > limit) {
                    dp[i][j][1] = dp[i][j - 1][1] + dp[i][j - 1][0] - dp[i][j - limit - 1][0]
                } else {
                    dp[i][j][1] = dp[i][j - 1][1] + dp[i][j - 1][0]
                }
                dp[i][j][1] = ((dp[i][j][1] % mod) + mod) % mod
            }
        }

        return ((dp[zero][one][0] + dp[zero][one][1]) % mod).toInt()
    }
}
