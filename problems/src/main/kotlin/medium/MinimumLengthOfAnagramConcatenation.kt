package medium

/**
 * You are given a string s, which is known to be a concatenation of anagrams of some string t.
 *
 * Return the minimum possible length of the string t.
 *
 * An anagram is formed by rearranging the letters of a string.
 * For example, "aab", "aba", and, "baa" are anagrams of "aab".
 *
 * [URL](https://leetcode.com/problems/minimum-length-of-anagram-concatenation/)
 */
object MinimumLengthOfAnagramConcatenation {
    fun minAnagramLength(s: String): Int {
        for (i in 1 until s.length) {
            if (canSplit(i, s)) {
                return i
            }
        }
        return s.length
    }

    private fun canSplit(i: Int, s: String): Boolean {
        if (i == s.length) return true
        if (s.length % i != 0) return false

        val hash1 = IntArray(26)
        var curr = 0

        while (curr < i) {
            hash1[s[curr] - 'a']++
            curr++
        }
        var hash2 = IntArray(26)
        while (curr < s.length) {
            hash2[s[curr] - 'a']++
            curr++
            if (curr % i == 0) {
                if (!same(hash1, hash2)) return false
                hash2 = IntArray(26)
            }
        }
        return true
    }

    private fun same(hash1: IntArray, hash2: IntArray): Boolean {
        for (i in hash1.indices) {
            if (hash1[i] != hash2[i]) {
                return false
            }
        }
        return true
    }
}
