package medium

/**
 * Given a string s, return the number of homogenous substrings of s.
 * Since the answer may be too large, return it modulo 10^9 + 7.
 *
 * A string is homogenous if all the characters of the string are the same.
 *
 * A substring is a contiguous sequence of characters within a string.
 *
 * [URL](https://leetcode.com/problems/count-number-of-homogenous-substrings/)
 */
object CountNumberOfHomogenousSubstrings {
    fun countHomogenous(s: String): Int {
        val MOD = 1_000_000_007
        var result = 0
        var currStreak = 0

        for (i in s.indices) {
            if (i == 0 || s[i] == s[i - 1]) {
                currStreak++
            } else {
                currStreak = 1
            }
            result = (result + currStreak) % MOD
        }

        return result
    }
}