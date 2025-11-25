package medium

/**
 * There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., `grid[0][0]`).
 * The robot tries to move to the bottom-right corner (i.e., `grid[m - 1][n - 1]`).
 * The robot can only move either down or right at any point in time.
 *
 * Given the two integers m and n, return the number of possible unique paths that the robot can take
 * to reach the bottom-right corner.
 *
 * The test cases are generated so that the answer will be less than or equal to 2 * 10^9.
 *
 * [URL](https://leetcode.com/problems/unique-paths/)
 */
object UniquePaths {
    fun uniquePaths(m: Int, n: Int): Int {
        val dp = IntArray(n) { 1 }

        for (i in 1 until m) {
            for (j in 1 until n) {
                dp[j] += dp[j - 1]
            }
        }
        return dp[n - 1]
    }
}
