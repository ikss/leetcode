package data_structures.arrays.medium

import java.util.*

/**
 * Given an m x n binary matrix mat, return the distance of the nearest 0 for each cell.
 *
 * The distance between two adjacent cells is 1.
 *
 * [URL](https://leetcode.com/problems/01-matrix/)
 */
object PacificAtlanticWaterFlow {
    fun pacificAtlantic(heights: Array<IntArray>): List<List<Int>> {
        val rows = heights.size
        val cols = heights[0].size
        val stack = Stack<Pair<Int, Int>>()

        val pacific = Array(rows) { BooleanArray(cols) }
        for (i in 0 until rows) {
            stack.add(i to 0)
        }
        for (j in 0 until cols) {
            stack.add(0 to j)
        }
        processStack(stack, pacific, heights)

        val atlantic = Array(rows) { BooleanArray(cols) }
        for (i in rows - 1 downTo 0) {
            stack.add(i to cols - 1)
        }
        for (j in cols - 1 downTo 0) {
            stack.add(rows - 1 to j)
        }

        processStack(stack, atlantic, heights)

        val result = mutableListOf<List<Int>>()
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                if (pacific[i][j] && atlantic[i][j]) result.add(listOf(i, j))
            }
        }
        return result
    }

    private fun processStack(stack: Stack<Pair<Int, Int>>, ocean: Array<BooleanArray>, heights: Array<IntArray>) {
        while (stack.isNotEmpty()) {
            val (i, j) = stack.pop()
            if (ocean[i][j]) continue

            ocean[i][j] = true
            val height = heights[i][j]

            if (i > 0 && heights[i - 1][j] >= height) {
                stack.add(i - 1 to j)
            }
            if (j > 0 && heights[i][j - 1] >= height) {
                stack.add(i to j - 1)
            }
            if (i < heights.size - 1 && heights[i + 1][j] >= height) {
                stack.add(i + 1 to j)
            }
            if (j < heights[0].size - 1 && heights[i][j + 1] >= height) {
                stack.add(i to j + 1)
            }
        }
    }
}
