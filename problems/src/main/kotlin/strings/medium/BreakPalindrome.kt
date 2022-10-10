package strings.medium

/**
 * Given a palindromic string of lowercase English letters palindrome,
 * replace exactly one character with any lowercase English letter so that the resulting string is not a palindrome
 * and that it is the lexicographically smallest one possible.
 *
 * Return the resulting string. If there is no way to replace a character to make it not a palindrome,
 * return an empty string.

 * A string a is lexicographically smaller than a string b (of the same length) if in the first position
 * where a and b differ, a has a character strictly smaller than the corresponding character in b.
 * For example, "abcc" is lexicographically smaller than "abcd" because the first position they differ is
 * at the fourth character, and 'c' is smaller than 'd'.
 *
 * [URL](https://leetcode.com/problems/break-a-palindrome/)
 */
object BreakPalindrome {
    fun breakPalindrome(palindrome: String): String {
        if (palindrome.length == 1) return ""

        val arr = palindrome.toCharArray()
        val hasEven = arr.size % 2 == 0
        for (i in arr.indices) {
            if (arr[i] != 'a' && (hasEven || i != arr.size / 2)) {
                arr[i] = 'a'
                return String(arr)
            }
        }
        arr[arr.size - 1] = 'b'
        return String(arr)
    }
}
