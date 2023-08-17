package arrays.medium

/**
 * Given an m x n binary matrix mat, return the distance of the nearest 0 for each cell.
 *
 * The distance between two adjacent cells is 1.
 *
 * [URL](https://leetcode.com/problems/01-matrix/)
 */
object `01Matrix` {
    fun updateMatrix(mat: Array<IntArray>): Array<IntArray> {
        val m = mat.size
        val n = mat[0].size
        val maxValue = m + n

        for (r in 0 until m) {
            for (c in 0 until n) {
                if (mat[r][c] == 0) continue
                val top = if (r > 0) mat[r - 1][c] else maxValue
                val left = if (c > 0) mat[r][c - 1] else maxValue
                mat[r][c] = minOf(top, left) + 1
            }
        }
        for (r in m - 1 downTo 0) {
            for (c in n - 1 downTo 0) {
                if (mat[r][c] == 0) continue
                val bottom = if (r < m - 1) mat[r + 1][c] else maxValue
                val right = if (c < n - 1) mat[r][c + 1] else maxValue

                mat[r][c] = minOf(mat[r][c], minOf(bottom, right) + 1)
            }
        }
        return mat
    }
}
