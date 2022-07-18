package data_structures.arrays.hard

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
        var res = 0
        val m = matrix.size
        val n = matrix[0].size
        for (i in 0 until m) {
            for (j in 1 until n) {
                matrix[i][j] += matrix[i][j - 1]
            }
        }

        val counter = mutableMapOf<Int, Int>()
        for (i in 0 until n) {
            for (j in i until n) {
                counter.clear()
                counter[0] = 1
                var cur = 0
                for (k in 0 until m) {
                    cur += matrix[k][j] - if (i > 0) matrix[k][i - 1] else 0
                    res += counter.getOrDefault(cur - target, 0)
                    counter[cur] = counter.getOrDefault(cur, 0) + 1
                }
            }
        }
        return res
    }
}
