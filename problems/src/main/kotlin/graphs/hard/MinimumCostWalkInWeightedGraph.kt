package graphs.hard

import java.util.*

/**
 * There is an undirected weighted graph with n vertices labeled from 0 to n - 1.
 *
 * You are given the integer n and an array edges, where `edges[i] = [ui, vi, wi]` indicates that there is an edge
 * between vertices ui and vi with a weight of wi.
 *
 * A walk on a graph is a sequence of vertices and edges. The walk starts and ends with a vertex, and each edge
 * connects the vertex that comes before it and the vertex that comes after it. It's important to note that a walk may
 * visit the same edge or vertex more than once.
 *
 * The cost of a walk starting at node u and ending at node v is defined as the bitwise AND of the weights of the edges
 * traversed during the walk. In other words, if the sequence of edge weights encountered during the walk is
 * w0, w1, w2, ..., wk, then the cost is calculated as w0 & w1 & w2 & ... & wk, where & denotes the bitwise AND operator.
 *
 * You are also given a 2D array query, where `query[i] = [si, ti]`. For each query, you need to find the minimum cost
 * of the walk starting at vertex si and ending at vertex ti. If there exists no such walk, the answer is -1.
 *
 * Return the array answer, where `answer[i]` denotes the minimum cost of a walk for query i.
 *
 * [URL](https://leetcode.com/problems/find-critical-and-pseudo-critical-edges-in-minimum-spanning-tree/)
 */
object MinimumCostWalkInWeightedGraph {
    fun minimumCost(n: Int, edges: Array<IntArray>, query: Array<IntArray>): IntArray {
        val uf = UnionFind(n)

        for ((from, to, cost) in edges) {
            uf.union(from, to, cost)
        }

        val result = IntArray(query.size)

        var i = 0
        for ((from, to) in query) {
            result[i++] = uf.getCost(from, to)
        }

        return result
    }

    private class UnionFind(n: Int) {
        val ranks = IntArray(n) { 1 }
        val parents = IntArray(n) { it }
        val costs = IntArray(n) { Int.MAX_VALUE }

        fun find(x: Int): Int {
            var parent = parents[x]

            while (parents[parent] != parent) {
                parent = parents[parent]
            }

            return parent
        }

        fun union(x: Int, y: Int, cost: Int) {
            val parentx = find(x)
            val parenty = find(y)

            val (parent, child) = if (ranks[parentx] >= ranks[parenty]) parentx to parenty else parenty to parentx

            costs[parent] = costs[parent] and costs[child] and cost
            ranks[parent] += ranks[child]
            parents[child] = parent
        }

        fun getCost(x: Int, y: Int): Int {
            val parentx = find(x)
            val parenty = find(y)

            if (parentx != parenty) {
                return -1
            }

            return costs[parentx]
        }
    }

}
