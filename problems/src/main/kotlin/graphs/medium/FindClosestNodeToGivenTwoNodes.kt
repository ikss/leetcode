package graphs.medium

/**
 * You are given a directed graph of n nodes numbered from 0 to n - 1, where each node has at most one outgoing edge.
 *
 * The graph is represented with a given 0-indexed array edges of size n, indicating that there is a directed edge
 * from node i to node edges[i]. If there is no outgoing edge from i, then `edges[i] == -1`.
 *
 * You are also given two integers node1 and node2.
 *
 * Return the index of the node that can be reached from both node1 and node2, such that the maximum between
 * the distance from node1 to that node, and from node2 to that node is minimized. If there are multiple answers,
 * return the node with the smallest index, and if no possible answer exists, return -1.
 *
 * Note that edges may contain cycles.
 *
 * [URL](https://leetcode.com/problems/find-closest-node-to-given-two-nodes/)
 */
object FindClosestNodeToGivenTwoNodes {

    fun closestMeetingNode(edges: IntArray, node1: Int, node2: Int): Int {
        val n = edges.size
        val dist1 = IntArray(n) { Int.MAX_VALUE }
        val dist2 = IntArray(n) { Int.MAX_VALUE }
        bfs(node1, edges, dist1)
        bfs(node2, edges, dist2)
        var minDistNode = -1
        var minDistTillNow = Int.MAX_VALUE
        for (currNode in 0 until n) {
            val max = maxOf(dist1[currNode], dist2[currNode])
            if (minDistTillNow > max) {
                minDistNode = currNode
                minDistTillNow = max
            }
        }
        return minDistNode
    }

    private fun bfs(startNode: Int, edges: IntArray, dist: IntArray) {
        val n = edges.size
        val q = java.util.ArrayDeque<Int>()
        q.offer(startNode)
        val visit = BooleanArray(n)
        dist[startNode] = 0
        while (!q.isEmpty()) {
            val node = q.poll()
            if (visit[node]) continue

            visit[node] = true
            val neighbor = edges[node]
            if (neighbor != -1 && !visit[neighbor]) {
                dist[neighbor] = dist[node] + 1
                q.offer(neighbor)
            }
        }
    }
}
