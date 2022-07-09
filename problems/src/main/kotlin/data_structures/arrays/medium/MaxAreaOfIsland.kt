package data_structures.arrays.medium

/**
 * You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected 4-directionally
 * (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.
 *
 * The area of an island is the number of cells with a value 1 in the island.
 *
 * Return the maximum area of an island in grid. If there is no island, return 0.
 *
 * [URL](https://leetcode.com/problems/max-area-of-island/)
 */
object MaxAreaOfIsland {

    fun maxAreaOfIsland(grid: Array<IntArray>): Int {
        val seen = Array(grid.size) { BooleanArray(grid[0].size) }
        var ans = 0
        for (r in grid.indices) {
            for (c in grid[0].indices) {
                ans = Math.max(ans, area(r, c, seen, grid))
            }
        }
        return ans
    }

    private fun area(r: Int, c: Int, seen: Array<BooleanArray>, grid: Array<IntArray>): Int {
        if (r < 0 || r >= grid.size || c < 0 || c >= grid[0].size || seen[r][c] || grid[r][c] == 0) {
            return 0
        }
        seen[r][c] = true
        val down = area(r + 1, c, seen, grid)
        val up = area(r - 1, c, seen, grid)
        val left = area(r, c - 1, seen, grid)
        val right = area(r, c + 1, seen, grid)
        return (1 + down + up + left + right)
    }
}
