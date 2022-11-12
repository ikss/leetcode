package arrays.hard

import java.util.*

/**
 * You are given an m x n integer matrix grid where each cell is either 0 (empty) or 1 (obstacle).
 * You can move up, down, left, or right from and to an empty cell in one step.
 *
 * Return the minimum number of steps to walk from the upper left corner (0, 0) to the lower right corner (m - 1, n - 1)
 * given that you can eliminate at most k obstacles. If it is not possible to find such walk return -1.
 *
 * [URL](https://leetcode.com/problems/shortest-path-in-a-grid-with-obstacles-elimination/)
 */
object ShortestPathInGridWithObstaclesElimination {
    private val dirs = intArrayOf(0, 1, 0, -1, 0)

    fun shortestPath(grid: Array<IntArray>, k: Int): Int {
        val m = grid.size
        val n = grid[0].size
        if (k >= m + n - 2) return m + n - 2 // if we can go by manhattan distance -> let's go
        val visited = Array(m) { Array(n) { BooleanArray(k + 1) } }
        val q = LinkedList<IntArray>()
        q.offer(intArrayOf(0, 0, k, 0)) // r, c, k, dist
        visited[0][0][k] = true
        while (!q.isEmpty()) {
            val (r, c, curK, dist) = q.poll()
            if (r == m - 1 && c == n - 1) return dist // Found the result
            for (i in 0..3) {
                val nr = r + dirs[i]
                val nc = c + dirs[i + 1]
                if (nr < 0 || nr == m || nc < 0 || nc == n) continue  // skip out of bound cells!
                val newK = curK - grid[nr][nc]
                if (newK >= 0 && !visited[nr][nc][newK]) {
                    visited[nr][nc][newK] = true
                    q.offer(intArrayOf(nr, nc, newK, dist + 1))
                }
            }
        }
        return -1 // Not found
    }
}

fun main() {
    val grid = arrayOf(
        intArrayOf(0, 0, 0),
        intArrayOf(1, 1, 0),
        intArrayOf(0, 0, 0),
        intArrayOf(0, 1, 1),
        intArrayOf(0, 0, 0),
    )
    val k = 1
    println(ShortestPathInGridWithObstaclesElimination.shortestPath(grid, k))
}