package medium

/**
 * You are given an m x n grid where each cell contains one of the values 0, 1, or 2. You are also given an integer k.
 *
 * You start from the top-left corner (0, 0) and want to reach the bottom-right corner (m - 1, n - 1) by moving only right or down.
 *
 * Each cell contributes a specific score and incurs an associated cost, according to their cell values:
 *
 * * 0: adds 0 to your score and costs 0.
 * * 1: adds 1 to your score and costs 1.
 * * 2: adds 2 to your score and costs 1.
 *
 * Return the maximum score achievable without exceeding a total cost of k, or -1 if no valid path exists.
 *
 * Note: If you reach the last cell but the total cost exceeds k, the path is invalid.
 *
 * [URL](https://leetcode.com/problems/maximum-path-score-in-a-grid/)
 */
object MaximumPathScoreInGrid {
    fun maxPathScore(grid: Array<IntArray>, k: Int): Int {
        val r = grid.size
        val c = grid[0].size
        val temp = IntArray(k + 1) { -1 }
        var dp = Array(c) { IntArray(k + 1) { -1 } }

        for (row in 0 until r) {
            val tempDp = Array(c) { IntArray(k + 1) { -1 } }
            for (col in 0 until c) {
                if (row == 0 && col == 0) {
                    tempDp[col][getCost(grid, 0, 0)] = grid[0][0]
                    continue
                }

                val top = if (row == 0) temp else dp[col]
                val left = if (col == 0) temp else tempDp[col - 1]
                val cost = getCost(grid, row, col)

                for (tempCost in 0 .. k) {
                    val prevMax = maxOf(top[tempCost], left[tempCost])
                    val newCost = tempCost + cost

                    if (newCost > k || prevMax == -1) continue
                    tempDp[col][newCost] = prevMax + grid[row][col]
                }
            }
            dp = tempDp
        }

        return dp[c - 1].max()
    }

    private fun getCost(grid: Array<IntArray>, row: Int, col: Int): Int {
        return when (grid[row][col]) {
            0 -> 0
            else -> 1
        }
    }
}
