package data_structures.arrays.medium

import java.util.*


/**
 * There is an m x n grid with a ball. The ball is initially at the position `[startRow, startColumn]`.
 * You are allowed to move the ball to one of the four adjacent cells in the grid
 * (possibly out of the grid crossing the grid boundary).
 * You can apply at most maxMove moves to the ball.
 *
 * Given the five integers m, n, maxMove, startRow, startColumn, return the number of paths to move the ball
 * out of the grid boundary. Since the answer can be very large, return it modulo 109 + 7.
 *
 * [URL](https://leetcode.com/problems/out-of-boundary-paths/)
 */
object OutOfBoundaryPaths {
    private var M = 1000000007
    fun findPathsRecursive(m: Int, n: Int, maxMove: Int, r: Int, c: Int): Int {
        val memo = Array(m) { Array(n) { IntArray(maxMove + 1) { -1 } } }
        for (l in memo) for (sl in l) Arrays.fill(sl, -1)
        return findPaths(m, n, maxMove, r, c, memo)
    }

    private fun findPaths(m: Int, n: Int, maxMove: Int, r: Int, c: Int, memo: Array<Array<IntArray>>): Int {
        if (r == m || c == n || r < 0 || c < 0) return 1
        if (maxMove == 0) return 0
        if (memo[r][c][maxMove] >= 0) return memo[r][c][maxMove]
        val top = findPaths(m, n, maxMove - 1, r - 1, c, memo)
        val bottom = findPaths(m, n, maxMove - 1, r + 1, c, memo)
        val left = findPaths(m, n, maxMove - 1, r, c - 1, memo)
        val right = findPaths(m, n, maxMove - 1, r, c + 1, memo)
        memo[r][c][maxMove] = ((top + bottom) % M + (left + right) % M) % M
        return memo[r][c][maxMove]
    }

    fun findPathsDP(m: Int, n: Int, maxMove: Int, startRow: Int, startColumn: Int): Int {
        var dp = Array(m) { IntArray(n) }
        dp[startRow][startColumn] = 1

        var result = 0
        for (moves in 1..maxMove) {
            val temp = Array(m) { IntArray(n) }
            for (i in 0 until m) {
                for (j in 0 until n) {
                    if (i == m - 1) result = (result + dp[i][j]) % M
                    if (j == n - 1) result = (result + dp[i][j]) % M
                    if (i == 0) result = (result + dp[i][j]) % M
                    if (j == 0) result = (result + dp[i][j]) % M

                    val top = if (i > 0) dp[i - 1][j] else 0
                    val bottom = if (i < m - 1) dp[i + 1][j] else 0
                    val left = if (j > 0) dp[i][j - 1] else 0
                    val right = if (j < n - 1) dp[i][j + 1] else 0
                    temp[i][j] = (((top + bottom) % M) + ((left + right) % M)) % M
                }
            }
            dp = temp
        }

        return result
    }
}
