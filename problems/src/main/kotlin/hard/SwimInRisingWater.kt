package hard

import java.util.*

/**
 * You are given an n x n integer matrix grid where each value `grid[i][j]`
 * represents the elevation at that point (i, j).
 *
 * It starts raining, and water gradually rises over time. At time t, the water level is t,
 * meaning any cell with elevation less than equal to t is submerged or reachable.
 *
 * You can swim from a square to another 4-directionally adjacent square if and only if
 * the elevation of both squares individually are at most t. You can swim infinite distances in zero time.
 * Of course, you must stay within the boundaries of the grid during your swim.
 *
 * Return the minimum time until you can reach the bottom right square (n - 1, n - 1)
 * if you start at the top left square (0, 0).
 *
 * [URL](https://leetcode.com/problems/construct-target-array-with-multiple-sums/)
 */
object SwimInRisingWater {
    private val directions = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)

    fun swimInWater(grid: Array<IntArray>): Int {
        val queue = PriorityQueue<IntArray> { a1, a2 -> a1[2] - a2[2] }
        queue.offer(intArrayOf(0, 0, grid[0][0]))
        var currTime = 0

        while (queue.isNotEmpty()) {
            val (r, c, time) = queue.poll()

            currTime = maxOf(currTime, time)
            if (r == grid.size - 1 && c == grid[0].size - 1) {
                break
            }
            grid[r][c] = -1
            for ((dr, dc) in directions) {
                val newr = r + dr
                val newc = c + dc
                if (newr !in grid.indices || newc !in grid[0].indices || grid[newr][newc] == -1) continue
                queue.offer(intArrayOf(newr, newc, grid[newr][newc]))
            }

        }
        return currTime
    }
}
