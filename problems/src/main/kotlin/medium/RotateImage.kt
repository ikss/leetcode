package medium

/**
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
 * DO NOT allocate another 2D matrix and do the rotation.
 *
 * [URL](https://leetcode.com/problems/rotate-image/)
 */
object RotateImage {
    fun rotateFours(matrix: Array<IntArray>) {
        val maxIndex = matrix.size - 1
        for (i in 0..matrix.size / 2) {
            for (j in i until maxIndex - i) {
                val tmp = matrix[i][j]
                matrix[i][j] = matrix[maxIndex - j][i]
                matrix[maxIndex - j][i] = matrix[maxIndex - i][maxIndex - j]
                matrix[maxIndex - i][maxIndex - j] = matrix[j][maxIndex - i]
                matrix[j][maxIndex - i] = tmp
            }
        }
    }

    fun rotateTransposeReverse(matrix: Array<IntArray>) {
        transpose(matrix)
        reverse(matrix)
    }

    private fun transpose(matrix: Array<IntArray>) {
        val n = matrix.size - 1
        for (i in 1..n) {
            for (j in 0..i) {
                val tmp = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = tmp
            }
        }
    }

    private fun reverse(matrix: Array<IntArray>) {
        val n = matrix.size - 1
        for (i in 0..n) {
            for (j in 0..n / 2) {
                val tmp = matrix[i][j]
                matrix[i][j] = matrix[i][n - j]
                matrix[i][n - j] = tmp
            }
        }
    }
}
