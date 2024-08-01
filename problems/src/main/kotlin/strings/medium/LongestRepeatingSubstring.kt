package strings.medium

/**
 * Given a string s, return the length of the longest repeating substrings. If no repeating substring exists, return 0.
 *
 * [URL](https://leetcode.com/problems/longest-repeating-substring/)
 */
object LongestRepeatingSubstring {
    fun longestRepeatingSubstring(s: String): Int {
        var maxLength = s.length - 1

        while (maxLength > 0) {
            if (contains(s, maxLength)) {
                return maxLength
            }
            maxLength--
        }

        return 0
    }

    private fun contains(s: String, maxLength: Int): Boolean {
        for (i in 0..s.length - maxLength - 1) {
            for (j in i + 1..s.length - maxLength) {
                if (checkSameSubs(i, j, s, maxLength)) {
                    return true
                }
            }
        }
        return false
    }

    private fun checkSameSubs(start1: Int, start2: Int, s: String, length: Int): Boolean {
        for (i in 0 until length) {
            if (s[start1 + i] != s[start2 + i]) {
                return false
            }
        }
        return true
    }
}