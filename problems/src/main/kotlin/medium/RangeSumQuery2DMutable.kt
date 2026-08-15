package medium

/**
 * Given a 2D matrix matrix, handle multiple queries of the following types:
 * 1. Update the value of a cell in matrix.
 * 2. Calculate the sum of the elements of matrix inside the rectangle defined by its upper left corner (row1, col1)
 * and lower right corner (row2, col2).
 *
 * Implement the NumMatrix class:
 * * NumMatrix(int[][] matrix) Initializes the object with the integer matrix matrix.
 * * void update(int row, int col, int val) Updates the value of `matrix[row][col]` to be val.
 * * int sumRegion(int row1, int col1, int row2, int col2) Returns the sum of the elements of matrix inside the
 * rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2).
 *
 * [URL](https://leetcode.com/problems/longest-balanced-substring-i/)
 */
object RangeSumQuery2DMutable {
    class NumMatrix(val matrix: Array<IntArray>) {
        val prefixRowSums = Array(matrix.size) { IntArray(matrix[0].size) }

        init {
            for (i in 0 until matrix.size) {
                for (j in 0 until matrix[0].size) {
                    if (j == 0) {
                        prefixRowSums[i][0] = matrix[i][0]
                        continue
                    }
                    prefixRowSums[i][j] = matrix[i][j] + prefixRowSums[i][j - 1]
                }
            }
        }

        fun update(row: Int, col: Int, `val`: Int) {
            val diff = `val` - matrix[row][col]
            if (diff == 0) return

            matrix[row][col] = `val`

            for (c in col until matrix[0].size) {
                prefixRowSums[row][c] += diff
            }
        }

        fun sumRegion(row1: Int, col1: Int, row2: Int, col2: Int): Int {
            var result = 0

            for (r in row1..row2) {
                result += prefixRowSums[r][col2] - prefixRowSums[r][col1] + matrix[r][col1]
            }

            return result
        }

    }

}
