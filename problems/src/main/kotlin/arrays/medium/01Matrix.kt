package arrays.medium

import java.util.*

/**
 * Given an m x n binary matrix mat, return the distance of the nearest 0 for each cell.
 *
 * The distance between two adjacent cells is 1.
 *
 * [URL](https://leetcode.com/problems/01-matrix/)
 */
object `01Matrix` {
    fun updateMatrixTwoWaves(mat: Array<IntArray>): Array<IntArray> {
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

    private val directions = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)
    fun updateMatrixQueue(mat: Array<IntArray>): Array<IntArray> {
        val m = mat.size
        val n = mat[0].size
        val result = Array(m) { IntArray(n) { -1 } }

        val queue = ArrayDeque<Pair<Int, Int>>()
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (mat[i][j] == 0) {
                    queue.offer(i to j)
                }
            }
        }

        var d = 0
        while (queue.isNotEmpty()) {
            val size = queue.size
            for (i in 0 until size) {
                val (x, y) = queue.poll()
                if (result[x][y] != -1) continue
                result[x][y] = d
                for ((dx, dy) in directions) {
                    val newX = x + dx
                    val newY = y + dy
                    if (newX < 0 || newX == m || newY < 0 || newY == n || result[newX][newY] != -1) continue
                    queue.offer(newX to newY)
                }
            }
            d++
        }

        return result
    }
}
