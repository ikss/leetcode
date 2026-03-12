package hard

/**
 * You are given an integer n, representing n nodes numbered from 0 to n - 1 and a list of edges, where `edges[i] = [ui, vi, si, musti]`:
 *
 * * ui and vi indicates an undirected edge between nodes ui and vi.
 * * si is the strength of the edge.
 * * musti is an integer (0 or 1). If musti == 1, the edge must be included in the spanning tree. These edges cannot be upgraded.
 *
 * You are also given an integer k, the maximum number of upgrades you can perform. Each upgrade doubles the strength
 * of an edge, and each eligible edge (with musti == 0) can be upgraded at most once.
 *
 * The stability of a spanning tree is defined as the minimum strength score among all edges included in it.
 *
 * Return the maximum possible stability of any valid spanning tree. If it is impossible to connect all nodes, return -1.
 *
 * Note: A spanning tree of a graph with n nodes is a subset of the edges that connects all nodes together
 * (i.e. the graph is connected) without forming any cycles, and uses exactly n - 1 edges.
 *
 * [URL](https://leetcode.com/problems/maximize-spanning-tree-stability-with-upgrades/)
 */
object MaximizeSpanningTreeStabilityWithUpgrades {
    private val MAX_STABILITY = 200000

    fun maxStability(n: Int, edges: Array<IntArray>, k: Int): Int {
        var result = -1
        if (edges.size < n - 1) return result

        val must = ArrayList<IntArray>()
        val optional = ArrayList<IntArray>()

        for (edge in edges) {
            if (edge[3] == 1) {
                must.add(edge)
            } else {
                optional.add(edge)
            }
        }

        if (must.size > n - 1) return result

        optional.sortByDescending { it[2] }

        var selectedInit = 0
        var minMustStability = MAX_STABILITY

        val mustDsu = DSU(IntArray(n) { it })
        for ((u, v, s) in must) {
            if (!mustDsu.union(u, v) || ++selectedInit == n) return result
            minMustStability = minOf(minMustStability, s)
        }

        var l = 0
        var r = minMustStability

        while (l < r) {
            val mid = l + (r - l + 1) / 2
            val dsu = DSU(mustDsu.parent)
            var selected = selectedInit
            var doubled = 0

            for ((u, v, s) in optional) {
                if (dsu.find(u) == dsu.find(v)) continue

                if (s >= mid) {
                    dsu.union(u, v)
                    selected++
                } else if (doubled < k && s * 2 >= mid) {
                    doubled++
                    dsu.union(u, v)
                    selected++
                } else {
                    break
                }
                if (selected == n - 1) {
                    break
                }
            }

            if (selected != n - 1) {
                r = mid - 1
            } else {
                result = mid
                l = mid
            }
        }
        return result
    }


    private class DSU(originalParent: IntArray) {
        val parent = originalParent.clone()

        fun find(node: Int): Int {
            if (parent[node] != node) {
                parent[node] = find(parent[node])
            }
            return parent[node]
        }

        fun union(node1: Int, node2: Int): Boolean {
            val px = find(node1)
            val py = find(node2)
            if (px == py) return false

            parent[px] = py
            parent[node1] = py
            return true
        }
    }
}
