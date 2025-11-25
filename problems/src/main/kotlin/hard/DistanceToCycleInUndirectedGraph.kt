package hard

import java.util.*

/**
 * ou are given a positive integer n representing the number of nodes in a connected undirected graph containing
 * exactly one cycle. The nodes are numbered from 0 to n - 1 (inclusive).
 *
 * You are also given a 2D integer array edges, where `edges[i] = [node1i, node2i]` denotes that there is a
 * bidirectional edge connecting node1i and node2i in the graph.
 *
 * The distance between two nodes a and b is defined to be the minimum number of edges that are needed to go from a to b.
 *
 * Return an integer array answer of size n, where `answer[i]` is the minimum distance between the ith node and any
 * node in the cycle.
 *
 * [URL](https://leetcode.com/problems/distance-to-a-cycle-in-undirected-graph/)
 */
object DistanceToCycleInUndirectedGraph {
    fun distanceToCycle(n: Int, edges: Array<IntArray>): IntArray {
        val indirection = IntArray(n)
        val graph = HashMap<Int, HashSet<Int>>()

        for ((from, to) in edges) {
            indirection[from]++
            indirection[to]++
            graph.computeIfAbsent(from) { HashSet() }.add(to)
            graph.computeIfAbsent(to) { HashSet() }.add(from)
        }

        val nodesInCycle = findNodesInCycle(indirection, graph)
        val result = IntArray(n) { -1 }

        val queue = java.util.ArrayDeque<Pair<Int, Int>>()
        for (node in nodesInCycle) {
            result[node] = 0
            queue.offer(node to 0)
        }

        while (queue.isNotEmpty()) {
            val (node, distance) = queue.poll()
            val nextDistance = distance + 1

            for (neigh in graph[node] ?: emptySet()) {
                if (result[neigh] != -1) continue
                result[neigh] = nextDistance
                queue.offer(neigh to nextDistance)
            }
        }

        return result
    }

    private fun findNodesInCycle(indirection: IntArray, graph: Map<Int, Set<Int>>): HashSet<Int> {
        val queue = java.util.ArrayDeque<Int>()
        for (i in indirection.indices) {
            val ind = indirection[i]
            if (ind == 1) {
                queue.offer(i)
            }
        }
        while (queue.isNotEmpty()) {
            val curr = queue.poll()
            for (neigh in graph[curr] ?: emptySet()) {
                if (--indirection[neigh] == 1) {
                    queue.offer(neigh)
                }
            }
        }
        val result = HashSet<Int>()
        for (i in indirection.indices) {
            if (indirection[i] > 1) {
                result.add(i)
            }
        }

        return result
    }
}