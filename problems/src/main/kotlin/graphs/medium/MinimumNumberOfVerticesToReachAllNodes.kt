package graphs.medium

/**
 * Given a directed acyclic graph, with n vertices numbered from 0 to n-1,
 * and an array edges where `edges[i] = [fromi, toi]` represents a directed edge from node fromi to node toi.
 *
 * Find the smallest set of vertices from which all nodes in the graph are reachable.
 * It's guaranteed that a unique solution exists.
 *
 * Notice that you can return the vertices in any order.
 *
 * [URL](https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/)
 */
object MinimumNumberOfVerticesToReachAllNodes {
    fun findSmallestSetOfVertices(n: Int, edges: List<List<Int>>): List<Int> {
        val set = (0 until n).toMutableSet()

        for ((_, end) in edges) {
            set.remove(end)
        }
        return set.toList()
    }
}
