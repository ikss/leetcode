package strings.easy

/**
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 *
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of
 * the characters without disturbing the relative positions of the remaining characters.
 * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 *
 * [URL](https://leetcode.com/problems/is-subsequence/)
 */
object IsSubsequence {
    fun isSubsequence(s: String, t: String): Boolean {
        if (s.isEmpty()) return true
        if (s.length > t.length) return false

        var found = 0
        for (c in t) {
            if (s[found] == c) {
                found++
                if (found == s.length) return true
            }
        }
        return false
    }
}