package numbers.hard

import kotlin.math.min

/**
 * Given two integers n and k, return the kth lexicographically smallest integer in the range `[1, n]`.
 *
 * [URL](https://leetcode.com/problems/k-th-smallest-in-lexicographical-order/)
 */
object KthSmallestInLexicographicalOrder {
    fun findKthNumber(n: Int, k: Int): Int {
        var curr = 1
        var k = k - 1

        while (k > 0) {
            val steps = calculateSteps(n, curr, curr + 1)
            if (steps <= k) {
                curr += 1
                k -= steps
            } else {
                curr *= 10
                k -= 1
            }
        }

        return curr
    }

    private fun calculateSteps(n: Int, curr: Int, next: Int): Int {
        var steps = 0
        var curr = curr.toLong()
        var next = next.toLong()
        while (curr <= n) {
            steps += (minOf(n + 1L, next) - curr).toInt()
            curr *= 10
            next *= 10
        }
        return steps
    }
}
