package medium

import java.util.*

/**
 * You are given an integer matrix isWater of size m x n that represents a map of land and water cells.
 ** If `isWater[i][j] == 0`, cell (i, j) is a land cell.
 ** If `isWater[i][j] == 1`, cell (i, j) is a water cell.
 *
 * You must assign each cell a height in a way that follows these rules:
 * * The height of each cell must be non-negative.
 * * If the cell is a water cell, its height must be 0.
 * * Any two adjacent cells must have an absolute height difference of at most 1. A cell is adjacent to another cell if
 * the former is directly north, east, south, or west of the latter (i.e., their sides are touching).
 *
 * Find an assignment of heights such that the maximum height in the matrix is maximized.
 *
 * Return an integer matrix height of size m x n where `height[i][j]` is cell (i, j)'s height.
 * If there are multiple solutions, return any of them.
 *
 * [URL](https://leetcode.com/problems/map-of-highest-peak/)
 */
private typealias Point = Pair<Int, Int>

object MapOfHighestPeak {
    private val directions = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)

    fun highestPeakBfs(isWater: Array<IntArray>): Array<IntArray> {
        val queue = ArrayDeque<Point>()

        for (r in isWater.indices) {
            for (c in isWater[0].indices) {
                if (isWater[r][c] == 1) {
                    queue.offer(r to c)
                    isWater[r][c] = 0
                } else {
                    isWater[r][c] = -2
                }
            }
        }

        while (queue.isNotEmpty()) {
            val (currr, currc) = queue.poll()
            if (isWater[currr][currc] == -1) {
                isWater[currr][currc] = calculateNeighbour(currr, currc, isWater)
            }

            for ((dr, dc) in directions) {
                val newr = currr + dr
                val newc = currc + dc

                if (newr !in isWater.indices || newc !in isWater[0].indices || isWater[newr][newc] != -2) {
                    continue
                }
                isWater[newr][newc] = -1
                queue.offer(newr to newc)
            }
        }

        return isWater
    }

    private fun calculateNeighbour(row: Int, col: Int, grid: Array<IntArray>): Int {
        var min = Int.MAX_VALUE
        for ((dr, dc) in directions) {
            val newr = row + dr
            val newc = col + dc
            if (newr !in grid.indices || newc !in grid[0].indices || grid[newr][newc] < 0) {
                continue
            }
            min = minOf(min, grid[newr][newc])
        }
        return 1 + if (min == Int.MAX_VALUE) -1 else min
    }

    fun highestPeakDp(isWater: Array<IntArray>): Array<IntArray> {
        val INF = Integer.MAX_VALUE - 1
        val rows = isWater.size
        val columns = isWater[0].size

        for (r in isWater.indices) {
            for (c in isWater[0].indices) {
                if (isWater[r][c] == 1) {
                    isWater[r][c] = 0
                } else {
                    isWater[r][c] = INF
                }
            }
        }

        // Forward pass: updating heights based on top and left neighbors
        for (row in 0..<rows) {
            for (col in 0..<columns) {
                var minNeighborDistance = INF // Initialize minimum neighbor distance

                // Check the cell above
                var neighborRow = row - 1
                var neighborCol = col
                if (isValidCell(neighborRow, neighborCol, rows, columns)) {
                    minNeighborDistance = minOf(minNeighborDistance, isWater[neighborRow][neighborCol])
                }

                // Check the cell to the left
                neighborRow = row
                neighborCol = col - 1
                if (isValidCell(neighborRow, neighborCol, rows, columns)) {
                    minNeighborDistance = minOf(minNeighborDistance, isWater[neighborRow][neighborCol])
                }

                // Set the current cell's height as the minimum of its neighbors + 1
                isWater[row][col] = minOf(isWater[row][col], minNeighborDistance + 1)
            }
        }

        // Backward pass: updating heights based on bottom and right neighbors
        for (row in rows - 1 downTo 0) {
            for (col in columns - 1 downTo 0) {
                var minNeighborDistance = INF // Initialize minimum neighbor distance

                // Check the cell below
                var neighborRow = row + 1
                var neighborCol = col
                if (isValidCell(neighborRow, neighborCol, rows, columns)) {
                    minNeighborDistance = minOf(minNeighborDistance, isWater[neighborRow][neighborCol])
                }

                // Check the cell to the right
                neighborRow = row
                neighborCol = col + 1
                if (isValidCell(neighborRow, neighborCol, rows, columns)) {
                    minNeighborDistance = minOf(minNeighborDistance, isWater[neighborRow][neighborCol])
                }

                // Set the current cell's height as the minimum of its neighbors + 1
                isWater[row][col] = minOf(isWater[row][col], minNeighborDistance + 1)
            }
        }

        return isWater // Return the calculated cell heights
    }

    // Function to check if a cell is within grid bounds
    private fun isValidCell(row: Int, col: Int, rows: Int, columns: Int): Boolean {
        return row >= 0 && col >= 0 && row < rows && col < columns
    }
}
