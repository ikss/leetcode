package strings.medium

/**
 * Given two strings s1 and s2, return the lowest ASCII sum of deleted characters to make two strings equal.
 *
 * [URL](https://leetcode.com/problems/minimum-ascii-delete-sum-for-two-strings/)
 */
object MinimumASCIIDeleteSumForTwoStrings {
    fun minimumDeleteSum(s1: String, s2: String): Int {
        val m = s1.length
        val n = s2.length
        val dp = Array(m + 1) { IntArray(n + 1) { Int.MAX_VALUE } }

        return calculateCost(s1, s2, m, n, dp)
    }

    private fun calculateCost(s1: String, s2: String, i: Int, j: Int, dp: Array<IntArray>): Int {
        if (i == 0 && j == 0) {
            return 0
        }

        if (dp[i][j] != Int.MAX_VALUE) {
            return dp[i][j]
        }

        if (i == 0) {
            dp[i][j] = s2[j - 1].toInt() + calculateCost(s1, s2, i, j - 1, dp)
            return dp[i][j]
        }

        if (j == 0) {
            dp[i][j] = s1[i - 1].toInt() + calculateCost(s1, s2, i - 1, j, dp)
            return dp[i][j]
        }

        if (s1[i - 1] == s2[j - 1]) {
            dp[i][j] = calculateCost(s1, s2, i - 1, j - 1, dp)
        } else {
            dp[i][j] = minOf(
                s1[i - 1].toInt() + calculateCost(s1, s2, i - 1, j, dp),
                s2[j - 1].toInt() + calculateCost(s1, s2, i, j - 1, dp)
            )
        }
        return dp[i][j]
    }
}