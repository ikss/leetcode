package data_structures.other_data_structures.medium

import java.util.*


/**
 * In this problem, a tree is an undirected graph that is connected and has no cycles.
 *
 * You are given a graph that started as a tree with n nodes labeled from 1 to n, with one additional edge added.
 * The added edge has two different vertices chosen from 1 to n, and was not an edge that already existed.
 * The graph is represented as an array edges of length n where `edges[i] = [ai, bi]` indicates that there is an edge
 * between nodes ai and bi in the graph.
 *
 * Return an edge that can be removed so that the resulting graph is a tree of n nodes. If there are multiple answers,
 * return the answer that occurs last in the input.
 *
 * [URL](https://leetcode.com/problems/redundant-connection/)
 */
object RedundantConnection {
    var MAX_EDGE_VAL = 1000

    fun findRedundantConnectionDfs(edges: Array<IntArray>): IntArray {
        val graph = Array(MAX_EDGE_VAL + 1) { arrayListOf<Int>() }
        val seen = hashSetOf<Int>()
        for (edge in edges) {
            seen.clear()
            val (from, to) = edge
            val graph0 = graph[from]
            val graph1 = graph[to]
            if (graph0.isNotEmpty() && graph1.isNotEmpty() && dfs(graph, from, to, seen)) {
                return edge
            }
            graph0.add(to)
            graph1.add(from)
        }
        throw AssertionError()
    }

    private fun dfs(graph: Array<ArrayList<Int>>, source: Int, target: Int, seen: HashSet<Int>): Boolean {
        if (seen.contains(source)) return false
        seen.add(source)
        if (source == target) return true
        for (nei in graph[source]) {
            if (dfs(graph, nei, target, seen)) return true
        }
        return false
    }

    fun findRedundantConnectionDsu(edges: Array<IntArray>): IntArray {
        val dsu = DSU(MAX_EDGE_VAL + 1)
        for (edge in edges) {
            if (!dsu.union(edge[0], edge[1])) return edge
        }
        throw AssertionError()
    }

    internal class DSU(size: Int) {
        private val parent = IntArray(size) { it }
        private val rank = IntArray(size)

        fun find(x: Int): Int {
            if (parent[x] != x) parent[x] = find(parent[x])
            return parent[x]
        }

        fun union(x: Int, y: Int): Boolean {
            val xr = find(x)
            val yr = find(y)
            if (xr == yr) {
                return false
            } else if (rank[xr] < rank[yr]) {
                parent[xr] = yr
            } else if (rank[xr] > rank[yr]) {
                parent[yr] = xr
            } else {
                parent[yr] = xr
                rank[xr]++
            }
            return true
        }
    }
}
