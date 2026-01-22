package medium

import java.util.*

/**
 * There is a ball in a maze with empty spaces (represented as 0) and walls (represented as 1). The ball can go through
 * the empty spaces by rolling up, down, left or right, but it won't stop rolling until hitting a wall.
 * When the ball stops, it could choose the next direction (must be different from last chosen direction).
 * There is also a hole in this maze. The ball will drop into the hole if it rolls onto the hole.
 *
 * Given the m x n maze, the ball's position ball and the hole's position hole, where `ball = [ballrow, ballcol]`
 * and `hole = [holerow, holecol]`, return a string instructions of all the instructions that the ball should follow
 * to drop in the hole with the shortest distance possible. If there are multiple valid instructions,
 * return the lexicographically minimum one. If the ball can't drop in the hole, return "impossible".
 *
 * If there is a way for the ball to drop in the hole, the answer instructions should contain the characters
 * 'u' (i.e., up), 'd' (i.e., down), 'l' (i.e., left), and 'r' (i.e., right).
 *
 * The distance is the number of empty spaces traveled by the ball from the start position (excluded)
 * to the destination (included).
 *
 * You may assume that the borders of the maze are all walls
 *
 * [URL](https://leetcode.com/problems/the-maze-iii/)
 */
object TheMazeIII {
    private data class State(
        val position: Pair<Int, Int>,
        val distance: Int,
        val steps: String,
    )

    private enum class Direction(val dr: Int, val dc: Int, val char: Char) {
        DOWN(1, 0, 'd'),
        UP(-1, 0, 'u'),
        LEFT(0, -1, 'l'),
        RIGHT(0, 1, 'r'),
        ;
    }

    fun findShortestWay(maze: Array<IntArray>, ball: IntArray, hole: IntArray): String {
        val visited = HashMap<Pair<Int, Int>, Pair<Int, String>>()
        val startPair = ball[0] to ball[1]
        val destPair = hole[0] to hole[1]

        val queue = PriorityQueue<State> { s1, s2 ->
            if (s1.distance != s2.distance) {
                s1.distance - s2.distance
            } else {
                s1.steps.compareTo(s2.steps)
            }
        }
        queue.add(State(startPair, 0, ""))
        visited[startPair] = 0 to "zzz"

        var minDistance = -1
        var minSteps = "zzz"
        while (queue.isNotEmpty()) {
            val curr = queue.poll()
            if (minDistance != -1 && curr.distance > minDistance) {
                continue
            }
            val (currr, currc) = curr.position

            for (dir in Direction.entries) {
                val dr = dir.dr
                val dc = dir.dc
                val char = dir.char
                var nextr = currr
                var nextc = currc
                var dist = curr.distance

                while (nextr + dr in maze.indices && nextc + dc in maze[0].indices && maze[nextr + dr][nextc + dc] == 0) {
                    nextr += dr
                    nextc += dc
                    dist++

                    if (nextr to nextc == destPair) {
                        if (minDistance == -1 || minDistance == dist) {
                            minDistance = dist
                            minSteps = minOf(minSteps, curr.steps + char)
                        }
                    }
                }
                if (dist == curr.distance) continue
                val nextPos = nextr to nextc
                val seen = visited.getOrDefault(nextPos, Int.MAX_VALUE to "zzz")
                val newSteps = curr.steps + char
                if (seen.first > dist || (seen.first == dist && seen.second > newSteps)) {
                    visited[nextPos] = dist to newSteps
                    queue.add(State(nextPos, dist, newSteps))
                }
            }
        }

        return if (minSteps == "zzz") "impossible" else minSteps
    }
}