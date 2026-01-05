package medium

/**
 * You are given an n x n integer matrix. You can do the following operation any number of times:
 * * Choose any two adjacent elements of matrix and multiply each of them by -1.
 *
 * Two elements are considered adjacent if and only if they share a border.
 *
 * Your goal is to maximize the summation of the matrix's elements.
 * Return the maximum sum of the matrix's elements using the operation mentioned above.
 *
 * [URL](https://leetcode.com/problems/maximum-matrix-sum/)
 */
object MaximumMatrixSum {
    fun maxMatrixSum(matrix: Array<IntArray>): Long {
        var result = 0L
        var negCount = 0
        var min = Int.MAX_VALUE
        for (r in matrix) {
            for (n in r) {
                if (n < 0) {
                    negCount++
                }
                val abs = Math.abs(n)
                min = minOf(abs, min)
                result += abs
            }
        }

        if (negCount % 2 != 0) {
            result -= min * 2
        }

        return result
    }
}
