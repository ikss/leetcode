package arrays.hard

import java.util.*

/**
 * Given a matrix and a target, return the number of non-empty submatrices that sum to target.
 *
 * A submatrix x1, y1, x2, y2 is the set of all cells` matrix[x][y]` with x1 <= x <= x2 and y1 <= y <= y2.
 *
 * Two submatrices (x1, y1, x2, y2) and (x1', y1', x2', y2') are different
 * if they have some coordinate that is different: for example, if x1 != x1'.
 *
 * [URL](https://leetcode.com/problems/number-of-submatrices-that-sum-to-target/)
 */
object NumberOfSubmatricesThatSumToTarget {
    fun numSubmatrixSumTarget(matrix: Array<IntArray>, target: Int): Int {
        var result = 0
        val m = matrix.size
        val n = matrix[0].size + 1
        val prefixSum = Array(m) { IntArray(n) }
        for (i in prefixSum.indices) {
            for (j in 1 until prefixSum[0].size) {
                prefixSum[i][j] = prefixSum[i][j - 1] + matrix[i][j - 1]
            }
        }
        for (i in 0 until n) {
            for (j in i + 1 until n) {
                val counter = mutableMapOf(0 to 1)
                var cur = 0
                for (k in 0 until m) {
                    cur += prefixSum[k][j] - prefixSum[k][i]
                    result += counter.getOrDefault(cur - target, 0)
                    counter[cur] = counter.getOrDefault(cur, 0) + 1
                }
            }
        }
        return result
    }
}
