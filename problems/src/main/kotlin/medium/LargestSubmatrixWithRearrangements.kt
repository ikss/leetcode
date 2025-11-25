package medium

/**
 * You are given a binary matrix _matrix_ of size m x n, and you are allowed to rearrange the columns
 * of the matrix in any order.
 *
 * Return the area of the largest submatrix within matrix where every element of the submatrix
 * is 1 after reordering the columns optimally.
 *
 * [URL](https://leetcode.com/problems/largest-submatrix-with-rearrangements/)
 */
object LargestSubmatrixWithRearrangements {
    fun largestSubmatrix(matrix: Array<IntArray>): Int {
        val m = matrix.size
        val n = matrix[0].size
        var ans = 0
        for (row in 0 until m) {
            for (col in 0 until n) {
                if (matrix[row][col] != 0 && row > 0) {
                    matrix[row][col] += matrix[row - 1][col]
                }
            }
            val currRow = matrix[row].sortedDescending()
            for (i in 0 until n) {
                ans = maxOf(ans, currRow[i] * (i + 1))
            }
        }
        return ans
    }
}
