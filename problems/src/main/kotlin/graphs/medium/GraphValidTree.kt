package graphs.medium

import data_structures.UnionFind
import java.util.*

/**
 * You have a graph of n nodes labeled from 0 to n - 1. You are given an integer n and a list of edges where
 * `edges[i] = [ai, bi]` indicates that there is an undirected edge between nodes ai and bi in the graph.
 *
 * Return true if the edges of the given graph make up a valid tree, and false otherwise.
 *
 * [URL](https://leetcode.com/problems/graph-valid-tree/)
 */
object GraphValidTree {
    fun validTree(n: Int, edges: Array<IntArray>): Boolean {
        val uf = UnionFind(n)

        for ((first, second) in edges) {
            if (!uf.union(first, second)) {
                return false
            }
        }

        return uf.maxRank == n
    }
}
