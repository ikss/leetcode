package hard

/**
 * You are given a rows x cols matrix grid representing a field of cherries where grid[i][j] represents the number of cherries that you can collect from the (i, j) cell.
 *
 * You have two robots that can collect cherries for you:
 *
 * * Robot #1 is located at the top-left corner (0, 0), and
 * * Robot #2 is located at the top-right corner (0, cols - 1).
 *
 * Return the maximum number of cherries collection using both robots by following the rules below:
 * * From a cell (i, j), robots can move to cell (i + 1, j - 1), (i + 1, j), or (i + 1, j + 1).
 * * When any robot passes through a cell, It picks up all cherries, and the cell becomes an empty cell.
 * * When both robots stay in the same cell, only one takes the cherries.
 * * Both robots cannot move outside of the grid at any moment.
 * * Both robots should reach the bottom row in grid.
 *
 * [URL](https://leetcode.com/problems/cherry-pickup-ii/)
 */
object CherryPickupII {
    fun cherryPickup(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size
        val dpCache = Array(m) {
            Array(n) {
                IntArray(n) { -1 }
            }
        }
        return dp(0, 0, n - 1, grid, dpCache)
    }

    private fun dp(row: Int, col1: Int, col2: Int, grid: Array<IntArray>, dpCache: Array<Array<IntArray>>): Int {
        if (col1 < 0 || col1 >= grid[0].size || col2 < 0 || col2 >= grid[0].size) {
            return 0
        }
        // check cache
        if (dpCache[row][col1][col2] != -1) {
            return dpCache[row][col1][col2]
        }
        // current cell
        var result = grid[row][col1]
        if (col1 != col2) {
            result += grid[row][col2]
        }
        // transition
        if (row != grid.size - 1) {
            var max = 0
            for (newCol1 in col1 - 1..col1 + 1) {
                for (newCol2 in col2 - 1..col2 + 1) {
                    max = maxOf(max, dp(row + 1, newCol1, newCol2, grid, dpCache))
                }
            }
            result += max
        }

        dpCache[row][col1][col2] = result
        return result
    }
}