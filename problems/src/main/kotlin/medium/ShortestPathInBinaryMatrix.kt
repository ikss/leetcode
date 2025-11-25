package medium

/**
 * Given an m x n binary matrix mat, return the distance of the nearest 0 for each cell.
 *
 * The distance between two adjacent cells is 1.
 *
 * [URL](https://leetcode.com/problems/shortest-path-in-binary-matrix/)
 */
object ShortestPathInBinaryMatrix {
    private val directions = listOf(-1 to -1, -1 to 0, -1 to 1, 0 to -1, 0 to 1, 1 to -1, 1 to 0, 1 to 1)

    fun shortestPathBinaryMatrix(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size

        if (grid[0][0] == 1 || grid[m - 1][n - 1] == 1) return -1

        val bfs = java.util.ArrayDeque<Pair<Int, Int>>()
        bfs.offer(0 to 0)

        var result = 1
        while (bfs.isNotEmpty()) {
            val size = bfs.size

            for (i in 0 until size) {
                val (x, y) = bfs.poll()
                if (grid[x][y] > 0) continue
                grid[x][y] = result
                if (x == m - 1 && y == n - 1) {
                    return result
                }

                for ((diffX, diffY) in directions) {
                    val newX = x + diffX
                    val newY = y + diffY

                    if (newX < 0 || newX >= m || newY < 0 || newY >= n || grid[newX][newY] > 0) continue
                    bfs.offer(newX to newY)
                }
            }
            result++

        }
        return -1
    }
}
