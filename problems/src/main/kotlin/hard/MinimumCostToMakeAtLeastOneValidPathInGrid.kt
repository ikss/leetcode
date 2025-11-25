package hard

import java.util.*

/**
 * Given an m x n grid. Each cell of the grid has a sign pointing to the next cell you should visit if
 * you are currently in this cell. The sign of `grid[i][j]` can be:
 * * 1 which means go to the cell to the right. (i.e go from `grid[i][j]` to `grid[i][j + 1]`)
 * * 2 which means go to the cell to the left. (i.e go from `grid[i][j]` to `grid[i][j - 1]`)
 * * 3 which means go to the lower cell. (i.e go from `grid[i][j]` to `grid[i + 1][j]`)
 * * 4 which means go to the upper cell. (i.e go from `grid[i][j]` to `grid[i - 1][j]`)
 *
 * Notice that there could be some signs on the cells of the grid that point outside the grid.
 *
 * You will initially start at the upper left cell (0, 0). A valid path in the grid is a path that starts
 * from the upper left cell (0, 0) and ends at the bottom-right cell (m - 1, n - 1) following the signs on the grid.
 * The valid path does not have to be the shortest.
 *
 * You can modify the sign on a cell with cost = 1. You can modify the sign on a cell one time only.
 *
 * Return the minimum cost to make the grid have at least one valid path.
 *
 * [URL](https://leetcode.com/problems/minimum-cost-to-make-at-least-one-valid-path-in-a-grid/)
 */
private typealias Point = Pair<Int, Int>

object MinimumCostToMakeAtLeastOneValidPathInGrid {
    private val directions = listOf(0 to 1, 0 to -1, 1 to 0, -1 to 0)

    fun minCost(grid: Array<IntArray>): Int {
        val start = 0 to 0

        val costs = Array(grid.size) { IntArray(grid[0].size) { Int.MAX_VALUE } }
        costs[0][0] = 0
        val queue = PriorityQueue<Pair<Point, Int>>(compareBy { it.second })
        queue.offer(start to 0)

        while (queue.isNotEmpty()) {
            val (curr, currCost) = queue.poll()
            val (currRow, currCol) = curr
            if (currRow == grid.size - 1 && currCol == grid[0].size - 1) {
                return currCost
            }

            val nextDir = grid[currRow][currCol] - 1

            for (i in directions.indices) {
                val newCost = currCost + if (i == nextDir) 0 else 1
                val (dr, dc) = directions[i]

                val newRow = currRow + dr
                val newCol = currCol + dc

                if (newRow !in grid.indices || newCol !in grid[0].indices) continue

                val seenCost = costs[newRow][newCol]

                if (newCost >= seenCost) continue
                costs[newRow][newCol] = newCost
                queue.offer((newRow to newCol) to newCost)
            }
        }

        return -1
    }
}
