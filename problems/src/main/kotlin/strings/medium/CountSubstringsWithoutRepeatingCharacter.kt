package strings.medium

/**
 * You are given a string s consisting only of lowercase English letters. We call a substring special if it contains no
 * character which has occurred at least twice (in other words, it does not contain a repeating character).
 * Your task is to count the number of special substrings. For example, in the string "pop", the substring "po" is
 * a special substring, however, "pop" is not special (since 'p' has occurred twice).
 *
 * Return the number of special substrings.
 *
 * A substring is a contiguous sequence of characters within a string. For example, "abc" is a substring of "abcd",
 * but "acd" is not.
 *
 * [URL](https://leetcode.com/problems/count-substrings-without-repeating-character/)
 */
object CountSubstringsWithoutRepeatingCharacter {
    fun numberOfSpecialSubstrings(s: String): Int {
        var result = 0

        var start = 0
        val freq = IntArray(26)
        for (end in s.indices) {
            freq[s[end] - 'a']++

            while (freq[s[end] - 'a'] > 1) {
                freq[s[start] - 'a']--
                start++
            }

            result += end - start + 1
        }

        return result
    }
}