package arrays.medium

import java.util.*

/**
 * You are given a 0-indexed 2D matrix grid of size n x n, where (r, c) represents:
 * * A cell containing a thief if `grid[r][c] = 1`
 * * An empty cell if `grid[r][c] = 0`
 *
 * You are initially positioned at cell (0, 0). In one move, you can move to any adjacent cell in the grid,
 * including cells containing thieves.
 *
 * The safeness factor of a path on the grid is defined as the minimum manhattan distance from any cell
 * in the path to any thief in the grid.
 *
 * Return the maximum safeness factor of all paths leading to cell (n - 1, n - 1).
 *
 * An adjacent cell of cell (r, c), is one of the cells (r, c + 1), (r, c - 1), (r + 1, c) and (r - 1, c) if it exists.
 *
 * The Manhattan distance between two cells (a, b) and (x, y) is equal to |a - x| + |b - y|,
 * where |val| denotes the absolute value of val.
 *
 * [URL](https://leetcode.com/problems/find-the-safest-path-in-a-grid/)
 */
object FindTheSafestPathInGrid {
    private val dir = arrayOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)

    fun maximumSafenessFactor(grid: List<List<Int>>): Int {
        val n = grid.size
        val mat = Array(n) { IntArray(n) }
        val multiSourceQueue = ArrayDeque<Pair<Int, Int>>()

        // To make modifications and navigation easier, the grid is converted into a 2-d array
        for (i in 0 until n) {
            for (j in 0 until n) {
                if (grid[i][j] == 1) {
                    // Push thief coordinates to the queue
                    multiSourceQueue.add(i to j)
                    // Mark thief cell with 0
                    mat[i][j] = 0
                } else {
                    // Mark empty cell with -1
                    mat[i][j] = -1
                }
            }
        }

        // Calculate safeness factor for each cell using BFS
        while (!multiSourceQueue.isEmpty()) {
            var size = multiSourceQueue.size
            while (size-- > 0) {
                val curr = multiSourceQueue.poll()
                // Check neighboring cells
                for (d in dir) {
                    val di = curr.first + d.first
                    val dj = curr.second + d.second
                    val v = mat[curr.first][curr.second]
                    // Check if the neighboring cell is valid and unvisited
                    if (isValidCell(mat, di, dj) && mat[di][dj] == -1) {
                        // Update safeness factor and push to the queue
                        mat[di][dj] = v + 1
                        multiSourceQueue.add(di to dj)
                    }
                }
            }
        }

        // Priority queue to prioritize cells with higher safeness factor
        val pq = PriorityQueue { a: IntArray, b: IntArray -> b[2] - a[2] }
        // Push starting cell to the priority queue
        pq.add(intArrayOf(0, 0, mat[0][0])) // [x-coordinate, y-coordinate, maximum_safeness_till_now]
        mat[0][0] = -1 // Mark the source cell as visited

        // BFS to find the path with maximum safeness factor
        while (!pq.isEmpty()) {
            val curr = pq.poll()
            // If reached the destination, return safeness factor
            if (curr[0] == n - 1 && curr[1] == n - 1) {
                return curr[2]
            }
            // Explore neighboring cells
            for (d in dir) {
                val di = d.first + curr[0]
                val dj = d.second + curr[1]
                if (isValidCell(mat, di, dj) && mat[di][dj] != -1) {
                    // Update safeness factor for the path and mark the cell as visited
                    pq.add(intArrayOf(di, dj, minOf(curr[2], mat[di][dj])))
                    mat[di][dj] = -1
                }
            }
        }

        return -1 // No valid path found
    }

    // Check if a given cell lies within the grid
    private fun isValidCell(mat: Array<IntArray>, i: Int, j: Int): Boolean {
        val n = mat.size
        return i >= 0 && j >= 0 && i < n && j < n
    }
}