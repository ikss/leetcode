package medium

import java.util.*

/**
 * You are given an array points representing integer coordinates of some points on a 2D-plane,
 * where `points[i] = [xi, yi]`.
 *
 * The cost of connecting two points `[xi, yi]` and `[xj, yj]` is the manhattan distance between them:
 * |xi - xj| + |yi - yj|, where |val| denotes the absolute value of val.
 *
 * Return the minimum cost to make all points connected. All points are connected if there is exactly one simple path
 * between any two points.
 *
 * [URL](https://leetcode.com/problems/min-cost-to-connect-all-points/)
 */
object MinCostToConnectAllPoints {
    fun minCostConnectPoints(points: Array<IntArray>): Int {
        val size = points.size

        val visited = BooleanArray(size)
        val queue = PriorityQueue<Pair<Int, Int>> { a1, a2 -> a1.first.compareTo(a2.first) }
        var result = 0
        var connected = 0
        var curr = 0

        while (connected++ <= size) {
            visited[curr] = true

            while (!queue.isEmpty() && visited[queue.peek().second]) {
                queue.poll()
            }
            val pc = points[curr]
            for (i in 0 until size) {
                if (visited[i]) continue

                queue.offer(getDistance(pc, points[i]) to i)
            }

            val next = queue.poll() ?: break
            result += next.first
            curr = next.second
        }

        return result
    }

    private fun getDistance(p1: IntArray, p2: IntArray): Int {
        return Math.abs(p1[0] - p2[0]) + Math.abs(p1[1] - p2[1])
    }
}