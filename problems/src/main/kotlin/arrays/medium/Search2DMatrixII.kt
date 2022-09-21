package arrays.medium

/**
 * Write an efficient algorithm that searches for a value target in an m x n integer matrix _matrix_.
 * This matrix has the following properties:
 *  * Integers in each row are sorted in ascending from left to right.
 *  * Integers in each column are sorted in ascending from top to bottom.
 *
 * [URL](https://leetcode.com/problems/search-a-2d-matrix-ii/
 */
object Search2DMatrixII {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        var col = matrix[0].size - 1
        var row = 0
        while (col >= 0 && row <= matrix.size - 1) {
            if (target == matrix[row][col]) {
                return true
            } else if (target < matrix[row][col]) {
                col--
            } else if (target > matrix[row][col]) {
                row++
            }
        }
        return false
    }
}
