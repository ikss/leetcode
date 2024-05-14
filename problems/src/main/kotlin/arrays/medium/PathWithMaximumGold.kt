package arrays.medium

/**
 * In a gold mine grid of size m x n, each cell in this mine has an integer representing the amount of gold in that cell,
 * 0 if it is empty.
 *
 * Return the maximum amount of gold you can collect under the conditions:
 * * Every time you are located in a cell you will collect all the gold in that cell.
 * * From your position, you can walk one step to the left, right, up, or down.
 * * You can't visit the same cell more than once.
 * * Never visit a cell with 0 gold.
 * * You can start and stop collecting gold from any position in the grid that has some gold.
 *
 * [URL](https://leetcode.com/problems/path-with-maximum-gold/)
 */
object PathWithMaximumGold {
    private val directions = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)
    
    fun getMaximumGold(grid: Array<IntArray>): Int {
        var result = 0
        var totalGold = 0
        for (i in grid.indices) {
            for (j in grid[0].indices) {
                totalGold += grid[i][j]
            }
        }
        for (i in grid.indices) {
            for (j in grid[0].indices) {
                if (grid[i][j] == 0) continue
                val dfs = dfs(i, j, grid, totalGold)
                if (dfs == totalGold) return totalGold
                result = maxOf(result, dfs)
            }
        }
        return result
    }

    private fun dfs(i: Int, j: Int, grid: Array<IntArray>, totalGold: Int): Int {
        var result = 0
        val oldVal = grid[i][j]
        grid[i][j] = 0

        for ((di, dj) in directions) {
            val newi = i + di
            val newj = j + dj
            if (newi in grid.indices && newj in grid[0].indices && grid[newi][newj] > 0) {
                val dfs = dfs(newi, newj, grid, totalGold)
                if (dfs == totalGold) return totalGold
                result = maxOf(result, dfs)
            }
        }
        grid[i][j] = oldVal
        return result + oldVal
    }
}