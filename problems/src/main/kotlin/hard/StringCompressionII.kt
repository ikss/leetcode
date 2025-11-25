package hard

import java.util.*

/**
 * Run-length encoding is a string compression method that works by replacing consecutive identical characters
 * (repeated 2 or more times) with the concatenation of the character and the number marking the count of the characters
 * (length of the run). For example, to compress the string "aabccc" we replace "aa" by "a2" and replace "ccc" by "c3".
 * Thus the compressed string becomes "a2bc3".
 *
 * Notice that in this problem, we are not adding '1' after single characters.
 *
 * Given a string s and an integer k. You need to delete at most k characters from s such that the run-length
 * encoded version of s has minimum length.
 *
 * Find the minimum length of the run-length encoded version of s after deleting at most k characters.
 *
 * [URL](https://leetcode.com/problems/string-compression-ii/)
 */
object StringCompressionII {
    fun getLengthOfOptimalCompression(s: String, k: Int): Int {
        val n = s.length
        val dp = Array(n + 1) { IntArray(k + 1) }
        for (i in 1..n) Arrays.fill(dp[i], Integer.MAX_VALUE)
        for (i in 1..n) {
            for (j in 0..k) {
                if (j > 0) dp[i][j] = dp[i - 1][j - 1]
                var removed = 0
                var cnt = 0
                var p = i
                while (p > 0) {
                    if (s[p - 1] == s[i - 1]) {
                        cnt++
                    } else if (++removed > j) {
                        break
                    }
                    dp[i][j] = minOf(dp[i][j], dp[p - 1][j - removed] + calcLen(cnt))
                    p--
                }
            }
        }
        return dp[n][k]
    }

    private fun calcLen(len: Int): Int = when {
        len == 0 -> 0
        len == 1 -> 1
        len < 10 -> 2
        len < 100 -> 3
        else -> 4
    }

}
