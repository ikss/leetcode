package data_structures.arrays.medium

/**
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
 * DO NOT allocate another 2D matrix and do the rotation.
 *
 * [URL](https://leetcode.com/problems/rotate-image/)
 */
object RotateImage {
    fun rotate(matrix: Array<IntArray>) {
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
}
