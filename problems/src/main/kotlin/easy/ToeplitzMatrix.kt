package easy

/**
 * Given an m x n matrix, return true if the matrix is Toeplitz. Otherwise, return false.
 *
 * A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same elements.
 *
 * [URL](https://leetcode.com/problems/toeplitz-matrix/)
 */
object ToeplitzMatrix {
    fun isToeplitzMatrix(matrix: Array<IntArray>): Boolean {
        for (r in matrix.indices) {
            for (c in matrix[0].indices) {
                if (r > 0 && c > 0 && matrix[r - 1][c - 1] != matrix[r][c]) {
                    return false
                }
            }
        }
        return true
    }
}