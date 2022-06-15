package strings.medium

/**
 * Given a string s, return the longest palindromic substring in s.
 *
 * [URL](https://leetcode.com/problems/longest-palindromic-substring/)
 */
object LongestPalindromicSubstring {

    fun longestPalindrome(s: String): String {
        if (s.length < 2) {
            return s
        }
        var index = 0
        var r = 0
        var max = 1
        val chars = s.toCharArray()
        while (r < chars.size) {
            var l = 1
            while (r - l >= 0 && r + l < chars.size && chars[r - l] == chars[r + l]) {
                if (max < l * 2 + 1) {
                    max = l * 2 + 1
                    index = r
                }
                l++
            }
            l = 0
            while (r - l >= 0 && r + l + 1 < chars.size && chars[r - l] == chars[r + l + 1]) {
                l++
                if (max < l * 2) {
                    max = l * 2
                    index = r
                }
            }
            r++
        }
        return s.substring(index - max / 2 + 1 - max % 2, index + max / 2 + 1)
    }
}
