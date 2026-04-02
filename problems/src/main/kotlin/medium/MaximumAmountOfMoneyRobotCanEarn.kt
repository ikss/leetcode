package medium

/**
 * You are given an m x n grid. A robot starts at the top-left corner of the grid (0, 0) and wants to reach
 * the bottom-right corner (m - 1, n - 1). The robot can move either right or down at any point in time.
 *
 * The grid contains a value `coins[i][j]` in each cell:
 * * If `coins[i][j] >= 0`, the robot gains that many coins.
 * * If `coins[i][j] < 0`, the robot encounters a robber, and the robber steals the absolute value of `coins[i][j]` coins.
 *
 * The robot has a special ability to neutralize robbers in at most 2 cells on its path, preventing them from stealing coins in those cells.
 *
 * Note: The robot's total coins can be negative.
 *
 * Return the maximum profit the robot can gain on the route.
 *
 * [URL](https://leetcode.com/problems/maximum-amount-of-money-robot-can-earn/)
 */
object MaximumAmountOfMoneyRobotCanEarn {
    fun maximumAmount(coins: Array<IntArray>): Int {
        val rows = coins.size
        val cols = coins[0].size
        val dp = Array(rows) { Array(cols) { IntArray(3) } }
        val default = IntArray(3) { Int.MIN_VALUE / 2 }

        // Initialize origin explicitly
        dp[0][0][2] = coins[0][0]
        dp[0][0][1] = if (coins[0][0] < 0) 0 else Int.MIN_VALUE / 2
        dp[0][0][0] = Int.MIN_VALUE / 2

        for (r in 0 until rows) {
            for (c in 0 until cols) {
                if (r == 0 && c == 0) continue
                val curr = coins[r][c]
                val prevRow = if (r > 0) dp[r - 1][c] else default
                val prevCol = if (c > 0) dp[r][c - 1] else default

                // gain money or lose money without spending stuns
                for (i in 0 until 3) {
                    dp[r][c][i] = maxOf(curr + prevRow[i], curr + prevCol[i])
                }

                // don't lose money but lose a stun
                if (curr < 0) {
                    dp[r][c][0] = maxOf(dp[r][c][0], prevRow[1], prevCol[1])
                    dp[r][c][1] = maxOf(dp[r][c][1], prevRow[2], prevCol[2])
                }
            }
        }

        return dp[rows - 1][cols - 1].max()
    }
}
