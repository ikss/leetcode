package graphs.medium

import java.util.*

/**
 * You are given an integer n, the number of nodes in a directed graph where the nodes are labeled from 0 to n - 1.
 * Each edge is red or blue in this graph, and there could be self-edges and parallel edges.
 *
 * You are given two arrays redEdges and blueEdges where:
 *
 * `redEdges[i] = [ai, bi]` indicates that there is a directed red edge from node ai to node bi in the graph, and
 * `blueEdges[j] = [uj, vj]` indicates that there is a directed blue edge from node uj to node vj in the graph.
 * Return an array answer of length n, where each `answer[x]` is the length of the shortest path from node 0 to node x
 * such that the edge colors alternate along the path, or -1 if such a path does not exist.
 *
 * [URL](https://leetcode.com/problems/shortest-path-with-alternating-colors/)
 */
object ShortestPathWithAlternatingColors {
    fun shortestAlternatingPaths(n: Int, redEdges: Array<IntArray>, blueEdges: Array<IntArray>): IntArray {
        val adj = hashMapOf<Int, MutableList<List<Int>>>()
        for ((from, to) in redEdges) {
            adj.computeIfAbsent(from) { ArrayList() }.add(mutableListOf(to, 0))
        }
        for ((from, to) in blueEdges) {
            adj.computeIfAbsent(from) { ArrayList() }.add(mutableListOf(to, 1))
        }
        val answer = IntArray(n) { -1 }
        val visit = Array(n) { BooleanArray(2) }
        val q = ArrayDeque<IntArray>()

        // Start with node 0, with number of steps as 0 and undefined color -1.
        q.offer(intArrayOf(0, 0, -1))
        answer[0] = 0
        visit[0][0] = true
        visit[0][1] = true
        while (!q.isEmpty()) {
            val element = q.poll()
            val node = element[0]
            val steps = element[1]
            val prevColor = element[2]
            if (!adj.containsKey(node)) {
                continue
            }
            for (nei in adj[node]!!) {
                val neighbor = nei[0]
                val color = nei[1]
                if (!visit[neighbor][color] && color != prevColor) {
                    if (answer[neighbor] == -1) {
                        answer[neighbor] = 1 + steps
                    }
                    visit[neighbor][color] = true
                    q.offer(intArrayOf(neighbor, 1 + steps, color))
                }
            }
        }
        return answer
    }
}
