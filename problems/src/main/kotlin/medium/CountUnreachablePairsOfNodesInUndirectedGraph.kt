package medium

import java.util.*

/**
 * You are given an integer n. There is an undirected graph with n nodes, numbered from 0 to n - 1.
 * You are given a 2D integer array edges where `edges[i] = [ai, bi]` denotes that there exists an undirected edge
 * connecting nodes ai and bi.
 *
 * Return the number of pairs of different nodes that are unreachable from each other.
 *
 * [URL](https://leetcode.com/problems/count-unreachable-pairs-of-nodes-in-an-undirected-graph/)
 */
object CountUnreachablePairsOfNodesInUndirectedGraph {
    fun countPairs(n: Int, edges: Array<IntArray>): Long {
        val graph = HashMap<Int, ArrayList<Int>>()

        for ((s, e) in edges) {
            graph.computeIfAbsent(s) { ArrayList() }.add(e)
            graph.computeIfAbsent(e) { ArrayList() }.add(s)
        }

        var numberOfPairs = 0L
        var sizeOfGroup: Long
        var remainingNodes = n.toLong()
        val visited = BooleanArray(n)

        for (i in 0 until n) {
            if (!visited[i]) {
                sizeOfGroup = bfs(i, graph, visited).toLong()
                numberOfPairs += sizeOfGroup * (remainingNodes - sizeOfGroup)
                remainingNodes -= sizeOfGroup
            }
        }
        return numberOfPairs
    }

    private fun bfs(node: Int, graph: Map<Int, List<Int>>, visited: BooleanArray): Int {
        val queue = ArrayDeque<Int>()
        queue.offer(node)

        visited[node] = true

        var result = 1
        while (!queue.isEmpty()) {
            val neighbours = graph[queue.poll()]
                ?: continue

            for (neighbour in neighbours) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true
                    result++
                    queue.offer(neighbour)
                }
            }
        }

        return result
    }
}
