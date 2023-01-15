package trees.hard

import data_structures.UnionFind
import java.util.*

/**
 * There is a tree (i.e. a connected, undirected graph with no cycles) consisting of n nodes numbered from
 * 0 to n - 1 and exactly n - 1 edges.
 *
 * You are given a 0-indexed integer array vals of length n where `vals[i]` denotes the value of the ith node.
 * You are also given a 2D integer array edges where `edges[i] = [ai, bi]` denotes that there exists an undirected edge
 * connecting nodes ai and bi.
 *
 * A __good path__ is a simple path that satisfies the following conditions:
 *
 * The starting node and the ending node have the same value.
 * All nodes between the starting node and the ending node have values less than or equal to the starting node
 * (i.e. the starting node's value should be the maximum value along the path).
 * Return the number of distinct good paths.
 *
 * Note that a path and its reverse are counted as the same path. For example, 0 -> 1 is considered to be
 * the same as 1 -> 0. A single node is also considered as a valid path.
 *
 * [URL](https://leetcode.com/problems/number-of-good-paths/)
 */
object NumberOfGoodPaths {

    fun numberOfGoodPaths(vals: IntArray, edges: Array<IntArray>): Int {
        val adj: MutableMap<Int, MutableList<Int>> = HashMap()
        for ((a, b) in edges) {
            adj.computeIfAbsent(a) { ArrayList() }.add(b)
            adj.computeIfAbsent(b) { ArrayList() }.add(a)
        }
        val n = vals.size
        // Mapping from value to all the nodes having the same value in sorted order of
        // values.
        val valuesToNodes = TreeMap<Int, MutableList<Int>>()
        for (i in 0 until n) {
            valuesToNodes.computeIfAbsent(vals[i]) { ArrayList() }.add(i)
        }
        val dsu = UnionFind(n)
        var goodPaths = 0

        // Iterate over all the nodes with the same value in sorted order, starting from
        // the lowest value.
        for (value in valuesToNodes.keys) {
            // For every node in nodes, combine the sets of the node and its neighbors into
            // one set.
            for (node in valuesToNodes[value]!!) {
                for (neighbor in adj[node] ?: emptyList()) {
                    // Only choose neighbors with a smaller value, as there is no point in
                    // traversing to other neighbors.
                    if (vals[node] >= vals[neighbor]) {
                        dsu.union(node, neighbor)
                    }
                }
            }
            // Map to compute the number of nodes under observation (with the same values)
            // in each of the sets.
            val group = hashMapOf<Int, Int>()
            // Iterate over all the nodes. Get the set of each node and increase the count
            // of the set by 1.
            for (u in valuesToNodes[value]!!) {
                group.merge(dsu.find(u), 1, Integer::sum)
            }
            // For each set of "size", add size * (size + 1) / 2 to the number of goodPaths.
            for (key in group.keys) {
                val size = group[key]!!
                goodPaths += size * (size + 1) / 2
            }
        }
        return goodPaths
    }
}
