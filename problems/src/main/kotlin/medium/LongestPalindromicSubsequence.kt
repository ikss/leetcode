package medium

/**
 * Given a string s, find the longest palindromic subsequence's length in s.
 *
 * A subsequence is a sequence that can be derived from another sequence by deleting some or no elements without
 * changing the order of the remaining elements.
 *
 * [URL](https://leetcode.com/problems/longest-palindromic-subsequence/)
 */
object LongestPalindromicSubsequence {
    fun longestPalindromeSubseq(s: String): Int {
        val l = s.length
        val dp = Array(l) { IntArray(l) }

        for (i in l - 1 downTo 0) {
            dp[i][i] = 1

            for (j in i + 1 until l) {
                if (s[i] == s[j]) {
                    dp[i][j] = dp[i + 1][j - 1] + 2
                } else {
                    dp[i][j] = maxOf(dp[i + 1][j], dp[i][j - 1])
                }
            }
        }

        return dp[0][l - 1]
    }
}
