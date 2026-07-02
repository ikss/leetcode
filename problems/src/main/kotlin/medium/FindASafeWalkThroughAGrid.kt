package medium

import java.util.*

/**
 * You are given an m x n binary matrix grid and an integer health.
 *
 * You start on the upper-left corner (0, 0) and would like to get to the lower-right corner (m - 1, n - 1).
 *
 * You can move up, down, left, or right from one cell to another adjacent cell as long as your health remains positive.
 *
 * Cells (i, j) with `grid[i][j] = 1` are considered unsafe and reduce your health by 1.
 *
 * Return true if you can reach the final cell with a health value of 1 or more, and false otherwise.
 *
 * [URL](https://leetcode.com/problems/find-a-safe-walk-through-a-grid/)
 */
object FindASafeWalkThroughAGrid {
    private val directions = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)

    fun findSafeWalkDijkstra(grid: List<List<Int>>, health: Int): Boolean {
        val rows = grid.size
        val cols = grid[0].size

        val seen = Array(rows) { IntArray(cols) { -1 } }
        val startHealth = if (grid[0][0] == 1) health - 1 else health
        if (startHealth <= 0) return false
        seen[0][0] = startHealth

        val queue = PriorityQueue<IntArray> { o1, o2 -> o2[2] - o1[2] }
        queue.offer(intArrayOf(0, 0, startHealth))

        while (queue.isNotEmpty()) {
            val (currr, currc, currh) = queue.poll()

            if (currr == rows - 1 && currc == cols - 1) {
                return true
            }

            for ((dr, dc) in directions) {
                val newr = currr + dr
                val newc = currc + dc

                if (newr !in 0 until rows || newc !in 0 until cols) {
                    continue
                }
                val seenHealth = seen[newr][newc]
                val newHealth = currh - (if (grid[newr][newc] == 1) 1 else 0)
                if (seenHealth >= newHealth) continue

                if (newHealth == 0) continue
                seen[newr][newc] = newHealth

                queue.offer(intArrayOf(newr, newc, newHealth))
            }
        }

        return false
    }
}
