package hard

/**
 * You are given a 0-indexed m x n integer matrix grid and an integer k.
 * You are currently at position (0, 0) and you want to reach position (m - 1, n - 1) moving only down or right.
 *
 * Return the number of paths where the sum of the elements on the path is divisible by k.
 * Since the answer may be very large, return it modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/paths-in-matrix-whose-sum-is-divisible-by-k/)
 */
object PathsInMatrixWhoseSumIsDivisibleByK {
    fun numberOfPaths(grid: Array<IntArray>, k: Int): Int {
        val rows = grid.size
        val cols = grid[0].size
        val dp = Array(rows + 1) { Array(cols + 1) { IntArray(k) } }
        dp[0][0][grid[0][0] % k] = 1

        val max = 1_000_000_007

        for (r in 0 until rows) {
            for (c in 0 until cols) {
                if (r == 0 && c == 0) continue
                val num = grid[r][c]
                val map = dp[r][c]

                for (rem in 0 until k) {
                    val newRem = (rem + num) % k
                    val sum = ((if (r > 0) dp[r - 1][c][rem] else 0) + (if (c > 0) dp[r][c - 1][rem] else 0)) % max

                    map[newRem] = sum
                }
            }
        }

        return dp[rows - 1][cols - 1][0]
    }
}
