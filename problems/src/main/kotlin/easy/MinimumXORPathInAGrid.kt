package easy

import java.util.*

/**
 * You are given a 2D integer array grid of size m * n.
 *
 * You start at the top-left cell (0, 0) and want to reach the bottom-right cell (m - 1, n - 1).
 *
 * At each step, you may move either right or down.
 *
 * The cost of a path is defined as the bitwise XOR of all the values in the cells along that path,
 * including the start and end cells.
 *
 * Return the minimum possible XOR value among all valid paths from (0, 0) to (m - 1, n - 1).
 *
 * [URL](https://leetcode.com/problems/minimum-xor-path-in-a-grid/)
 */
object MinimumXORPathInAGrid {
    fun minCost(grid: Array<IntArray>): Int {
        val cols = grid[0].size
        val dp = Array(cols) { BitSet(1024) }
        dp[0].set(grid[0][0])

        for (r in grid.indices) {
            for (c in 0 until cols) {
                if (r == 0 && c == 0) continue

                val predecessors = dp[c]
                if (c > 0) {
                    predecessors.or(dp[c - 1])
                }

                val current = BitSet(1024)
                val value = grid[r][c]

                var x = predecessors.nextSetBit(0)
                while (x >= 0) {
                    current.set(x xor value)
                    x = predecessors.nextSetBit(x + 1)
                }

                dp[c] = current
            }
        }

        return dp[cols - 1].nextSetBit(0)
    }
}