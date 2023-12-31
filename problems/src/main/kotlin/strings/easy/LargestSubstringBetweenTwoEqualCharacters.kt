package strings.easy

/**
 * Given a string s, return the length of the longest substring between two equal characters,
 * excluding the two characters. If there is no such substring return -1.
 *
 * A substring is a contiguous sequence of characters within a string.
 *
 * [URL](https://leetcode.com/problems/largest-substring-between-two-equal-characters/)
 */
object LargestSubstringBetweenTwoEqualCharacters {
    fun maxLengthBetweenEqualCharactersMap(s: String): Int {
        var result = -1
        val firstEnc = HashMap<Char, Int>()

        for (i in s.indices) {
            val c = s[i]
            val first = firstEnc[c]
            if (first == null) {
                firstEnc[c] = i
            } else {
                result = maxOf(result, i - first - 1)
            }
        }

        return result
    }

    fun maxLengthBetweenEqualCharactersArray(s: String): Int {
        var result = -1
        val firstEnc = IntArray(26) { -1 }

        for (i in s.indices) {
            val c = s[i]
            val first = firstEnc[c - 'a']
            if (first == -1) {
                firstEnc[c - 'a'] = i
            } else {
                result = maxOf(result, i - first - 1)
            }
        }

        return result
    }
}