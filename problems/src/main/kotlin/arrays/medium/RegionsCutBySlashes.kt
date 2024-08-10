package arrays.medium

import data_structures.GridCell

/**
 * An n x n grid is composed of 1 x 1 squares where each 1 x 1 square consists of a '/', '\', or blank space ' '.
 * These characters divide the square into contiguous regions.
 *
 * Given the grid grid represented as a string array, return the number of regions.
 *
 * Note that backslash characters are escaped, so a '\' is represented as '\\'.
 *
 * [URL](https://leetcode.com/problems/regions-cut-by-slashes/)
 */
object RegionsCutBySlashes {
    private val directions = listOf(0 to 1, 0 to -1, 1 to 0, -1 to 0)

    fun regionsBySlashes(grid: Array<String>): Int {
        val gridSize = grid.size

        val expandedGrid = Array(gridSize * 3) { IntArray(gridSize * 3) }

        for (i in 0 until gridSize) {
            for (j in 0 until gridSize) {
                val baseRow = i * 3
                val baseCol = j * 3
                if (grid[i][j] == '\\') {
                    // Mark diagonal for backslash
                    expandedGrid[baseRow][baseCol] = 1
                    expandedGrid[baseRow + 1][baseCol + 1] = 1
                    expandedGrid[baseRow + 2][baseCol + 2] = 1
                } else if (grid[i][j] == '/') {
                    // Mark diagonal for forward slash
                    expandedGrid[baseRow][baseCol + 2] = 1
                    expandedGrid[baseRow + 1][baseCol + 1] = 1
                    expandedGrid[baseRow + 2][baseCol] = 1
                }
            }
        }

        var regionCount = 0
        // Count regions using flood fill
        for (i in 0 until gridSize * 3) {
            for (j in 0 until gridSize * 3) {
                // If we find an unvisited cell (0), it's a new region
                if (expandedGrid[i][j] == 0) {
                    // Fill that region
                    floodFill(expandedGrid, i, j)
                    regionCount++
                }
            }
        }
        return regionCount
    }

    // Flood fill algorithm to mark all cells in a region
    private fun floodFill(expandedGrid: Array<IntArray>, row: Int, col: Int) {
        val queue = java.util.ArrayDeque<GridCell>()
        expandedGrid[row][col] = 1
        queue.add(row to col)

        while (!queue.isEmpty()) {
            val (curRow, curCol) = queue.poll()
            // Check all four directions from the current cell
            for ((dr, dc) in directions) {
                val newRow = curRow + dr
                val newCol = curCol + dc
                if (newRow in expandedGrid.indices && newCol in expandedGrid.indices && expandedGrid[newRow][newCol] == 0) {
                    expandedGrid[newRow][newCol] = 1
                    queue.add(newRow to newCol)
                }
            }
        }
    }
}
