package graphs.medium

import java.util.*

/**
 * You are given an unrooted weighted tree with n vertices representing servers numbered from 0 to n - 1, an array edges
 * where `edges[i] = [ai, bi, weighti]` represents a bidirectional edge between vertices ai and bi of weight weighti.
 * You are also given an integer signalSpeed.
 *
 * Two servers a and b are connectable through a server c if:
 * * a < b, a != c and b != c.
 * * The distance from c to a is divisible by signalSpeed.
 * * The distance from c to b is divisible by signalSpeed.
 * * The path from c to b and the path from c to a do not share any edges.
 *
 * Return an integer array count of length n where `count[i]` is the number of server pairs that are connectable through the server i.
 *
 * [URL](https://leetcode.com/problems/count-pairs-of-connectable-servers-in-a-weighted-tree-network/)
 */
object CountPairsOfConnectableServersInWeightedTreeNetwork {
    fun countPairsOfConnectableServers(edges: Array<IntArray>, signalSpeed: Int): IntArray {
        val size = edges.size + 1
        val graph = HashMap<Int, HashMap<Int, Int>>()

        for ((s, e, w) in edges) {
            graph.computeIfAbsent(s) { HashMap() }[e] = w
            graph.computeIfAbsent(e) { HashMap() }[s] = w
        }

        val result = IntArray(size)

        for (i in result.indices) {
            var count = 0
            var nodeRes = 0

            for ((neigh, weight) in graph[i]!!) {
                val t = dfs(neigh, i, weight, graph, signalSpeed)
                nodeRes += count * t
                count += t
            }

            result[i] = nodeRes
        }

        return result
    }

    private fun dfs(root: Int, i: Int, dist: Int, graph: Map<Int, Map<Int, Int>>, signalSpeed: Int): Int {
        var count = if (dist % signalSpeed == 0) 1 else 0

        for ((neigh, weight) in graph[root]!!) {
            if (neigh == i) continue
            count += dfs(neigh, root, dist + weight, graph, signalSpeed)
        }

        return count
    }
}
