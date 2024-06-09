package strings.medium

/**
 * You are given a 0-indexed string s consisting of only lowercase English letters.
 * Return the number of substrings in s that begin and end with the same character.
 *
 * A substring is a contiguous non-empty sequence of characters within a string.
 *
 * [URL](https://leetcode.com/problems/substrings-that-begin-and-end-with-the-same-letter/)
 */
object SubstringsThatBeginAndEndWithTheSameLetter {
    fun numberOfSubstrings(s: String): Long {
        val map = HashMap<Char, Int>()
        var result = 0L

        for (c in s) {
            val count = map.getOrDefault(c, 0) + 1
            map[c] = count

            result += count
        }
        return result
    }
}