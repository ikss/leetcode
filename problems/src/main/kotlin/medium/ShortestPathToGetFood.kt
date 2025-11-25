package medium

/**
 * You are starving and you want to eat food as quickly as possible.
 * You want to find the shortest path to arrive at any food cell.
 *
 * You are given an m x n character matrix, grid, of these different types of cells:
 * * '*' is your location. There is exactly one '*' cell.
 * * '#' is a food cell. There may be multiple food cells.
 * * 'O' is free space, and you can travel through these cells.
 * * 'X' is an obstacle, and you cannot travel through these cells.
 *
 * You can travel to any adjacent cell north, east, south, or west of your current location if there is not an obstacle.
 *
 * Return the length of the shortest path for you to reach any food cell.
 * If there is no path for you to reach food, return -1.
 *
 * [URL](https://leetcode.com/problems/shortest-path-to-get-food/)
 */
object ShortestPathToGetFood {
    private val directions = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)

    fun getFood(grid: Array<CharArray>): Int {
        val start = findStart(grid)

        var steps = 0

        val queue = java.util.ArrayDeque<Pair<Int, Int>>()
        val visited = Array(grid.size) { BooleanArray(grid[0].size) }
        visited[start.first][start.second] = true
        queue.offer(start)

        while (queue.isNotEmpty()) {
            val size = queue.size
            for (i in 0 until size) {
                val (currr, currc) = queue.poll()
                if (grid[currr][currc] == '#') {
                    return steps
                }

                for ((dr, dc) in directions) {
                    val newr = currr + dr
                    val newc = currc + dc

                    if (newr !in grid.indices || newc !in grid[newr].indices || grid[newr][newc] == 'X') {
                        continue
                    }

                    if (visited[newr][newc]) {
                        continue
                    }
                    visited[newr][newc] = true
                    queue.offer(newr to newc)
                }
            }
            steps++
        }

        return -1
    }

    private fun findStart(grid: Array<CharArray>): Pair<Int, Int> {
        for (r in grid.indices) {
            for (c in grid[r].indices) {
                if (grid[r][c] == '*') {
                    return r to c
                }
            }
        }

        throw IllegalStateException("Start cell doesn't exist")
    }
}