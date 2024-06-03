package strings.medium

/**
 * You are given two strings s and t consisting of only lowercase English letters.
 *
 * Return the minimum number of characters that need to be appended to the end of s so that t becomes a subsequence of s.
 *
 * A subsequence is a string that can be derived from another string by deleting some or no characters
 * without changing the order of the remaining characters.
 *
 * [URL](https://leetcode.com/problems/append-characters-to-string-to-make-subsequence/)
 */
object AppendCharactersToStringToMakeSubsequence {
    fun appendCharacters(s: String, t: String): Int {
        var curr = 0
        for (c in s) {
            if (c == t[curr]) curr++
            if (curr >= t.length) return 0
        }

        return t.length - curr
    }
}