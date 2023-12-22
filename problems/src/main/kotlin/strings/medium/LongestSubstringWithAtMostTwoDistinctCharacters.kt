package strings.medium

/**
 * Given a string s, return the length of the longest substring that contains at most two distinct characters.
 *
 * [URL](https://leetcode.com/problems/longest-substring-with-at-most-two-distinct-characters/)
 */
object LongestSubstringWithAtMostTwoDistinctCharacters {
    fun lengthOfLongestSubstringTwoDistinct(s: String): Int {
        if (s.length < 3) return s.length
        var start = 0
        var end = 0

        val map = HashMap<Char, Int>()
        var result = 2
        while (end < s.length) {
            map[s[end]] = end++
            if (map.size == 3) {
                val deleteAt = map.values.min()
                map.remove(s[deleteAt])
                start = deleteAt + 1
            }
            result = maxOf(result, end - start)
        }

        return result
    }
}