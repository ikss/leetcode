package graphs.hard

import java.util.*

/**
 * You are given an undirected weighted connected graph containing n nodes labeled from 0 to n - 1, and an integer array
 * edges where `edges[i] = [ai, bi, wi]` indicates that there is an edge between nodes ai and bi with weight wi.
 *
 * Some edges have a weight of -1 (wi = -1), while others have a positive weight (wi > 0).
 *
 * Your task is to modify all edges with a weight of -1 by assigning them positive integer values in the range
 * `[1, 2 * 10^9]` so that the shortest distance between the nodes source and destination becomes equal to an integer
 * target. If there are multiple modifications that make the shortest distance between source and destination equal to
 * target, any of them will be considered correct.
 *
 * Return an array containing all edges (even unmodified ones) in any order if it is possible to make the shortest
 * distance from source to destination equal to target, or an empty array if it's impossible.
 *
 * Note: You are not allowed to modify the weights of edges with initial positive weights.
 *
 * [URL](https://leetcode.com/problems/modify-graph-edge-weights/)
 */
object ModifyGraphEdgeWeights {
    private const val INF = 2e9.toInt()

    fun modifiedGraphEdges(n: Int, edges: Array<IntArray>, source: Int, destination: Int, target: Int): Array<IntArray> {
        val graph = HashMap<Int, HashMap<Int, Int>>()

        for ((s, e, w) in edges) {
            if (w == -1) continue
            graph.computeIfAbsent(s) { HashMap() }[e] = w
            graph.computeIfAbsent(e) { HashMap() }[s] = w
        }

        val currShort = dijkstra(source, destination, graph)

        if (currShort < target) return emptyArray()

        var matches = currShort == target

        for (edge in edges) {
            if (edge[2] != -1) continue

            edge[2] = if (matches) INF else 1

            graph.computeIfAbsent(edge[0]) { HashMap() }[edge[1]] = edge[2]
            graph.computeIfAbsent(edge[1]) { HashMap() }[edge[0]] = edge[2]

            if (!matches) {
                val newShort = dijkstra(source, destination, graph)

                if (newShort <= target) {
                    matches = true
                    edge[2] += target - newShort
                }
            }

        }

        return if (matches) edges else emptyArray()
    }

    private fun dijkstra(source: Int, destination: Int, graph: Map<Int, Map<Int, Int>>): Int {
        val minDistance = HashMap<Int, Int>()

        val queue = PriorityQueue<Pair<Int, Int>>(compareBy{ it.second })
        queue.offer(source to 0)

        while (queue.isNotEmpty()) {
            val (curr, currd) = queue.poll()
            if (curr == destination) return currd

            val prev = minDistance[curr] ?: INF

            if (prev <= currd) continue
            minDistance[curr] = currd

            for ((neigh, neighd) in graph[curr] ?: continue) {
                queue.offer(neigh to currd + neighd)
            }
        }

        return INF
    }
}
