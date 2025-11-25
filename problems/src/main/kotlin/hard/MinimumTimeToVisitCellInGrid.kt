package hard

import java.util.*

/**
 * You are given a m x n matrix grid consisting of non-negative integers where `grid[row][col]` represents the minimum
 * time required to be able to visit the cell (row, col), which means you can visit the cell (row, col) only when the
 * time you visit it is greater than or equal to `grid[row][col]`.
 *
 * You are standing in the top-left cell of the matrix in the 0th second, and you must move to any adjacent cell in the
 * four directions: up, down, left, and right. Each move you make takes 1 second.
 *
 * Return the minimum time required in which you can visit the bottom-right cell of the matrix. If you cannot visit the
 * bottom-right cell, then return -1.
 *
 * [URL](https://leetcode.com/problems/minimum-time-to-visit-a-cell-in-a-grid/)
 */
object MinimumTimeToVisitCellInGrid {
    private val directions = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)

    fun minimumTime(grid: Array<IntArray>): Int {
        if (!((grid[0].size > 1 && grid[0][1] <= 1) || (grid.size > 1 && grid[1][0] <= 1))) {
            return -1
        }
        val visited = Array(grid.size) { IntArray(grid[0].size) { -1 } }
        visited[0][0] = 0

        val queue = PriorityQueue<Pair<Int, Pair<Int, Int>>> { el1, el2 -> el1.first - el2.first }
        queue.offer(0 to (0 to 0))

        while (queue.isNotEmpty()) {
            val (time, curr) = queue.poll()
            val (r, c) = curr
            if (r == grid.size - 1 && c == grid[0].size - 1) return time

            for ((dr, dc) in directions) {
                val newr = r + dr
                val newc = c + dc
                if (newr !in grid.indices || newc !in grid[0].indices) {
                    continue
                }
                if (visited[newr][newc] != -1) continue
                val newTime = getTime(time, grid[newr][newc])
                visited[newr][newc] = newTime
                queue.offer(newTime to (newr to newc))
            }
        }
        return -1
    }

    private fun getTime(timeStart: Int, timeEnd: Int): Int {
        if (timeStart + 1 >= timeEnd) {
            return timeStart + 1
        }
        val delta = timeEnd - timeStart
        if (delta % 2 == 0) {
            return timeEnd + 1
        }
        return timeEnd
    }
}
