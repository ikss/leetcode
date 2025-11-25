package medium

/**
 * You are given two m x n binary matrices grid1 and grid2 containing only 0's (representing water) and 1's
 * (representing land). An island is a group of 1's connected 4-directionally (horizontal or vertical).
 * Any cells outside of the grid are considered water cells.
 *
 * An island in grid2 is considered a sub-island if there is an island in grid1 that contains all the cells that make
 * up this island in grid2.
 *
 * Return the number of islands in grid2 that are considered sub-islands.
 *
 * [URL](https://leetcode.com/problems/count-sub-islands/)
 */
object CountSubIslands {
    private val directions = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)

    fun countSubIslands(grid1: Array<IntArray>, grid2: Array<IntArray>): Int {
        var result = 0
        for (i in grid2.indices) {
            for (j in grid2[0].indices) {
                if (grid2[i][j] == 1) {
                    if (isSubIsland(i, j, grid1, grid2)) {
                        result++
                    }
                }
            }
        }

        return result
    }

    private fun isSubIsland(i: Int, j: Int, grid1: Array<IntArray>, grid2: Array<IntArray>): Boolean {
        var isSubIsland = true
        val queue = java.util.ArrayDeque<Pair<Int, Int>>()
        queue.offer(i to j)

        while (queue.isNotEmpty()) {
            val (r, c) = queue.poll()
            if (grid2[r][c] == 0) continue
            grid2[r][c] = 0

            isSubIsland = isSubIsland && grid1[r][c] == 1

            for ((dr, dc) in directions) {
                val newRow = r + dr
                val newCol = c + dc

                if (newRow in grid2.indices && newCol in grid2[0].indices && grid2[newRow][newCol] == 1) {
                    queue.offer(newRow to newCol)
                }
            }
        }

        return isSubIsland
    }
}
