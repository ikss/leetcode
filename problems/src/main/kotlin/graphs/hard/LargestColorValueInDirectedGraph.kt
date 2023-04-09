package graphs.hard

import java.util.*

/**
 * There is a directed graph of n colored nodes and m edges. The nodes are numbered from 0 to n - 1.
 *
 * You are given a string colors where `colors[i]` is a lowercase English letter representing the color of the ith node
 * in this graph (0-indexed). You are also given a 2D array edges where `edges[j] = [aj, bj]` indicates that there is a
 * directed edge from node aj to node bj.
 *
 * A valid path in the graph is a sequence of nodes x1 -> x2 -> x3 -> ... -> xk such that there is a directed edge
 * from xi to xi+1 for every 1 <= i < k. The color value of the path is the number of nodes that are colored the most
 * frequently occurring color along that path.
 *
 * Return the largest color value of any valid path in the given graph, or -1 if the graph contains a cycle.
 *
 * [URL](https://leetcode.com/problems/largest-color-value-in-a-directed-graph/)
 */
object LargestColorValueInDirectedGraph {
    fun largestPathValue(colors: String, edges: Array<IntArray>): Int {
        val n = colors.length
        val adj = hashMapOf<Int, MutableList<Int>>()
        val indegree = IntArray(n)
        for ((from, to) in edges) {
            adj.computeIfAbsent(from) { ArrayList() }.add(to)
            indegree[to]++
        }
        val count = Array(n) { IntArray(26) }
        val q = ArrayDeque<Int>()

        // Push all the nodes with indegree zero in the queue.
        for (i in 0 until n) {
            if (indegree[i] == 0) {
                q.offer(i)
            }
        }
        var answer = 1
        var nodesSeen = 0
        while (!q.isEmpty()) {
            val node = q.poll()
            answer = maxOf(answer, ++count[node][colors[node] - 'a'])
            nodesSeen++
            if (!adj.containsKey(node)) {
                continue
            }
            for (neighbor in adj[node]!!) {
                for (i in 0..25) {
                    // Try to update the frequency of colors for the neighbor to include paths
                    // that use node->neighbor edge.
                    count[neighbor][i] = maxOf(count[neighbor][i], count[node][i])
                }
                indegree[neighbor]--
                if (indegree[neighbor] == 0) {
                    q.offer(neighbor)
                }
            }
        }
        return if (nodesSeen < n) -1 else answer
    }
}
