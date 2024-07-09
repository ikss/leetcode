package strings.easy

/**
 * Given a string s, return true if the s can be palindrome after deleting at most one character from it.
 *
 * [URL](https://leetcode.com/problems/valid-palindrome-ii/)
 */
object ValidPalindromeII {
    fun validPalindrome(s: String): Boolean {
        var start = 0
        var end = s.length - 1

        while (start < end) {
            if (s[start] != s[end]) {
                return checkPalindrome(s, start, end - 1) || checkPalindrome(s, start + 1, end)
            }

            start++
            end--
        }

        return true
    }

    private fun checkPalindrome(s: String, start: Int, end: Int): Boolean {
        var i = start
        var j = end
        while (i < j) {
            if (s[i++] != s[j--]) {
                return false
            }
        }

        return true
    }
}