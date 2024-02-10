package strings.medium

/**
 * Given a string s, return the number of palindromic substrings in it.
 *
 * A string is a palindrome when it reads the same backward as forward.
 *
 * A substring is a contiguous sequence of characters within the string.
 *
 * [URL](https://leetcode.com/problems/palindromic-substrings/)
 */
object PalindromicSubstrings {
    fun countSubstrings(s: String): Int {
        var result = 0

        for (i in s.indices) {
            // odd-length palindromes, single character center
            result += countPalindromesAroundCenter(s, i, i)

            // even-length palindromes, consecutive characters center
            result += countPalindromesAroundCenter(s, i, i + 1)
        }

        return result
    }

    private fun countPalindromesAroundCenter(s: String, lo: Int, hi: Int): Int {
        var lo = lo
        var hi = hi
        var result = 0

        while (lo >= 0 && hi < s.length) {
            if (s[lo] != s[hi]) break // the first and last characters don't match!
            // expand around the center
            lo--
            hi++

            result++
        }

        return result
    }
}
