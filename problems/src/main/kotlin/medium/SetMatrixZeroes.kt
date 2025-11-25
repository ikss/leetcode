package medium

/**
 * Given an m x n integer matrix _matrix_, if an element is 0, set its entire row and column to 0's.
 *
 * You must do it in place.
 *
 * [URL](https://leetcode.com/problems/set-matrix-zeroes/)
 */
object SetMatrixZeroes {

    fun setZeroes(matrix: Array<IntArray>) {
        var isCol = false
        val r = matrix.size
        val c = matrix[0].size
        for (i in 0 until r) {
            if (matrix[i][0] == 0) {
                isCol = true
            }
            for (j in 1 until c) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0
                    matrix[i][0] = 0
                }
            }
        }

        for (i in 1 until r) {
            for (j in 1 until c) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0
                }
            }
        }

        if (matrix[0][0] == 0) {
            for (j in 0 until c) {
                matrix[0][j] = 0
            }
        }

        if (isCol) {
            for (i in 0 until r) {
                matrix[i][0] = 0
            }
        }
    }
}
