package arrays.medium

/**
 * You are given an m x n binary matrix grid, where 0 represents a sea cell and 1 represents a land cell.
 *
 * A move consists of walking from one land cell to another adjacent (4-directionally) land cell or walking off the boundary of the grid.
 *
 * Return the number of land cells in grid for which we cannot walk off the boundary of the grid in any number of moves.
 *
 * [URL](https://leetcode.com/problems/number-of-enclaves/)
 */
object NumberOfEnclaves {
    private val directions = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)

    fun numEnclaves(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size

        var result = 0

        for (i in 0 until m) {
            bfs(grid, i, 0)
            bfs(grid, i, n - 1)
        }
        for (j in 0 until n) {
            bfs(grid, 0, j)
            bfs(grid, m - 1, j)
        }
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (grid[i][j] == 1) result++
            }
        }
        return result
    }

    private fun bfs(grid: Array<IntArray>, i: Int, j: Int) {
        if (grid[i][j] == 0) return
        grid[i][j] = 0
        val q = java.util.ArrayDeque<Pair<Int, Int>>()
        q.offer(i to j)

        while (q.isNotEmpty()) {
            val (x, y) = q.poll()
            for ((dx, dy) in directions) {
                val nx = x + dx
                val ny = y + dy

                if (nx < 0 || nx == grid.size || ny < 0 || ny == grid[0].size) {
                    continue
                }

                if (grid[nx][ny] == 0) continue
                grid[nx][ny] = 0
                q.offer(nx to ny)
            }
        }
    }
}
