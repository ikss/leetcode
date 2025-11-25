package medium

import java.util.*

/**
 * You are a hiker preparing for an upcoming hike. You are given heights, a 2D array of size rows x columns,
 * where `heights[row][col]` represents the height of cell (row, col). You are situated in the top-left cell, (0, 0),
 * and you hope to travel to the bottom-right cell, (rows-1, columns-1) (i.e., 0-indexed).
 * You can move up, down, left, or right, and you wish to find a route that requires the minimum effort.
 *
 * A route's effort is the maximum absolute difference in heights between two consecutive cells of the route.
 *
 * Return the minimum effort required to travel from the top-left cell to the bottom-right cell.
 *
 * [URL](https://leetcode.com/problems/path-with-minimum-effort/)
 */
object PathWithMinimumEffort {
    private val directions = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)

    fun minimumEffortPath(heights: Array<IntArray>): Int {
        val m = heights.size
        val n = heights[0].size
        val efforts = Array(m) { IntArray(n) { Int.MAX_VALUE } }
        efforts[0][0] = 0
        val pq = PriorityQueue(Comparator.comparingInt { a: IntArray -> a[0] })
        pq.offer(IntArray(3))

        while (!pq.isEmpty()) {
            val (effort, x, y) = pq.poll()
            if (x == m - 1 && y == n - 1) {
                return effort
            }
            for ((dx, dy) in directions) {
                val r = x + dx
                val c = y + dy
                if (r < 0 || r >= m || c < 0 || c >= n) continue
                val nextEffort = maxOf(effort, Math.abs((heights[r][c] - heights[x][y])))
                if (efforts[r][c] <= nextEffort || efforts[m - 1][n - 1] <= nextEffort) continue
                efforts[r][c] = nextEffort
                pq.offer(intArrayOf(nextEffort, r, c))
            }
        }
        return -1
    }
}