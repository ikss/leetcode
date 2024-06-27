package graphs.easy

import data_structures.UnionFind

/**
 * There is an undirected star graph consisting of n nodes labeled from 1 to n. A star graph is a graph where there
 * is one center node and exactly n - 1 edges that connect the center node with every other node.
 *
 * You are given a 2D integer array edges where each `edges[i] = [ui, vi]` indicates that there is an edge between the
 * nodes ui and vi. Return the center of the given star graph.
 *
 * [URL](https://leetcode.com/problems/find-center-of-star-graph/)
 */
object FindCenterOfStarGraph {
    fun findCenter(edges: Array<IntArray>): Int {
        val (s0, e0) = edges[0]
        val (s1, e1) = edges[1]

        return if (s0 == s1 || s0 == e1) s0 else e0
    }
}
