package medium

/**
 * Given the string s, return the size of the longest substring containing each vowel an even number of times.
 * That is, 'a', 'e', 'i', 'o', and 'u' must appear an even number of times.
 *
 * [URL](https://leetcode.com/problems/find-the-longest-substring-containing-vowels-in-even-counts/)
 */
object FindTheLongestSubstringContainingVowelsInEvenCounts {
    private val map = mapOf(
        'a' to 1,
        'e' to 2,
        'i' to 4,
        'o' to 8,
        'u' to 16,
    )

    fun findTheLongestSubstring(s: String): Int {
        var result = 0
        val prevSeen = IntArray(32) { -1 }
        var currMask = 0

        for (i in s.indices) {
            val c = s[i]
            map[c]?.let {
                currMask = currMask xor it
            }
            if (currMask != 0 && prevSeen[currMask] == -1) {
                prevSeen[currMask] = i
            }
            result = maxOf(result, i - prevSeen[currMask])
        }

        return result
    }
}
