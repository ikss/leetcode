package strings.medium


/**
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
 *
 * In other words, return true if one of s1's permutations is the substring of s2.
 *
 * [URL](https://leetcode.com/problems/permutation-in-string/)
 */
object PermutationInString {
    fun checkInclusion(s1: String, s2: String): Boolean {
        val hash = IntArray(26)
        var start = 0
        var end = 0
        var count = s1.length
        for (char in s1) {
            hash[char - 'a']++
        }
        while (end < s2.length) {
            if (hash[s2[end++] - 'a']-- >= 1) {
                count--
            }
            if (count == 0) {
                return true
            }
            if (end - start == s1.length && hash[s2[start++] - 'a']++ >= 0) {
                count++
            }
        }
        return false
    }
}
