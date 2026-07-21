package easy

import java.util.Collections

/**
 * Given a 2D grid of size m x n and an integer k. You need to shift the grid k times.
 *
 * In one shift operation:
 * * Element at grid[i][j] moves to grid[i][j + 1].
 * * Element at grid[i][n - 1] moves to grid[i + 1][0].
 * * Element at grid[m - 1][n - 1] moves to grid[0][0].
 *
 * Return the 2D grid after applying shift operation k times.
 *
 * [URL](https://leetcode.com/problems/shift-2d-grid/)
 */
object Shift2DGrid {
    fun shiftGrid(grid: Array<IntArray>, k: Int): List<List<Int>> {
        val rows = grid.size
        val cols = grid[0].size

        val result = ArrayList<ArrayList<Int>>(rows)
        for (r in grid.indices) {
            result.add(ArrayList(Collections.nCopies(cols, 0)))
        }

        for (row in grid.indices) {
            for (col in grid[0].indices) {
                val index = rowColToIndex(row, col, cols)
                val newIndex = index + k
                val (newRow, newCol) = indexToRowCol(newIndex, rows, cols)

                result[newRow][newCol] = grid[row][col]
            }
        }

        return result
    }

    private fun rowColToIndex(row: Int, col: Int, cols: Int): Int {
        return row * cols + col
    }

    private fun indexToRowCol(index: Int, rows: Int, cols: Int): Pair<Int, Int> {
        val realIndex = index % (rows * cols)

        val row = realIndex / cols
        val col = realIndex - (row * cols)

        return row to col
    }
}