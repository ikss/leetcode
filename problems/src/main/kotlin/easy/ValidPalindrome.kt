package easy

/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
 * and removing all non-alphanumeric characters, it reads the same forward and backward.
 * Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 * [URL](https://leetcode.com/problems/valid-palindrome/)
 */
object ValidPalindrome {
    private val pattern = Regex("[^a-zA-Z\\d]")

    fun isPalindrome(s: String): Boolean {
        val str = s.lowercase().replace(pattern, "")
        if (str.isEmpty()) return true
        val mid = str.length / 2
        for (i in 0..mid) {
            if (str[i] != str[str.length - i - 1]) {
                return false
            }
        }
        return true
    }
}
