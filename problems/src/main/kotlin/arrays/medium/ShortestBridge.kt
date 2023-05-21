package arrays.medium

/**
 * You are given an n x n binary matrix grid where 1 represents land and 0 represents water.
 *
 * An island is a 4-directionally connected group of 1's not connected to any other 1's.
 * There are exactly two islands in grid.
 *
 * You may change 0's to 1's to connect the two islands to form one island.
 *
 * Return the smallest number of 0's you must flip to connect the two islands.
 *
 * [URL](https://leetcode.com/problems/shortest-bridge/)
 */
object ShortestBridge {
    private val moves = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)

    fun shortestBridge(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size
        val land = findLand(grid)

        val queue = java.util.ArrayDeque<Pair<Int, Int>>()
        queue.add(land)

        val firstLand = java.util.ArrayDeque<Pair<Int, Int>>()
        while (queue.isNotEmpty()) {
            val (i, j) = queue.poll()
            if (grid[i][j] == 2) continue
            grid[i][j] = 2

            for ((difx, dify) in moves) {
                val newx = difx + i
                val newy = dify + j

                if (newx >= 0 && newx < m && newy >= 0 && newy < n) {
                    if (grid[newx][newy] == 0) {
                        firstLand.add(newx to newy)
                    } else {
                        queue.add(newx to newy)
                    }
                }
            }
        }

        var step = 0

        while (firstLand.isNotEmpty()) {
            val size = firstLand.size

            for (el in 0 until size) {
                val (i, j) = firstLand.poll()
                if (grid[i][j] == 1) return step
                if (grid[i][j] == 2) continue
                grid[i][j] = 2

                for ((difx, dify) in moves) {
                    val newx = difx + i
                    val newy = dify + j

                    if (newx >= 0 && newx < m && newy >= 0 && newy < n && grid[newx][newy] != 2) {
                        firstLand.add(newx to newy)
                    }
                }
            }
            step++
        }
        return -1
    }

    private fun findLand(grid: Array<IntArray>): Pair<Int, Int> {
        for (i in grid.indices) {
            for (j in grid[0].indices) {
                if (grid[i][j] == 1) {
                    return i to j
                }
            }
        }
        return 0 to 0
    }
}