package hard

/**
 * You are given an m x n integer matrix grid, where you can move from a cell to any adjacent cell in all 4 directions.
 *
 * Return the number of strictly increasing paths in the grid such that you can start from any cell and end at any cell.
 * Since the answer may be very large, return it modulo 10^9 + 7.
 *
 * Two paths are considered different if they do not have exactly the same sequence of visited cells.
 *
 * [URL](https://leetcode.com/problems/number-of-increasing-paths-in-a-grid/)
 */
object NumberOfIncreasingPathsInGrid {
    private const val MOD = 1_000_000_007
    private val directions = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)

    fun countPaths(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size

        val dp = Array(m) { IntArray(n) { -1 } }

        var result = (m.toLong() * n) % MOD
        for (i in grid.indices) {
            for (j in grid[0].indices) {
                result = (result + count(i, j, dp, grid)) % MOD
            }
        }
        return result.toInt()
    }

    private fun count(i: Int, j: Int, dp: Array<IntArray>, grid: Array<IntArray>): Int {

        if (dp[i][j] != -1) return dp[i][j]

        var result = 0

        for ((dx, dy) in directions) {
            val nexti = i + dx
            val nextj = j + dy

            if (nexti < 0 || nextj < 0 || nexti == grid.size || nextj == grid[0].size) continue
            if (grid[i][j] >= grid[nexti][nextj]) continue
            result = (result + 1 + count(nexti, nextj, dp, grid)) % MOD
        }
        dp[i][j] = result

        return result
    }
}
