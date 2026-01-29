package medium

import java.util.*

/**
 * You are given an m x n grid rooms initialized with these three possible values.
 *
 * * -1 A wall or an obstacle.
 * * 0 A gate.
 * * INF Infinity means an empty room. We use the value 23^1 - 1 = 2147483647 to represent INF
 * as you may assume that the distance to a gate is less than 2147483647.
 *
 * Fill each empty room with the distance to its nearest gate.
 * If it is impossible to reach a gate, it should be filled with INF.
 *
 * [URL](hhttps://leetcode.com/problems/walls-and-gates/)
 */
object WallsAndGates {
    private val directions = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)

    fun wallsAndGates(rooms: Array<IntArray>) {
        val queue = ArrayDeque<Pair<Int, Int>>()

        for (r in rooms.indices) {
            for (c in rooms[0].indices) {
                if (rooms[r][c] == 0) {
                    queue.offer(r to c)
                }
            }
        }

        var steps = 1

        while (queue.isNotEmpty()) {
            val size = queue.size

            for (el in 0 until size) {
                val (r, c) = queue.poll()

                for ((dr, dc) in directions) {
                    val newr = r + dr
                    val newc = c + dc

                    if (newr in rooms.indices && newc in rooms[0].indices && rooms[newr][newc] > steps) {
                        rooms[newr][newc] = steps
                        queue.offer(newr to newc)
                    }
                }
            }
            steps++
        }
    }

}
