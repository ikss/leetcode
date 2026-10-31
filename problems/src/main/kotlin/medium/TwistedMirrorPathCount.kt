package medium

/**
 * Given an m x n binary grid grid where:
 * * `grid[i][j] == 0` represents an empty cell, and
 * * `grid[i][j] == 1` represents a mirror.
 *
 * A robot starts at the top-left corner of the grid (0, 0) and wants to reach the bottom-right corner (m - 1, n - 1).
 * It can move only right or down. If the robot attempts to move into a mirror cell, it is reflected before entering that cell:
 * * If it tries to move right into a mirror, it is turned down and moved into the cell directly below the mirror.
 * * If it tries to move down into a mirror, it is turned right and moved into the cell directly to the right of the mirror.
 *
 * If this reflection would cause the robot to move outside the grid boundaries, the path is considered invalid and should not be counted.
 *
 * Return the number of unique valid paths from (0, 0) to (m - 1, n - 1).
 *
 * Since the answer may be very large, return it modulo 109 + 7.
 *
 * Note: If a reflection moves the robot into a mirror cell, the robot is immediately reflected again based on the
 * direction it used to enter that mirror: if it entered while moving right, it will be turned down;
 * if it entered while moving down, it will be turned right. This process will continue until either the last cell is
 * reached, the robot moves out of bounds or the robot moves to a non-mirror cell.
 *
 * [URL](https://leetcode.com/problems/twisted-mirror-path-count/)
 */
object TwistedMirrorPathCount {
    fun uniquePaths(grid: Array<IntArray>): Int {
        val MOD = 1_000_000_007

        val rows = grid.size
        val cols = grid[0].size
        val dp = Array(rows + 1) { IntArray(cols + 1) }
        dp[0][0] = 1

        for (r in grid.indices) {
            for (c in grid[0].indices) {
                if (r == 0 && c == 0 || grid[r][c] == 1) continue

                // top
                if (r > 0) {
                    val prev = traverse(r - 1, c, 1, grid, dp)

                    dp[r][c] += prev
                    dp[r][c] %= MOD
                }

                // left
                if (c > 0) {
                    val prev = traverse(r, c - 1, 0, grid, dp)

                    dp[r][c] += prev
                    dp[r][c] %= MOD
                }
            }
        }
        println(dp.contentDeepToString())
        return dp[rows - 1][cols - 1]
    }

    private fun traverse(row: Int, col: Int, direction: Int, grid: Array<IntArray>, dp: Array<IntArray>): Int {
        var curRow = row
        var curCol = col
        var dir = direction

        while (grid[curRow][curCol] == 1) {
            // going top
            if (dir == 0) {
                curRow--
            } else {
                curCol--
            }
            dir = 1 - dir
            if (curRow < 0 || curCol < 0) return 0
        }

        return dp[curRow][curCol]
    }
}
