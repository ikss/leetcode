package easy

/**
 * Given a square matrix mat, return the sum of the matrix diagonals.
 *
 * Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal
 * that are not part of the primary diagonal.
 *
 * [URL](https://leetcode.com/problems/matrix-diagonal-sum/)
 */
object MatrixDiagonalSum {
    fun diagonalSum(mat: Array<IntArray>): Int {
        val n = mat.size
        var result = 0
        for (i in 0 until n / 2) {
            val j = n - i - 1
            result += mat[i][i] + mat[j][i] + mat[i][j] + mat[j][j]
        }
        if (n % 2 != 0) {
            result += mat[n / 2][n / 2]
        }
        return result
    }
}
