package graphs.hard

import data_structures.UnionFind
import java.util.*

/**
 * Given a weighted undirected connected graph with n vertices numbered from 0 to n - 1,
 * and an array edges where `edges[i] = [ai, bi, weighti]` represents a bidirectional and weighted edge between
 * nodes ai and bi. A minimum spanning tree (MST) is a subset of the graph's edges that connects all vertices without
 * cycles and with the minimum possible total edge weight.
 *
 * Find all the critical and pseudo-critical edges in the given graph's minimum spanning tree (MST).
 * An MST edge whose deletion from the graph would cause the MST weight to increase is called a critical edge.
 * On the other hand, a pseudo-critical edge is that which can appear in some MSTs but not all.
 *
 * Note that you can return the indices of the edges in any order.
 *
 * [URL](https://leetcode.com/problems/find-critical-and-pseudo-critical-edges-in-minimum-spanning-tree/)
 */
object FindCriticalAndPseudoCriticalEdgesInMinimumSpanningTree {
    fun findCriticalAndPseudoCriticalEdges(n: Int, edges: Array<IntArray>): List<MutableList<Int>> {
        // Add index to edges for tracking
        val m = edges.size
        val newEdges = Array(m) { IntArray(4) }
        for (i in 0 until m) {
            for (j in 0..2) {
                newEdges[i][j] = edges[i][j]
            }
            newEdges[i][3] = i
        }

        // Sort edges based on weight
        newEdges.sortBy { it[2] }

        // Find MST weight using union-find
        val ufStd = UnionFind(n)
        var stdWeight = 0
        for (edge in newEdges) {
            if (ufStd.union(edge[0], edge[1])) {
                stdWeight += edge[2]
            }
        }
        val result: MutableList<MutableList<Int>> = ArrayList()
        for (i in 0..1) {
            result.add(ArrayList())
        }

        // Check each edge for critical and pseudo-critical
        for (i in 0 until m) {
            // Ignore this edge and calculate MST weight
            val ufIgnore = UnionFind(n)
            var ignoreWeight = 0
            for (j in 0 until m) {
                if (i != j && ufIgnore.union(newEdges[j][0], newEdges[j][1])) {
                    ignoreWeight += newEdges[j][2]
                }
            }
            // If the graph is disconnected or the total weight is greater, 
            // the edge is critical
            if (ufIgnore.maxRank < n || ignoreWeight > stdWeight) {
                result[0].add(newEdges[i][3])
            } else {
                // Force this edge and calculate MST weight
                val ufForce = UnionFind(n)
                ufForce.union(newEdges[i][0], newEdges[i][1])
                var forceWeight = newEdges[i][2]
                for (j in 0 until m) {
                    if (i != j && ufForce.union(newEdges[j][0], newEdges[j][1])) {
                        forceWeight += newEdges[j][2]
                    }
                }
                // If total weight is the same, the edge is pseudo-critical
                if (forceWeight == stdWeight) {
                    result[1].add(newEdges[i][3])
                }
            }
        }
        return result
    }

}
