package strings.hard

import java.util.*

/**
 * You are given a list of strings of the same length words and a string target.
 *
 * Your task is to form target using the given words under the following rules:
 *
 * target should be formed from left to right.
 * To form the ith character (0-indexed) of target, you can choose the kth character of the jth string in words
 * if `target[i] = words[j][k]`.
 * Once you use the kth character of the jth string of words, you can no longer use the xth character of any string in
 * words where x <= k. In other words, all characters to the left of or at index k become unusuable for every string.
 * Repeat the process until you form the string target.
 * Notice that you can use multiple characters from the same string in words provided the conditions above are met.
 *
 * Return the number of ways to form target from words. Since the answer may be too large, return it modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/number-of-ways-to-form-a-target-string-given-a-dictionary/)
 */
object NumberOfWaysToFormTargetStringGivenDictionary {
    fun numWays(words: Array<String>, target: String): Int {
        val alphabet = 26
        val mod = 1000000007
        val m = target.length
        val k = words[0].length
        val cnt = Array(alphabet) { IntArray(k) }
        for (j in 0 until k) {
            for (word in words) {
                cnt[word[j] - 'a'][j]++
            }
        }
        val dp = Array(m + 1) { LongArray(k + 1) }
        dp[0][0] = 1
        for (i in 0..m) {
            for (j in 0 until k) {
                if (i < m) {
                    dp[i + 1][j + 1] += cnt[target[i] - 'a'][j] * dp[i][j]
                    dp[i + 1][j + 1] %= mod.toLong()
                }
                dp[i][j + 1] += dp[i][j]
                dp[i][j + 1] %= mod.toLong()
            }
        }
        return dp[m][k].toInt()
    }
}
