package medium

import java.util.*

/**
 * There is an m x n rectangular island that borders both the Pacific Ocean and Atlantic Ocean. The Pacific Ocean
 * touches the island's left and top edges, and the Atlantic Ocean touches the island's right and bottom edges.
 *
 * The island is partitioned into a grid of square cells. You are given an m x n integer matrix heights where
 * `heights[r][c]` represents the height above sea level of the cell at coordinate (r, c).
 *
 * The island receives a lot of rain, and the rain water can flow to neighboring cells directly north, south, east,
 * and west if the neighboring cell's height is less than or equal to the current cell's height. Water can flow from
 * any cell adjacent to an ocean into the ocean.
 *
 * Return a 2D list of grid coordinates result where `result[i] = [ri, ci]` denotes that rain water can flow from cell
 * (ri, ci) to both the Pacific and Atlantic oceans.
 *
 * [URL](https://leetcode.com/problems/pacific-atlantic-water-flow/)
 */
object PacificAtlanticWaterFlow {
    fun pacificAtlanticStack(heights: Array<IntArray>): List<List<Int>> {
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

    val directions = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)

    fun pacificAtlanticQueue(heights: Array<IntArray>): List<List<Int>> {
        val marker = Array(heights.size) { IntArray(heights[0].size) }

        val queue = ArrayDeque<Pair<Int, Int>>()
        // add pacific
        for (r in marker.indices) {
            queue.offer(r to -1)
        }
        for (c in marker[0].indices) {
            queue.offer(-1 to c)
        }
        mark(heights, marker, queue, 1)

        // add atlantic
        for (r in marker.indices) {
            queue.offer(r to marker[0].size)
        }
        for (c in marker[0].indices) {
            queue.offer(marker.size to c)
        }
        mark(heights, marker, queue, 2)

        // collect result
        val result = ArrayList<List<Int>>()
        for (r in marker.indices) {
            for (c in marker[r].indices) {
                if (marker[r][c] == 3) {
                    result.add(listOf(r, c))
                }
            }
        }
        return result
    }


    private fun mark(heights: Array<IntArray>, marker: Array<IntArray>, queue: ArrayDeque<Pair<Int, Int>>, mark: Int) {
        while (queue.isNotEmpty()) {
            val (curRow, curCol) = queue.poll()
            val oldHeight = if (curRow !in heights.indices || curCol !in heights[0].indices) 0 else heights[curRow][curCol]

            for ((dr, dc) in directions) {
                val newRow = curRow + dr
                val newCol = curCol + dc

                if (newRow !in heights.indices || newCol !in heights[0].indices || oldHeight > heights[newRow][newCol]) {
                    continue
                }
                if (marker[newRow][newCol] and mark > 0) continue
                marker[newRow][newCol] = marker[newRow][newCol] or mark
                queue.offer(newRow to newCol)
            }
        }
    }
}
