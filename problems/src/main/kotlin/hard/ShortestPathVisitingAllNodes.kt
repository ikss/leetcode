package hard

import java.util.*

/**
 * You have an undirected, connected graph of n nodes labeled from 0 to n - 1.
 * You are given an array graph where `graph[i]` is a list of all the nodes connected with node i by an edge.
 *
 * Return the length of the shortest path that visits every node. You may start and stop at any node,
 * you may revisit nodes multiple times, and you may reuse edges.
 *
 * [URL](https://leetcode.com/problems/shortest-path-visiting-all-nodes/)
 */
object ShortestPathVisitingAllNodes {
    fun shortestPathLength(graph: Array<IntArray>): Int {
        val n = graph.size
        val fullMask = (1 shl n) - 1

        val visited = HashSet<Pair<Int, Int>>()
        val queue = ArrayDeque<Pair<Int, Int>>()

        for (i in 0 until n) {
            val pair = i to (1 shl i)
            queue.offer(pair)
            visited.add(pair)
        }

        var level = 0

        while (queue.isNotEmpty()) {
            val size = queue.size

            for (i in 0 until size) {
                val (node, mask) = queue.poll()
                if (mask == fullMask) return level

                for (next in graph[node]) {
                    val nextMasked = next to (mask or (1 shl next))
                    if (!visited.add(nextMasked)) continue

                    queue.offer(nextMasked)
                }
            }
            level++
        }

        return level
    }
}
