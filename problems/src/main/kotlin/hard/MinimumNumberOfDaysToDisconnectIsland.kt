package hard

import data_structures.GridCell

/**
 * You are given an m x n binary grid grid where 1 represents land and 0 represents water.
 * An island is a maximal 4-directionally (horizontal or vertical) connected group of 1's.
 *
 * The grid is said to be connected if we have exactly one island, otherwise is said disconnected.
 *
 * In one day, we are allowed to change any single land cell (1) into a water cell (0).
 *
 * Return the minimum number of days to disconnect the grid.
 *
 * [URL](https://leetcode.com/problems/minimum-number-of-days-to-disconnect-island/)
 */
object MinimumNumberOfDaysToDisconnectIsland {
    private val directions = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)

    fun minDays(grid: Array<IntArray>): Int {
        if (checkIslandsCount(grid) != 1) return 0
        
        for (r in grid.indices) {
            for (c in grid[0].indices) {
                if (grid[r][c] != 1) continue
                grid[r][c] = 0
                if (checkIslandsCount(grid) != 1) return 1
                grid[r][c] = 1
            }
        }
        
        return 2
    }

    private fun checkIslandsCount(grid: Array<IntArray>): Int {
        var result = 0

        val visited = HashSet<GridCell>()
        val queue = java.util.ArrayDeque<GridCell>()

        for (r in grid.indices) {
            for (c in grid[0].indices) {
                if (grid[r][c] != 1 || !visited.add(r to c)) continue
                result++
                queue.offer(r to c)

                while (queue.isNotEmpty()) {
                    val (currRow, currCol) = queue.poll()

                    for ((dr, dc) in directions) {
                        val newRow = currRow + dr
                        val newCol = currCol + dc

                        if (newRow in grid.indices && newCol in grid[0].indices && grid[newRow][newCol] == 1 && visited.add(newRow to newCol)) {
                            queue.offer(newRow to newCol)
                        }
                    }
                }
            }
        }

        return result
    }
}
