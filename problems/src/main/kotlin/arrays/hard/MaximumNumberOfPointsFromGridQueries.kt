package arrays.hard

import data_structures.GridCell

/**
 * You are given an m x n integer matrix grid and an array queries of size k.
 *
 * Find an array answer of size k such that for each integer `queries[i] `you start in the top left cell of the matrix
 * and repeat the following process:
 * * If `queries[i]` is strictly greater than the value of the current cell that you are in, then you get one point if
 * it is your first time visiting this cell, and you can move to any adjacent cell in all 4 directions: up, down, left,
 * and right.
 * * Otherwise, you do not get any points, and you end this process.
 *
 * After the process, `answer[i]` is the maximum number of points you can get. Note that for each query you are allowed
 * to visit the same cell multiple times.
 *
 * Return the resulting array answer.
 *
 * [URL](https://leetcode.com/problems/maximum-number-of-points-from-grid-queries/)
 */
object MaximumNumberOfPointsFromGridQueries {
    private val directions = listOf(-1 to 0, 1 to 0, 0 to 1, 0 to -1)

    fun maxPointsSimpleDfs(grid: Array<IntArray>, queries: IntArray): IntArray {
        val result = IntArray(queries.size)
        val start = grid[0][0]

        for (i in queries.indices) {
            val num = queries[i]
            result[i] = if (num > start) dfs(grid, num) else 0
        }

        return result
    }

    private fun dfs(grid: Array<IntArray>, max: Int): Int {
        var result = 1
        val queue = java.util.ArrayDeque<GridCell>()
        val visited = HashSet<GridCell>()
        queue.offer(0 to 0)
        visited.add(0 to 0)

        while (queue.isNotEmpty()) {
            val (curRow, curCol) = queue.poll()

            for ((dr, dc) in directions) {
                val newRow = curRow + dr
                val newCol = curCol + dc

                if (newRow !in grid.indices || newCol !in grid[0].indices || grid[newRow][newCol] >= max || !visited.add(
                        newRow to newCol
                    )
                ) {
                    continue
                }
                result++
                queue.offer(newRow to newCol)
            }
        }

        return result
    }
}
