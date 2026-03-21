package easy

/**
 * You are given an m x n integer matrix grid, and three integers x, y, and k.
 *
 * The integers x and y represent the row and column indices of the top-left corner of a square submatrix
 * and the integer k represents the size (side length) of the square submatrix.
 *
 * Your task is to flip the submatrix by reversing the order of its rows vertically.
 *
 * Return the updated matrix.
 *
 * [URL](https://leetcode.com/problems/flip-square-submatrix-vertically/)
 */
object FlipSquareSubmatrixVertically {
    fun reverseSubmatrix(grid: Array<IntArray>, x: Int, y: Int, k: Int): Array<IntArray> {
        val rows = grid.size
        val cols = grid[0].size

        for (i in 0 until k / 2) {
            val r = x + i
            for (c in y until y + k) {
                val tmp = grid[r][c]
                grid[r][c] = grid[x + k - i - 1][c]
                grid[x + k - i - 1][c] = tmp
            }
        }

        return grid
    }
}