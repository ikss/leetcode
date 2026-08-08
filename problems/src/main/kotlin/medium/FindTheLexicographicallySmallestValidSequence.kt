package medium

import data_structures.ListNode

/**
 * You are given two strings word1 and word2.
 *
 * A string x is called almost equal to y if you can change at most one character in x to make it identical to y.
 *
 * A sequence of indices seq is called valid if:
 * * The indices are sorted in ascending order.
 * * Concatenating the characters at these indices in word1 in the same order results in a string that is almost equal to word2.
 *
 * Return an array of size word2.length representing the lexicographically smallest valid sequence of indices.
 * If no such sequence of indices exists, return an empty array.
 *
 * Note that the answer must represent the lexicographically smallest array,
 * not the corresponding string formed by those indices.
 *
 * [URL](https://leetcode.com/problems/find-the-lexicographically-smallest-valid-sequence/)
 */
object FindTheLexicographicallySmallestValidSequence {
    fun validSequence(word1: String, word2: String): IntArray {
        val len1 = word1.length
        val len2 = word2.length

        val last = IntArray(len2) { -1 }
        var j = len2 - 1
        for (i in len1 - 1 downTo 0) {
            if (j > 0 && word1[i] == word2[j]) {
                last[j--] = i
            }
        }

        val result = IntArray(len2)

        var skip = 0
        j = 0

        for (i in 0 until len1) {
            if (j == len2) break
            if (word1[i] == word2[j] || (skip == 0 && (j == len2 - 1 || i < last[j + 1]))) {
                if (word1[i] != word2[j]) {
                    skip++
                }
                result[j] = i
                j += 1
            }
        }

        return if (j == len2) result else intArrayOf()
    }

}
