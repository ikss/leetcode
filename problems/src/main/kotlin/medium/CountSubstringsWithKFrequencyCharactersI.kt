package medium

/**
 * Given a string s and an integer k, return the total number of substrings of s where at least one character appears
 * at least k times.
 *
 * [URL](https://leetcode.com/problems/count-substrings-with-k-frequency-characters-i/)
 */
object CountSubstringsWithKFrequencyCharactersI {
    fun numberOfSubstrings(s: String, k: Int): Int {
        val n = s.length
        var res = (n + 1) * n / 2
        val count = IntArray(26)
        var i = 0
        for (j in s.indices) {
            val c = s[j]
            count[c - 'a']++
            while (count[c - 'a'] >= k) {
                val leftChar = s[i]
                count[leftChar - 'a']--
                i++
            }
            res -= j - i + 1
        }
        return res
    }
}
