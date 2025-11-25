package medium

/**
 * Given a string s and an integer k, return the number of substrings in s of length k with no repeated characters.
 *
 * [URL](https://leetcode.com/problems/find-k-length-substrings-with-no-repeated-characters/)
 */
object FindKLengthSubstringsWithNoRepeatedCharacters {
    fun numKLenSubstrNoRepeats(s: String, k: Int): Int {
        if (k > s.length) return 0
        val hash = IntArray(26)

        var i = 0
        var repeated = 0

        while (i < k) {
            hash[s[i] - 'a']++
            if (hash[s[i] - 'a'] == 2) {
                repeated++
            }
            i++
        }
        var result = if (repeated == 0) 1 else 0
        while (i < s.length) {
            hash[s[i] - 'a']++
            if (hash[s[i] - 'a'] == 2) {
                repeated++
            }
            hash[s[i - k] - 'a']--

            if (hash[s[i - k] - 'a'] == 1) {
                repeated--
            }
            if (repeated == 0) {
                result++
            }
            i++
        }

        return result
    }
}
