package easy

/**
 * Given a string s, return the maximum length of a substring
 * such that it contains at most two occurrences of each character.
 *
 * [URL](https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/)
 */
object MaximumLengthSubstringWithTwoOccurrences {
    fun maximumLengthSubstring(s: String): Int {
        val counts = IntArray(26)

        var result = 0
        var has1counts = 0

        var start = 0
        for (end in s.indices) {
            val c = s[end]

            counts[c - 'a']++

            while (counts[c - 'a'] > 2) {
                val startChar = s[start]
                counts[startChar - 'a']--
                if (counts[startChar - 'a'] == 1) {
                    has1counts++
                } else if (counts[startChar - 'a'] == 0) {
                    has1counts--
                }
                start++
            }
            if (counts[c - 'a'] == 1) {
                has1counts++
            } else if (counts[c - 'a'] == 0 || counts[c - 'a'] == 2) {
                has1counts--
            }
            result = maxOf(result, end - start + 1)
        }


        return result
    }
}
