package data_structures.arrays.medium

/**
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
 *
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
 * You may assume all four edges of the grid are all surrounded by water.
 *
 * [URL](https://leetcode.com/problems/number-of-islands/)
 */
object NumberOfIslands {
    fun numIslands(grid: Array<CharArray>): Int {
        var islands = 0
        for (i in grid.indices) {
            for (j in grid[0].indices) {
                islands += dfs(i, j, grid)
            }
        }
        return islands
    }

    private fun dfs(i: Int, j: Int, grid: Array<CharArray>): Int {
        if (i < 0 || j < 0 || i >= grid.size || j >= grid[0].size || grid[i][j] == '0') {
            return 0
        }
        grid[i][j] = '0'
        dfs(i - 1, j, grid)
        dfs(i, j - 1, grid)
        dfs(i + 1, j, grid)
        dfs(i, j + 1, grid)
        return 1
    }
}
