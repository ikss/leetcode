package arrays.medium

/**
 * You are given a m x n matrix grid. Initially, you are located at the top-left corner (0, 0), and in each step,
 * you can only move right or down in the matrix.
 *
 * Among all possible paths starting from the top-left corner (0, 0) and ending in the bottom-right corner
 * (m - 1, n - 1), find the path with the maximum non-negative product. The product of a path is the product of
 * all integers in the grid cells visited along the path.
 *
 * Return the maximum non-negative product modulo 10^9 + 7. If the maximum product is negative, return -1.
 *
 * Notice that the modulo is performed after getting the maximum product.
 *
 * [URL](https://leetcode.com/problems/maximum-non-negative-product-in-a-matrix/)
 */
object MaximumNonNegativeProductInMatrix {
    private var product: Long = -1
    private const val MOD = 1_000_000_007

    fun maxProductPathDfs(grid: Array<IntArray>): Int {
        product = -1
        dfs(grid, 0, 0, grid[0][0].toLong())
        return (product % MOD).toInt()
    }

    private fun dfs(grid: Array<IntArray>, i: Int, j: Int, curr: Long) {
        if (i == grid.size - 1 && j == grid[0].size - 1) {
            product = maxOf(product, curr)
            return
        }
        if (grid[i][j] == 0) {
            product = maxOf(product, 0)
            return
        }
        if (i + 1 < grid.size) {
            dfs(grid, i + 1, j, curr * grid[i + 1][j])
        }
        if (j + 1 < grid[0].size) {
            dfs(grid, i, j + 1, curr * grid[i][j + 1])
        }
    }

    fun maxProductPathDp(grid: Array<IntArray>): Int {
        val r = grid.size
        val c = grid[0].size
        val dp = Array(r) { arrayOfNulls<Pair<Long, Long>>(c) }

        // initialize first cell as (grid[0][0],grid[0][0]) since min and max are the same here
        dp[0][0] = Pair(grid[0][0].toLong(), grid[0][0].toLong())

        // initialize first row, min=max= prev row product* grid[i][j]
        for (i in 1 until r) {
            dp[i][0] = Pair(dp[i - 1][0]!!.first * grid[i][0], dp[i - 1][0]!!.second * grid[i][0])
        }

        // initialize first column, min=max= prev col product* grid[i][j]
        for (j in 1 until c) {
            dp[0][j] = Pair(dp[0][j - 1]!!.first * grid[0][j], dp[0][j - 1]!!.second * grid[0][j])
        }

        // from grid[1][1] to grid[r][c]
        for (i in 1 until r) {
            for (j in 1 until c) {
                val prevTop = dp[i - 1][j]!!
                val prevLeft = dp[i][j - 1]!!
                val min = grid[i][j] * minOf(prevTop.first, prevLeft.first)
                val max = grid[i][j] * maxOf(prevTop.second, prevLeft.second)
                dp[i][j] = Pair(minOf(min, max), maxOf(min, max))
            }
        }
        val res = dp[r - 1][c - 1]!!.second
        return if (res < 0) -1 else (res % MOD).toInt()
    }
}
