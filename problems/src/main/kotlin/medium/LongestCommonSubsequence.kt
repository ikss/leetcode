package medium

/**
 * Given two strings text1 and text2, return the length of their longest common subsequence.
 * If there is no common subsequence, return 0.
 *
 * A subsequence of a string is a new string generated from the original string with some characters (can be none)
 * deleted without changing the relative order of the remaining characters.
 * * For example, "ace" is a subsequence of "abcde".
 *
 * A common subsequence of two strings is a subsequence that is common to both strings.
 *
 * [URL](https://leetcode.com/problems/longest-common-subsequence/)
 */
object LongestCommonSubsequence {
    fun longestCommonSubsequence(text1: String, text2: String): Int {
        val l1 = text1.length
        val l2 = text2.length

        val dp = Array(l1 + 1) { IntArray(l2 + 1) }

        for (i in 0 until l1) {
            for (j in 0 until l2) {
                dp[i + 1][j + 1] = if (text1[i] == text2[j]) {
                    dp[i][j] + 1
                } else {
                    maxOf(dp[i + 1][j], dp[i][j + 1])
                }
            }
        }

        return dp[l1][l2]
    }
}
