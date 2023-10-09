package strings.medium

/**
 * Given an integer n, return the number of strings of length n that consist only of vowels (a, e, i, o, u)
 * and are lexicographically sorted.
 *
 * A string s is lexicographically sorted if for all valid i, `s[i]` is the same as
 * or comes before `s[i+1] `in the alphabet.
 *
 * [URL](https://leetcode.com/problems/count-sorted-vowel-strings/)
 */
object CountVowelsStrings {
    fun countVowelStrings(n: Int): Int {
        val dp = Array(n + 1) { IntArray(6) }
        for (k in 1..5) {
            dp[0][k] = 1
        }
        for (i in 1..n) {
            for (k in 1..5) {
                dp[i][k] = dp[i][k - 1] + dp[i - 1][k]
            }
        }
        return dp[n][5]
    }
}
