package arrays.medium

import data_structures.GridCell

/**
 * You are given a 0-indexed 2D matrix grid of size m x n, where (r, c) represents:
 * * A land cell if `grid[r][c] = 0`, or
 * * A water cell containing `grid[r][c]` fish, if `grid[r][c] > 0`.
 *
 * A fisher can start at any water cell (r, c) and can do the following operations any number of times:
 * * Catch all the fish at cell (r, c), or
 * * Move to any adjacent water cell.
 *
 * Return the maximum number of fish the fisher can catch if he chooses his starting cell optimally,
 * or 0 if no water cell exists.
 *
 * An adjacent cell of the cell (r, c), is one of the cells (r, c + 1), (r, c - 1), (r + 1, c) or (r - 1, c) if it exists.
 *
 * [URL](https://leetcode.com/problems/maximum-number-of-fish-in-a-grid/)
 */
object MaximumNumberOfFishInGrid {

    private val directions = listOf(1 to 0, -1 to 0, 0 to 1, 0 to -1)

    fun findMaxFish(grid: Array<IntArray>): Int {
        var result = 0
        for (r in grid.indices) {
            for (c in grid[0].indices) {
                if (grid[r][c] > 0) {
                    result = maxOf(result, bfs(r, c, grid))
                }
            }
        }

        return result
    }

    private fun bfs(startr: Int, startc: Int, grid: Array<IntArray>): Int {
        var result = 0

        val queue = java.util.ArrayDeque<GridCell>()
        queue.offer(startr to startc)

        while (queue.isNotEmpty()) {
            val (r, c) = queue.poll()
            result += grid[r][c]
            grid[r][c] = 0

            for ((dr, dc) in directions) {
                val newr = r + dr
                val newc = c + dc
                if (newr in grid.indices && newc in grid[0].indices && grid[newr][newc] > 0) {
                    queue.offer(newr to newc)
                }
            }
        }

        return result
    }
}
