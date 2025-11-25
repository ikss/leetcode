package hard

import data_structures.UnionFind

/**
 * Alice and Bob have an undirected graph of n nodes and three types of edges:
 * * Type 1: Can be traversed by Alice only.
 * * Type 2: Can be traversed by Bob only.
 * * Type 3: Can be traversed by both Alice and Bob.
 *
 * Given an array edges where `edges[i] = [typei, ui, vi]` represents a bidirectional edge of type typei between nodes
 * ui and vi, find the maximum number of edges you can remove so that after removing the edges, the graph can still be
 * fully traversed by both Alice and Bob. The graph is fully traversed by Alice and Bob if starting from any node,
 * they can reach all other nodes.
 *
 * Return the maximum number of edges you can remove, or return -1 if Alice and Bob cannot fully traverse the graph.
 *
 * [URL](https://leetcode.com/problems/remove-max-number-of-edges-to-keep-graph-fully-traversable/)
 */
object RemoveMaxNumberOfEdgesToKeepGraphFullyTraversable {
    fun maxNumEdgesToRemove(n: Int, edges: Array<IntArray>): Int {
        // Different objects for Alice and Bob.
        val alice = UnionFind(n)
        val bob = UnionFind(n)
        var edgesRequired = 0
        // Perform union for edges of type = 3, for both Alice and Bob.
        for (edge in edges) {
            if (edge[0] == 3) {
                edgesRequired += if (alice.union(edge[1], edge[2]) or bob.union(edge[1], edge[2])) 1 else 0
            }
        }

        // Perform union for Alice if type = 1 and for Bob if type = 2.
        for (edge in edges) {
            if (edge[0] == 1) {
                edgesRequired += if (alice.union(edge[1], edge[2])) 1 else 0
            } else if (edge[0] == 2) {
                edgesRequired += if (bob.union(edge[1], edge[2])) 1 else 0
            }
        }

        // Check if the Graphs for Alice and Bob have n - 1 edges or is a single component.
        if (alice.allIsConnected() && bob.allIsConnected()) {
            return edges.size - edgesRequired
        }
        return -1
    }

}