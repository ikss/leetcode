package strings.medium

/**
 * Given a string s, return the length of the longest repeating substrings. If no repeating substring exists, return 0.
 *
 * [URL](https://leetcode.com/problems/longest-repeating-substring/)
 */
object LongestRepeatingSubstring {
    fun longestRepeatingSubstring(s: String): Int {
        var min = 1
        var max = s.length - 1

        while (min <= max) {
            val mid = min + (max - min) / 2
            if (contains(s, mid)) {
                min = mid + 1
            } else {
                max = mid - 1
            }
        }

        return min - 1
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