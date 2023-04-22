package arrays.medium

/**
 * You are given an m x n integer array grid. There is a robot initially located at the top-left corner
 * (i.e., `grid[0][0]`). The robot tries to move to the bottom-right corner (i.e., `grid[m - 1][n - 1]`).
 * The robot can only move either down or right at any point in time.
 *
 * An obstacle and space are marked as 1 or 0 respectively in grid. A path that the robot takes cannot include
 * any square that is an obstacle.
 *
 * Return the number of possible unique paths that the robot can take to reach the bottom-right corner.
 *
 * The testcases are generated so that the answer will be less than or equal to 2 * 109.
 *
 * [URL](https://leetcode.com/problems/unique-paths-ii/)
 */
object UniquePathsII {
    fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>): Int {
        if (obstacleGrid[0][0] == 1) return 0
        val m = obstacleGrid.size
        val n = obstacleGrid[0].size

        var dp = IntArray(n)
        for (i in 0 until m) {
            val tmp = IntArray(n)
            if (i == 0) tmp[0] = 1
            for (j in 0 until n) {
                if (i == 0 && j == 0) continue
                if (obstacleGrid[i][j] == 1) continue

                tmp[j] = (if (i > 0) dp[j] else 0) + (if (j > 0) tmp[j - 1] else 0)
            }
            dp = tmp
        }
        return dp[n - 1]
    }
}
