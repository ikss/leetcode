package arrays.medium

/**
 * Given a 2D grid consists of 0s (land) and 1s (water). An island is a maximal 4-directionally connected group of 0s
 * and a closed island is an island totally (all left, top, right, bottom) surrounded by 1s.
 *
 * Return the number of closed islands.
 *
 * [URL](https://leetcode.com/problems/number-of-closed-islands/)
 */
object NumberOfClosedIslands {
    private val dirs = listOf(0 to -1, 0 to 1, -1 to 0, 1 to 0)

    fun closedIsland(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size

        val visited = Array(m) { BooleanArray(n) }
        var result = 0

        for (i in 0 until m) {
            for (j in 0 until n) {
                if (grid[i][j] == 0 && !visited[i][j] && bfs(i, j, grid, visited)) {
                    result++
                }
            }
        }

        return result
    }

    private fun bfs(i: Int, j: Int, grid: Array<IntArray>, visited: Array<BooleanArray>): Boolean {
        val m = grid.size
        val n = grid[0].size

        val q = java.util.ArrayDeque<Pair<Int, Int>>()
        q.offer(i to j)
        visited[i][j] = true
        var result = true

        while (q.isNotEmpty()) {
            val (x, y) = q.poll()
            for ((dx, dy) in dirs) {
                val r = x + dx
                val c = y + dy

                if (r < 0 || r >= m || c < 0 || c >= n) {
                    result = false
                } else if (grid[r][c] == 0 && !visited[r][c]) {
                    q.offer(r to c)
                    visited[r][c] = true
                }
            }
        }

        return result
    }
}
