package arrays.hard

import java.util.*


/**
 * Given an m x n integer matrix heightMap representing the height of each unit cell in a 2D elevation map,
 * return the volume of water it can trap after raining.
 *
 * [URL](https://leetcode.com/problems/trapping-rain-water-ii/)
 */
object TrappingRainWaterII {
    private val fillDirections = listOf(
        intArrayOf(0, -1, 0),
        intArrayOf(0, 1, 0),
        intArrayOf(0, 0, -1),
        intArrayOf(0, 0, 1),
        intArrayOf(-1, 0, 0),
    )
    private val drainDirections = listOf(
        intArrayOf(0, -1, 0),
        intArrayOf(0, 1, 0),
        intArrayOf(0, 0, -1),
        intArrayOf(0, 0, 1),
        intArrayOf(1, 0, 0),
    )

    fun trapRainWaterBfs(heightMap: Array<IntArray>): Int {
        val m = heightMap.size
        val n = heightMap[0].size
        val maxHeight = heightMap.maxOf { it.max() }

        // 0 - unfilled
        // 1 - block
        // 2 - filled
        val blocks = Array(maxHeight) { Array(m) { IntArray(n) } }

        for (r in heightMap.indices) {
            for (c in heightMap[0].indices) {
                for (h in 0 until heightMap[r][c]) {
                    blocks[h][r][c] = 1
                }
            }
        }
        var count = fillTrapped(blocks)
        count -= drainTrapped(blocks)

        return count
    }

    private fun fillTrapped(blocks: Array<Array<IntArray>>): Int {
        val visited = Array(blocks.size + 1) { Array(blocks[0].size) { BooleanArray(blocks[0][0].size) } }
        val queue = java.util.ArrayDeque<IntArray>()
        queue.offer(intArrayOf(blocks.size, 0, 0))
        visited[blocks.size][0][0] = true

        var count = 0
        while (queue.isNotEmpty()) {
            val curr = queue.poll()
            val currz = curr[0]
            val currr = curr[1]
            val currc = curr[2]

            for (dir in fillDirections) {
                val dz = dir[0]
                val dr = dir[1]
                val dc = dir[2]

                val newz = currz + dz
                val newr = currr + dr
                val newc = currc + dc

                if (newz !in visited.indices || newr !in visited[0].indices || newc !in visited[0][0].indices) {
                    continue
                }
                if (newz in blocks.indices && blocks[newz][newr][newc] == 0) {
                    blocks[newz][newr][newc] = 2
                    count++
                }
                if (visited[newz][newr][newc]) {
                    continue
                }
                visited[newz][newr][newc] = true
                queue.offer(intArrayOf(newz, newr, newc))
            }
        }
        return count
    }

    private fun drainTrapped(blocks: Array<Array<IntArray>>): Int {
        val visited = Array(blocks.size) { Array(blocks[0].size + 2) { BooleanArray(blocks[0][0].size + 2) } }
        val queue = java.util.ArrayDeque<IntArray>()
        queue.offer(intArrayOf(0, 0, 0))
        visited[0][0][0] = true
        var count = 0

        while (queue.isNotEmpty()) {
            val curr = queue.poll()
            val currz = curr[0]
            val currr = curr[1]
            val currc = curr[2]

            for (dir in drainDirections) {
                val dz = dir[0]
                val dr = dir[1]
                val dc = dir[2]

                val newz = currz + dz
                val newr = currr + dr
                val newc = currc + dc

                if (newz !in visited.indices || newr !in visited[0].indices || newc !in visited[0][0].indices) {
                    continue
                }

                if (newr - 1 in blocks[0].indices && newc - 1 in blocks[0][0].indices) {
                    if (blocks[newz][newr - 1][newc - 1] == 1) {
                        continue
                    }
                    if (blocks[newz][newr - 1][newc - 1] == 2) {
                        blocks[newz][newr - 1][newc - 1] = 0
                        count++
                    }
                }
                if (visited[newz][newr][newc]) {
                    continue
                }
                visited[newz][newr][newc] = true
                queue.offer(intArrayOf(newz, newr, newc))
            }
        }
        return count
    }

    fun trapRainWaterPriorityQueue(heightMap: Array<IntArray>): Int {
        // Direction arrays
        val dRow = intArrayOf(0, 0, -1, 1)
        val dCol = intArrayOf(-1, 1, 0, 0)

        val numOfRows = heightMap.size
        val numOfCols = heightMap[0].size

        val visited = Array(numOfRows) { BooleanArray(numOfCols) }

        // Priority queue (min-heap) to process boundary cells in increasing height order
        val boundary = PriorityQueue<Cell>()

        // Add the first and last column cells to the boundary and mark them as visited
        for (i in 0 until numOfRows) {
            boundary.offer(Cell(heightMap[i][0], i, 0))
            boundary.offer(Cell(heightMap[i][numOfCols - 1], i, numOfCols - 1))
            // Mark left and right boundary cells as visited
            visited[i][numOfCols - 1] = true
            visited[i][0] = visited[i][numOfCols - 1]
        }

        // Add the first and last row cells to the boundary and mark them as visited
        for (i in 0 until numOfCols) {
            boundary.offer(Cell(heightMap[0][i], 0, i))
            boundary.offer(Cell(heightMap[numOfRows - 1][i], numOfRows - 1, i))
            // Mark top and bottom boundary cells as visited
            visited[numOfRows - 1][i] = true
            visited[0][i] = visited[numOfRows - 1][i]
        }

        var result = 0

        while (!boundary.isEmpty()) {
            val currentCell = boundary.poll()

            val currentRow = currentCell.row
            val currentCol = currentCell.col
            val minBoundaryHeight = currentCell.height

            for (direction in 0..3) {
                val nrow = currentRow + dRow[direction]
                val ncol = currentCol + dCol[direction]

                if (nrow in heightMap.indices && ncol in heightMap[0].indices && !visited[nrow][ncol]) {
                    // Get the height of the neighbor cell
                    val neighborHeight = heightMap[nrow][ncol]

                    // If the neighbor's height is less than the current boundary height, water can be trapped
                    if (neighborHeight < minBoundaryHeight) {
                        // Add the trapped water volume
                        result += minBoundaryHeight - neighborHeight
                    }

                    // Push the neighbor into the boundary with updated height (to prevent water leakage)
                    boundary.offer(Cell(maxOf(neighborHeight, minBoundaryHeight), nrow, ncol))
                    visited[nrow][ncol] = true
                }
            }
        }

        // Return the total amount of trapped water
        return result
    }

    // Class to store the height and coordinates of a cell in the grid
    private data class Cell(var height: Int, var row: Int, var col: Int) : Comparable<Cell> {
        // Overload the compareTo method to make the priority queue a min-heap based on height
        override fun compareTo(other: Cell): Int {
            // Min-heap comparison
            return this.height.compareTo(other.height)
        }
    }
}
