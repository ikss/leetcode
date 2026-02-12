package medium

/**
 * You are given a string s consisting of lowercase English letters.
 *
 * A substring of s is called balanced if all distinct characters in the substring appear the same number of times.
 *
 * Return the length of the longest balanced substring of s.
 *
 * [URL](https://leetcode.com/problems/longest-balanced-substring-i/)
 */
object LongestBalancedSubstringI {
    fun longestBalanced(s: String): Int {
        var result = 1

        for (i in 0 until s.length - 1) {
            val map = hashMapOf(s[i] to 1)
            var max = 1
            var distinct = 0
            for (j in i + 1 until s.length) {
                val prev = map.getOrDefault(s[j], 0)
                val new = prev + 1
                map[s[j]] = new
                if (new > max) {
                    max = new
                    distinct = map.size - 1
                } else if (new == max) {
                    distinct = maxOf(0, distinct - 1)
                } else if (prev == 0) {
                    distinct++
                }

                if (distinct == 0) {
                    result = maxOf(result, j - i + 1)
                }
            }
        }

        return result
    }
}
