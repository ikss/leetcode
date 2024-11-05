package arrays.medium

/**
 * You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected 4-directionally
 * (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.
 *
 * The area of an island is the number of cells with a value 1 in the island.
 *
 * Return the maximum area of an island in grid. If there is no island, return 0.
 *
 * [URL](https://leetcode.com/problems/max-area-of-island/)
 */
object MaxAreaOfIsland {
    private val directions = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)

    fun maxAreaOfIslandDfs(grid: Array<IntArray>): Int {
        val seen = Array(grid.size) { BooleanArray(grid[0].size) }
        var ans = 0
        for (r in grid.indices) {
            for (c in grid[0].indices) {
                ans = maxOf(ans, area(r, c, seen, grid))
            }
        }
        return ans
    }

    private fun area(r: Int, c: Int, seen: Array<BooleanArray>, grid: Array<IntArray>): Int {
        if (r !in grid.indices || c !in grid[0].indices || seen[r][c] || grid[r][c] == 0) {
            return 0
        }
        seen[r][c] = true
        val down = area(r + 1, c, seen, grid)
        val up = area(r - 1, c, seen, grid)
        val left = area(r, c - 1, seen, grid)
        val right = area(r, c + 1, seen, grid)
        return (1 + down + up + left + right)
    }

    fun maxAreaOfIslandBfs(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size
        val visited = Array(m) { BooleanArray(n) }

        var result = 0
        val queue = java.util.ArrayDeque<Pair<Int, Int>>()
        for (i in grid.indices) {
            for (j in grid[0].indices) {
                val n = grid[i][j]
                if (n == 0 || visited[i][j]) continue

                queue.offer(i to j)
                var area = 0
                while (queue.isNotEmpty()) {
                    val (curri, currj) = queue.poll()
                    if (curri !in grid.indices || currj !in grid[0].indices || grid[curri][currj] == 0 || visited[curri][currj]) continue
                    area++
                    visited[curri][currj] = true

                    for ((di, dj) in directions) {
                        val nexti = curri + di
                        val nextj = currj + dj
                        queue.offer(nexti to nextj)
                    }
                }
                result = maxOf(result, area)
            }
        }

        return result
    }
}