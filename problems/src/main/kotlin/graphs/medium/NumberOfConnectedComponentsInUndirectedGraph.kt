package graphs.medium

/**
 * You have a graph of n nodes. You are given an integer n and an array edges where `edges[i] = [ai, bi]`
 * indicates that there is an edge between ai and bi in the graph.
 *
 * Return the number of connected components in the graph.
 *
 * [URL](https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/)
 */
object NumberOfConnectedComponentsInUndirectedGraph {
    fun countComponents(n: Int, edges: Array<IntArray>): Int {
        val uf = UnionFind(n)

        for ((from, to) in edges) {
            uf.union(from, to)
        }

        return uf.components
    }

    private class UnionFind(n: Int) {
        var components = n
        val ranks = IntArray(n) { 1 }
        val parents = IntArray(n) { it }

        fun find(x: Int): Int {
            if (parents[x] == x) {
                return x
            }

            parents[x] = find(parents[x])

            return parents[x]
        }

        fun union(x: Int, y: Int) {
            val parentx = find(x)
            val parenty = find(y)

            if (parentx == parenty) {
                return
            }
            components--

            val (parent, child) = if (ranks[parentx] >= ranks[parenty]) parentx to parenty else parenty to parentx

            parents[child] = parent
            ranks[parent] += ranks[child]
        }
    }
}
