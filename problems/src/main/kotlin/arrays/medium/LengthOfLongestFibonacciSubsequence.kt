package arrays.medium

/**
 * A sequence x1, x2, ..., xn is Fibonacci-like if:
 *
 * n >= 3
 * xi + xi+1 == xi+2 for all i + 2 <= n
 * Given a strictly increasing array arr of positive integers forming a sequence, return the length of the longest
 * Fibonacci-like subsequence of arr. If one does not exist, return 0.
 *
 * A subsequence is derived from another sequence arr by deleting any number of elements (including none) from arr,
 * without changing the order of the remaining elements.
 * For example, `[3, 5, 8]` is a subsequence of `[3, 4, 5, 6, 7, 8]`.
 *
 * [URL](https://leetcode.com/problems/length-of-longest-fibonacci-subsequence/)
 */
object LengthOfLongestFibonacciSubsequence {
    fun lenLongestFibSubseq(arr: IntArray): Int {
        if (arr.size < 3) return arr.size
        val set = arr.toSet()
        var result = 0

        for (i in arr.indices) {
            for (ni in i + 1 until arr.size) {
                result = maxOf(result, findSeq(i, ni, arr, set))
            }
        }

        return result
    }

    private fun findSeq(i: Int, ni: Int, arr: IntArray, set: Set<Int>): Int {
        var result = 2

        var start = arr[i]
        var next = arr[ni]

        while (next + start in set) {
            result++
            val temp = start
            start = next
            next += temp
        }

        return result
    }
}