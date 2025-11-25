package hard

/**
 * You are given a directed graph of n nodes numbered from 0 to n - 1, where each node has at most one outgoing edge.
 *
 * The graph is represented with a given 0-indexed array edges of size n, indicating that there is a directed edge
 * from node i to node `edges[i]`. If there is no outgoing edge from node i, then `edges[i] == -1`.
 *
 * Return the length of the longest cycle in the graph. If no cycle exists, return -1.
 *
 * A cycle is a path that starts and ends at the same node.
 *
 * [URL](https://leetcode.com/problems/longest-cycle-in-a-graph/)
 */
object LongestCycleInGraph {
    fun longestCycle(edges: IntArray): Int {
        val n = edges.size

        var result = -1
        val visited = Array(n) { it to 0 }

        for (i in 0 until n) {
            var len = 1
            var cur = i

            while (cur != -1 && visited[cur].second == 0) {
                visited[cur] = i to len++
                cur = edges[cur]
            }

            if (cur != -1 && visited[cur].first == i) {
                result = maxOf(result, len - visited[cur].second)
            }
        }

        return result
    }
}
