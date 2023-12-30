package strings.hard

/**
 * Given a string s and an integer k, return true if s is a k-palindrome.
 *
 * A string is k-palindrome if it can be transformed into a palindrome by removing at most k characters from it.
 *
 * [URL](https://leetcode.com/problems/valid-palindrome-iii/)
 */
object ValidPalindromeIII {
    fun isValidPalindrome(s: String, k: Int): Boolean {
        val memo = Array(s.length) { IntArray(s.length) }

        // Generate all combinations of `i` and `j` in the correct order.
        for (i in s.length - 2 downTo 0) {
            for (j in i + 1 until s.length) {
                // Case 1: Character at `i` equals character at `j`
                memo[i][j] = if (s[i] == s[j]) {
                    memo[i + 1][j - 1]
                } else {
                    1 + minOf(memo[i + 1][j], memo[i][j - 1])
                }
            }
        }

        // Return true if the minimum cost to create a palindrome by only deleting the letters
        // is less than or equal to `k`.
        return memo[0][s.length - 1] <= k
    }
}
