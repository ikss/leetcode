package medium

/**
 * There is a directed graph of n nodes with each node labeled from 0 to n - 1.
 * The graph is represented by a 0-indexed 2D integer array graph where `graph[i]` is an integer array of nodes adjacent
 * to node i, meaning there is an edge from node i to each node in `graph[i]`.
 *
 * A node is a terminal node if there are no outgoing edges. A node is a safe node if every possible path starting from
 * that node leads to a terminal node (or another safe node).
 *
 * Return an array containing all the safe nodes of the graph. The answer should be sorted in ascending order.
 *
 * [URL](https://leetcode.com/problems/find-eventual-safe-states/)
 */
object FindEventualSafeStates {
    fun eventualSafeNodes(graph: Array<IntArray>): List<Int> {
        val n = graph.size
        val indegree = IntArray(n)
        val adj = ArrayList<ArrayList<Int>>()
        for (i in 0 until n) {
            adj.add(ArrayList())
        }
        for (i in 0 until n) {
            for (node in graph[i]) {
                adj[node].add(i)
                indegree[i]++
            }
        }
        val q = java.util.ArrayDeque<Int>()
        // Push all the nodes with indegree zero in the queue.
        for (i in 0 until n) {
            if (indegree[i] == 0) {
                q.add(i)
            }
        }
        val safe = BooleanArray(n)
        while (q.isNotEmpty()) {
            val node = q.poll()

            safe[node] = true
            for (neighbor in adj[node]) {
                // Delete the edge "node -> neighbor".
                if (--indegree[neighbor] == 0) {
                    q.add(neighbor)
                }
            }
        }
        val safeNodes = ArrayList<Int>()
        for (i in 0 until n) {
            if (safe[i]) {
                safeNodes.add(i)
            }
        }
        return safeNodes
    }
}
