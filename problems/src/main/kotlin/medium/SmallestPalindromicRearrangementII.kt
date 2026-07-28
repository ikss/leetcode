package medium

import kotlin.math.min

/**
 * You are given a palindromic string s and an integer k.
 *
 * Return the k-th lexicographically smallest palindromic permutation of s.
 * If there are fewer than k distinct palindromic permutations, return an empty string.
 *
 * Note: Different rearrangements that yield the same palindromic string are considered identical and are counted once.
 *
 * [URL](https://leetcode.com/problems/smallest-palindromic-rearrangement-ii/)
 */
object SmallestPalindromicRearrangementII {
    fun smallestPalindrome(s: String, k: Long): String {
        val half = s.length / 2
        val counts = IntArray(26)

        for (i in 0..<half) {
            counts[s[i] - 'a']++
        }

        val left = StringBuilder(s.length)
        var startIndex = 1L

        for (pos in 0..<half) {
            for (i in 0..25) {
                if (counts[i] == 0) {
                    continue
                }

                counts[i]--

                val ways = permutations(half - pos - 1, counts, k)
                if (startIndex + ways > k) {
                    left.append('a' + i)
                    break
                }

                counts[i] += 1
                startIndex += ways
            }
        }

        if (left.length < half) {
            return ""
        }

        if (s.length % 2 != 0) {
            left.append(s[half])
        }

        for (i in half - 1 downTo 0) {
            left.append(left[i])
        }

        return left.toString()
    }

    private fun permutations(rem: Int, bucket: IntArray, k: Long): Long {
        var rem = rem
        var ways = 1L
        for (i in 0..25) {
            if (bucket[i] == 0) {
                continue
            }

            ways *= comb(rem.toLong(), bucket[i].toLong(), k)
            if (ways > k) {
                break
            }
            rem -= bucket[i]
        }
        return ways
    }

    private fun comb(n: Long, m: Long, k: Long): Long {
        val m = minOf(m, n - m)
        var res = 1L

        for (i in 1..m) {
            res = (res * (n - i + 1)) / i
            if (res > k) {
                return k + 1
            }
        }
        return res
    }
}
