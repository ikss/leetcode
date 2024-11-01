package strings.medium

import java.util.*

/**
 * You are given a 0-indexed string s, and a 2D array of integers queries, where `queries[i] = [li, ri]`
 * indicates a substring of s starting from the index li and ending at the index ri (both inclusive), i.e. `s[li ..ri]`.
 *
 * Return an array ans where `ans[i]` is the number of same-end substrings of `queries[i]`.
 *
 * A 0-indexed string t of length n is called same-end if it has the same character at both of its ends, i.e.,
 * `t[0] == t[n - 1]`.
 *
 * A substring is a contiguous non-empty sequence of characters within a string.
 *
 * [URL](https://leetcode.com/problems/number-of-same-end-substrings/)
 */
object NumberOfSameEndSubstrings {
    fun sameEndSubstringCount(s: String, queries: Array<IntArray>): IntArray {
        val n = s.length
        val charFreqPrefixSum = Array(26) { IntArray(n) }

        for (i in 0 until n) {
            charFreqPrefixSum[s[i] - 'a'][i]++
        }

        // Convert the frequency array into a prefix sum array
        for (i in 0..25) {
            for (j in 1 until n) {
                charFreqPrefixSum[i][j] += charFreqPrefixSum[i][j - 1]
            }
        }

        val result = IntArray(queries.size)

        for (i in queries.indices) {
            val leftIndex = queries[i][0]
            val rightIndex = queries[i][1]
            var countSameEndSubstrings = 0

            for (charIndex in 0..25) {
                val leftFreq = if ((leftIndex == 0)) {
                    0
                } else {
                    charFreqPrefixSum[charIndex][leftIndex - 1]
                }
                val rightFreq = charFreqPrefixSum[charIndex][rightIndex]
                val frequencyInRange = rightFreq - leftFreq

                countSameEndSubstrings += frequencyInRange * (frequencyInRange + 1) / 2
            }

            result[i] = countSameEndSubstrings
        }

        return result
    }
}