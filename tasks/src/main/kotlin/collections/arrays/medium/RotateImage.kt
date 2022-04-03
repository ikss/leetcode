package collections.arrays.medium

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
        for (curLevel in 0..matrix.size / 2) {
            for (i in curLevel until maxIndex - curLevel) {
                val tmp = matrix[curLevel][i]
                matrix[curLevel][i] = matrix[maxIndex - i][curLevel]
                matrix[maxIndex - i][curLevel] = matrix[maxIndex - curLevel][maxIndex - i]
                matrix[maxIndex - curLevel][maxIndex - i] = matrix[i][maxIndex - curLevel]
                matrix[i][maxIndex - curLevel] = tmp
            }
        }
    }
}
