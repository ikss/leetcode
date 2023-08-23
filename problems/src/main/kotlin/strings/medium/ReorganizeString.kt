package strings.medium

/**
 * Given a string s, rearrange the characters of s so that any two adjacent characters are not the same.
 *
 * Return any possible rearrangement of s or return "" if not possible.
 *
 * [URL](https://leetcode.com/problems/reorganize-string/)
 */
object ReorganizeString {
    fun reorganizeString(s: String): String {
        val chars = IntArray(26)
        var max = 0
        var char = 0

        for (c in s) {
            val i = c - 'a'
            chars[i]++
            if (chars[i] > max) {
                max = chars[i]
                char = i
            }
        }
        if (max > (s.length + 1) / 2) {
            return ""
        }
        val result = CharArray(s.length)
        var index = 0

        // Place the most frequent letter
        while (chars[char] != 0) {
            result[index] = 'a' + char
            index += 2
            chars[char]--
        }

        // Place rest of the letters in any order
        for (i in chars.indices) {
            while (chars[i] > 0) {
                if (index >= s.length) {
                    index = 1
                }
                result[index] = 'a' + i
                index += 2
                chars[i]--
            }
        }
        return String(result)
    }
}