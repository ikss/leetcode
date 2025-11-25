package medium

/**
 * Given a string s, rearrange the characters of s so that any two adjacent characters are not the same.
 *
 * Return any possible rearrangement of s or return "" if not possible.
 *
 * [URL](https://leetcode.com/problems/reorganize-string/)
 */
object ReorganizeStringKApart {
    fun reorganizeString(s: String, k: Int): String {
        val chars = HashMap<Char, Int>(26)
        for (c in s) {
            chars.merge(c, 1, Integer::sum)
        }
        val pairs = chars.entries.sortedByDescending { it.value }

        val result = CharArray(s.length)
        var index = 0
        for ((char, count) in pairs) {
            for (i in 0 until count) {
                result[index] = char
                index += k
                if (index >= s.length) {
                    index = index % k + 1
                }
            }
        }
        val hash = IntArray(26)
        for (i in result.indices) {
            if (i >= k) {
                hash[result[i - k] - 'a']--
            }
            hash[result[i] - 'a']++
            if (hash[result[i] - 'a'] > 1) {
                return ""
            }
        }
        return String(result)
    }
}