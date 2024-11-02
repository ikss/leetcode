package strings.hard

/**
 * You are given a string s. You can convert s to a palindrome by adding characters in front of it.
 *
 * Return the shortest palindrome you can find by performing this transformation.
 *
 * [URL](https://leetcode.com/problems/shortest-palindrome/)
 */
object ShortestPalindrome {
    fun shortestPalindrome(s: String): String {
        return shortestPalindrome(s, s.length)
    }

    private fun shortestPalindrome(s: String, end: Int): String {
        var left = 0

        for (right in end - 1 downTo 0) {
            if (s[right] == s[left]) {
                left++
            }
        }

        if (left == end) return s
        
        val builder = StringBuilder(end).append(s, left, end).reverse()

        return builder.append(shortestPalindrome(s, left)).toString()
    }
}
