package medium

import java.util.PriorityQueue

/**
 * There is a ball in a maze with empty spaces (represented as 0) and walls (represented as 1).
 * The ball can go through the empty spaces by rolling up, down, left or right, but it won't stop rolling until
 * hitting a wall. When the ball stops, it could choose the next direction.
 *
 * Given the m x n maze, the ball's start position and the destination, where `start = [startrow, startcol]` and
 * `destination = [destinationrow, destinationcol]`, return the shortest distance for the ball to stop at the
 * destination. If the ball cannot stop at destination, return -1.
 *
 * The distance is the number of empty spaces traveled by the ball from the start position (excluded)
 * to the destination (included).
 *
 * You may assume that the borders of the maze are all walls.
 *
 * [URL](https://leetcode.com/problems/the-maze-ii/)
 */
object TheMazeII {
    private data class State(
        val position: Pair<Int, Int>,
        val distance: Int,
    )

    private val directions = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)

    fun shortestDistance(maze: Array<IntArray>, start: IntArray, destination: IntArray): Int {
        val visited = HashMap<Pair<Int, Int>, Int>()
        val startPair = start[0] to start[1]
        val destPair = destination[0] to destination[1]

        val queue = PriorityQueue<State>(compareBy { it.distance })
        queue.add(State(startPair, 0))
        visited[startPair] = 0

        while (queue.isNotEmpty()) {
            val curr = queue.poll()
            if (curr.position == destPair) {
                return curr.distance
            }
            val (currx, curry) = curr.position

            for ((dx, dy) in directions) {
                var nextx = currx
                var nexty = curry
                var dist = curr.distance

                while (nextx + dx in maze.indices && nexty + dy in maze[0].indices && maze[nextx + dx][nexty + dy] == 0) {
                    nextx += dx
                    nexty += dy
                    dist++
                }

                val nextPos = nextx to nexty
                if (visited.getOrDefault(nextPos, Int.MAX_VALUE) > dist) {
                    visited[nextPos] = dist
                    queue.add(State(nextPos, dist))
                }
            }
        }

        return -1
    }
}