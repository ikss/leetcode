package arrays.hard

import data_structures.UnionFind

/**
 * There is a 1-based binary matrix where 0 represents land and 1 represents water.
 * You are given integers row and col representing the number of rows and columns in the matrix, respectively.
 *
 * Initially on day 0, the entire matrix is land. However, each day a new cell becomes flooded with water.
 * You are given a 1-based 2D array cells, where `cells[i] = [ri, ci]` represents that on the ith day,
 * the cell on the rith row and cith column (1-based coordinates) will be covered with water (i.e., changed to 1).
 *
 * You want to find the last day that it is possible to walk from the top to the bottom by only walking on land cells.
 * You can start from any cell in the top row and end at any cell in the bottom row.
 * You can only travel in the four cardinal directions (left, right, up, and down).
 *
 * Return the last day where it is possible to walk from the top to the bottom by only walking on land cells.
 *
 * [URL](https://leetcode.com/problems/last-day-where-you-can-still-cross/)
 */
object LastDayWhereYouCanStillCross {
    private val directions = listOf(0 to 1, 0 to -1, 1 to 0, -1 to 0, 1 to 1, 1 to -1, -1 to 1, -1 to -1)

    fun latestDayToCross(row: Int, col: Int, cells: Array<IntArray>): Int {
        val dsu = UnionFind(row * col + 2)
        val grid = Array(row) { IntArray(col) }

        for (i in 0 until row * col) {
            val x = cells[i][0] - 1
            val y = cells[i][1] - 1
            grid[x][y] = 1
            val index1 = x * col + y + 1
            for ((dx, dy) in directions) {
                val newX = x + dx
                val newY = y + dy
                val index2 = newX * col + newY + 1
                if (newX in 0 until row && newY in 0 until col && grid[newX][newY] == 1) {
                    dsu.union(index1, index2)
                }
            }
            if (y == 0) {
                dsu.union(0, index1)
            }
            if (y == col - 1) {
                dsu.union(row * col + 1, index1)
            }
            if (dsu.find(0) == dsu.find(row * col + 1)) {
                return i
            }
        }
        return -1
    }
}
