package medium

import java.util.*


/**
 * You are given two strings s and target, both having length n, consisting of lowercase English letters.
 *
 * Return the lexicographically smallest permutation of s that is strictly greater than target.
 * If no permutation of s is lexicographically strictly greater than target, return an empty string.
 *
 * A string a is lexicographically strictly greater than a string b (of the same length) if in the first position where
 * a and b differ, string a has a letter that appears later in the alphabet than the corresponding letter in b.
 *
 * [URL](https://leetcode.com/problems/lexicographically-smallest-permutation-greater-than-target/)
 */
object LexicographicallySmallestPermutationGreaterThanTarget {

    fun lexGreaterPermutation(s: String, target: String): String {
        val n = s.length
        val counts = IntArray(26)
        for (i in 0 until s.length) {
            counts[s[i] - 'a']++
            counts[target[i] - 'a']--
        }

        // Try from right to left
        val t = target.toCharArray()
        for (i in s.length - 1 downTo 0) {
            val b = t[i] - 'a'
            counts[b]++ // Reversal of consumption
            // Check if the prefix can fully match
            if (counts.min() < 0) {
                continue
            }
            // Find the smallest available character larger than b.
            for (j in b + 1..25) {
                if (counts[j] > 0) {
                    counts[j]--
                    t[i] = 'a' + j
                    return String(t, 0, i + 1) + getMinString(counts)
                }
            }
        }

        return ""
    }

    // Get the lexicographically smallest string (in ascending order)
    private fun getMinString(cnt: IntArray): String {
        val res = StringBuilder()
        for (i in 0..25) {
            for (c in 0 until cnt[i]) {
                res.append('a' + i)
            }
        }
        return res.toString()
    }
}
