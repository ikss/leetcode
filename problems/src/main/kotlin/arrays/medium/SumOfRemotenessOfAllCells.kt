package arrays.medium

/**
 * You are given a 0-indexed matrix grid of order n * n. Each cell in this matrix has a value `grid[i][j]`,
 * which is either a positive integer or -1 representing a blocked cell.
 *
 * You can move from a non-blocked cell to any non-blocked cell that shares an edge.
 *
 * For any cell (i, j), we represent its remoteness as `R[i][j]` which is defined as the following:
 *
 * * If the cell (i, j) is a non-blocked cell, R[i][j]` is the sum of the values `grid[x][y]` such that there is no path
 * from the non-blocked cell (x, y) to the cell (i, j).
 * * For blocked cells, `R[i][j] == 0`.
 *
 * Return the sum of `R[i][j]` over all cells.
 *
 * [URL](https://leetcode.com/problems/sum-of-remoteness-of-all-cells/)
 */
object SumOfRemotenessOfAllCells {
    private val directions = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)

    fun sumRemoteness(grid: Array<IntArray>): Long {
        var totalSum = 0L

        val visited = Array(grid.size) { BooleanArray(grid[0].size) }
        for (r in grid.indices) {
            for (c in grid[0].indices) {
                if (grid[r][c] > 0) {
                    totalSum += grid[r][c]
                } else {
                    visited[r][c] = true
                }
            }
        }

        var result = 0L

        for (r in grid.indices) {
            for (c in grid[0].indices) {
                if (grid[r][c] > 0 && !visited[r][c]) {
                    result += bfs(r, c, grid, visited, totalSum)
                }
            }
        }

        return result
    }

    private fun bfs(r: Int, c: Int, grid: Array<IntArray>, visited: Array<BooleanArray>, totalSum: Long): Long {
        var localSum = 0L
        var localSeen = 0
        val queue = java.util.ArrayDeque<Pair<Int, Int>>()
        visited[r][c] = true
        queue.offer(r to c)

        while (queue.isNotEmpty()) {
            val (curr, curc) = queue.poll()
            localSeen++
            localSum += grid[curr][curc]

            for ((dr, dc) in directions) {
                val newr = curr + dr
                val newc = curc + dc

                if (newr !in grid.indices || newc !in grid[0].indices || visited[newr][newc]) {
                    continue
                }
                visited[newr][newc] = true
                queue.offer(newr to newc)
            }
        }

        return (totalSum - localSum) * localSeen
    }
}
