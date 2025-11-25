package hard

import java.util.*

/**
 * You are given a rows x cols matrix grid representing a field of cherries where `grid[i][j]` represents the number of
 * cherries that you can collect from the (i, j) cell.
 *
 * You are given a 0-indexed 2D integer array grid of size m x n. Each cell has one of two values:
 * * 0 represents an empty cell,
 * * 1 represents an obstacle that may be removed.
 *
 * You can move up, down, left, or right from and to an empty cell.
 *
 * Return the minimum number of obstacles to remove so you can move from the upper left corner (0, 0)
 * to the lower right corner (m - 1, n - 1).
 *
 * [URL](https://leetcode.com/problems/minimum-obstacle-removal-to-reach-corner/)
 */
object MinimumObstacleRemovalToReachCorner {
    private val directions = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)

    fun minimumObstacles(grid: Array<IntArray>): Int {
        val queue = PriorityQueue<Pair<Int, Pair<Int, Int>>> { it1, it2 -> it1.first - it2.first }
        queue.offer(0 to (0 to 0))

        val visited = Array(grid.size) { BooleanArray(grid[0].size) { false } }

        while (queue.isNotEmpty()) {
            val (cost, cell) = queue.poll()
            val (r, c) = cell
            if (r == grid.size - 1 && c == grid[0].size - 1) {
                return cost
            }

            for ((dr, dc) in directions) {
                val newr = r + dr
                val newc = c + dc
                if (newr in grid.indices && newc in grid[0].indices && !visited[newr][newc]) {
                    visited[newr][newc] = true
                    val newCost = cost + grid[newr][newc]
                    queue.offer(newCost to (newr to newc))
                }
            }
        }
        return -1
    }
}