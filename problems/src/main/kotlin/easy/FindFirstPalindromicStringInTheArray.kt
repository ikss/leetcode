package easy

/**
 * Given an array of strings words, return the first palindromic string in the array.
 * If there is no such string, return an empty string "".
 *
 * A string is palindromic if it reads the same forward and backward.
 *
 * [URL](https://leetcode.com/problems/find-first-palindromic-string-in-the-array/)
 */
object FindFirstPalindromicStringInTheArray {
    fun firstPalindrome(words: Array<String>): String {
        for (str in words) {
            if (isPalindromic(str)) return str
        }
        return ""
    }

    private fun isPalindromic(str: String): Boolean {
        var left = 0
        var right = str.length - 1

        while (left < right) {
            if (str[left++] != str[right--]) return false
        }
        return true
    }
}
