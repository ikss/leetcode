package arrays.medium

/**
 * You are given a 0-indexed m x n matrix grid consisting of positive integers.
 *
 * You can start at any cell in the first column of the matrix, and traverse the grid in the following way:
 *
 * From a cell (row, col), you can move to any of the cells: (row - 1, col + 1), (row, col + 1) and (row + 1, col + 1)
 * such that the value of the cell you move to, should be strictly bigger than the value of the current cell.
 *
 * Return the maximum number of moves that you can perform.
 *
 * [URL](https://leetcode.com/problems/maximum-number-of-moves-in-a-grid/)
 */
object MaximumNumberOfMovesInGrid {
    private val moves = listOf(-1 to 1, 0 to 1, 1 to 1)

    fun maxMoves(grid: Array<IntArray>): Int {
        var result = 0
        val map = HashMap<Pair<Int, Int>, Int>()

        for (i in grid.indices) {
            result = maxOf(result, dfs(i, 0, grid, map))
        }

        return result
    }

    private fun dfs(row: Int, col: Int, grid: Array<IntArray>, map: HashMap<Pair<Int, Int>, Int>): Int {
        map[row to col]?.let { return it }

        var result = 0
        for ((dr, dc) in moves) {
            val newr = row + dr
            val newc = col + dc

            if (newr in grid.indices && newc in grid[0].indices && grid[newr][newc] > grid[row][col]) {
                result = maxOf(result, dfs(newr, newc, grid, map) + 1)
            }
        }
        map[row to col] = result

        return result
    }
}
