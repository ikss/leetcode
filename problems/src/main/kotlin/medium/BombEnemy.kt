package medium

/**
 * Given an m x n matrix grid where each cell is either a wall 'W', an enemy 'E' or empty '0',
 * return the maximum enemies you can kill using one bomb. You can only place the bomb in an empty cell.
 *
 * The bomb kills all the enemies in the same row and column from the planted point until it hits the wall since it
 * is too strong to be destroyed.
 *
 * [URL](https://leetcode.com/problems/bomb-enemy/)
 */
object BombEnemy {
    private val directions = listOf(0 to -1, 0 to 1, -1 to 0, 1 to 0)

    fun maxKilledEnemies(grid: Array<CharArray>): Int {
        val m = grid.size
        val n = grid[0].size
        val dp = Array(m) { Array(n) { IntArray(4) { -1 } } }

        var result = 0
        for (r in grid.indices) {
            for (c in grid[0].indices) {
                if (grid[r][c] != '0') continue
                val temp = (0..3).sumOf { calculateFrom(r, c, grid, dp, it) }
                result = maxOf(result, temp)
            }
        }
        return result
    }

    private fun calculateFrom(r: Int, c: Int, grid: Array<CharArray>, dp: Array<Array<IntArray>>, direction: Int): Int {
        val (dr, dc) = directions[direction]
        val newr = r + dr
        val newc = c + dc

        if (newr !in grid.indices || newc !in grid[0].indices) return 0
        val calcucated = when {
            dp[newr][newc][direction] != -1 -> dp[newr][newc][direction]
            grid[newr][newc] == 'W' -> 0
            grid[newr][newc] == 'E' -> 1 + calculateFrom(newr, newc, grid, dp, direction)
            else -> calculateFrom(newr, newc, grid, dp, direction)
        }
        dp[newr][newc][direction] = calcucated
        return calcucated
    }
}
