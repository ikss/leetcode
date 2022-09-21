package arrays.medium

/**
 * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right,
 * which minimizes the sum of all numbers along its path.
 *
 * Note: You can only move either down or right at any point in time.
 *
 * [URL](https://leetcode.com/problems/minimum-path-sum/)
 */
object MinimumPathSum {
    fun minPathSum(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size
        var dp = IntArray(n)

        for (j in 0 until n) {
            if (j == 0) {
                dp[0] = grid[0][0]
                continue
            }
            dp[j] = dp[j - 1] + grid[0][j]
        }

        for (i in 1 until m) {
            val tmpDp = IntArray(n)
            tmpDp[0] = dp[0] + grid[i][0]
            for (j in 1 until n) {
                tmpDp[j] = grid[i][j] + minOf(dp[j], tmpDp[j - 1])
            }
            dp = tmpDp
        }

        return dp[n - 1]
    }
}
