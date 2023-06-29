package arrays.hard

import java.util.*

/**
 * You are given an m x n grid grid where:
 * * '.' is an empty cell.
 * * '#' is a wall.
 * * '@' is the starting point.
 * * Lowercase letters represent keys.
 * * Uppercase letters represent locks.
 *
 * You start at the starting point and one move consists of walking one space in one of the four cardinal directions.
 * You cannot walk outside the grid, or walk into a wall.
 *
 * If you walk over a key, you can pick it up and you cannot walk over a lock unless you have its corresponding key.
 *
 * For some 1 <= k <= 6, there is exactly one lowercase and one uppercase letter of the first k letters of the English
 * alphabet in the grid. This means that there is exactly one key for each lock, and one lock for each key;
 * and also that the letters used to represent the keys and locks were chosen in the same order as the English alphabet.
 *
 * Return the lowest number of moves to acquire all keys. If it is impossible, return -1.
 *
 * [URL](https://leetcode.com/problems/shortest-path-to-get-all-keys/)
 */
object ShortestPathToGetAllKeys {
    private val directions = listOf(0 to -1, 0 to 1, -1 to 0, 1 to 0)

    private data class State(val x: Int, val y: Int, val keys: Int)

    fun shortestPathAllKeys(grid: Array<String>): Int {
        var neededKeys = 0
        var startingPoint = 0 to 0

        for (i in grid.indices) {
            for (j in grid[0].indices) {
                val c = grid[i][j]
                if (c in 'a'..'z') {
                    neededKeys += 1 shl (c - 'a')
                } else if (c == '@') {
                    startingPoint = i to j
                }
            }
        }
        val queue = ArrayDeque<Pair<State, Int>>()
        queue.offer(State(startingPoint.first, startingPoint.second, 0) to 0)
        val visited = HashSet<State>()
        var result = Int.MAX_VALUE

        while (queue.isNotEmpty()) {
            val (state, step) = queue.poll()
            if (!visited.add(state)) continue
            val (x, y, keys) = state

            if (keys == neededKeys) {
                result = minOf(result, step)
                continue
            }

            for ((dx, dy) in directions) {
                val newX = x + dx
                val newY = y + dy
                if (newX < 0 || newX == grid.size || newY < 0 || newY == grid[0].length) continue

                val c = grid[newX][newY]

                if (c == '#') {
                    continue
                }
                var newKeys = keys
                if (c in 'a'..'z') {
                    newKeys = newKeys or (1 shl (c - 'a'))
                } else if (c in 'A'..'Z') {
                    if ((keys and (1 shl (c - 'A'))) == 0) continue
                }
                queue.offer(State(newX, newY, newKeys) to step + 1)
            }
        }

        return if (result == Int.MAX_VALUE) -1 else result
    }
}