package medium

/**
 * Given a string s, return the number of unique palindromes of length three that are a subsequence of s.
 *
 * Note that even if there are multiple ways to obtain the same subsequence, it is still only counted once.
 *
 * A palindrome is a string that reads the same forwards and backwards.
 *
 * A subsequence of a string is a new string generated from the original string with some characters (can be none)
 * deleted without changing the relative order of the remaining characters.
 *
 * * For example, "ace" is a subsequence of "abcde".
 *
 * [URL](https://leetcode.com/problems/unique-length-3-palindromic-subsequences/)
 */
object UniqueLength3PalindromicSubsequences {
    fun countPalindromicSubsequence(s: String): Int {
        val mapOfChars = HashMap<Char, Pair<Int, Int>>()

        for (i in s.indices) {
            val c = s[i]
            val first = mapOfChars[c]?.first ?: i
            mapOfChars[c] = first to i
        }

        var result = 0

        for ((first, last) in mapOfChars.values) {
            if (first == last) continue
            val visited = HashSet<Char>()
            for (i in first + 1..<last) {
                visited.add(s[i])
            }
            result += visited.size
        }
        return result
    }
}
