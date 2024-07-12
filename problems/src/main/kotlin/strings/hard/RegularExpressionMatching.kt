package strings.hard

/**
 * Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
 * * '.' Matches any single character.
 * * '*' Matches zero or more of the preceding element.
 *
 * The matching should cover the entire input string (not partial).
 *
 * [URL](https://leetcode.com/problems/regular-expression-matching/)
 */
object RegularExpressionMatching {
    fun isMatch(s: String, p: String): Boolean {
        val memo = Array(s.length + 1) { Array<Boolean?>(p.length + 1) { null } }
        return dp(0, 0, s, p, memo)
    }

    private fun dp(si: Int, pi: Int, s: String, p: String, memo: Array<Array<Boolean?>>): Boolean {
        memo[si][pi]?.let { return it }
        val result = if (pi == p.length) {
            si == s.length
        } else {
            val firstMatch = si < s.length && (s[si] == p[pi] || p[pi] == '.')

            if (pi + 1 < p.length && p[pi + 1] == '*') {
                // if it matches zero characters we just skip the pattern
                dp(si, pi + 2, s, p, memo)
                // if it matches one or more characters we move to the next character in the string
                || (firstMatch && dp(si + 1, pi, s, p, memo))
            } else {
                firstMatch && dp(si + 1, pi + 1, s, p, memo)
            }
        }
        memo[si][pi] = result
        return result
    }
}