package medium

/**
 * You are given a tree (i.e. a connected, undirected graph that has no cycles) consisting of n nodes numbered from
 * 0 to n - 1 and exactly n - 1 edges. The root of the tree is the node 0, and each node of the tree has a label which
 * is a lower-case character given in the string labels (i.e. The node with the number i has the label `labels[i]`).
 *
 * The edges array is given on the form `edges[i] = [ai, bi]`, which means there is an edge
 * between nodes ai and bi in the tree.
 *
 * Return an array of size n where `ans[i]` is the number of nodes in the subtree of the ith node
 * which have the same label as node i.
 *
 * A subtree of a tree T is the tree consisting of a node in T and all of its descendant nodes.
 *
 * [URL](https://leetcode.com/problems/number-of-nodes-in-the-sub-tree-with-the-same-label/)
 */
object NumberOfNodesInTheSubTreeWithTheSameLabel {
    fun countSubTrees(n: Int, edges: Array<IntArray>, labels: String): IntArray {
        val graph = hashMapOf<Int, MutableList<Int>>()
        for ((a, b) in edges) {
            graph.computeIfAbsent(a) { ArrayList() }.add(b)
        }
        val result = IntArray(n)
        dfs(0, graph, labels, result)
        return result
    }

    private fun dfs(curr: Int, graph: Map<Int, List<Int>>, labels: String, result: IntArray): Map<Char, Int> {
        val map = mutableMapOf<Char, Int>()
        map[labels[curr]] = 1

        for (node in graph[curr] ?: emptyList()) {
            val childMap = dfs(node, graph, labels, result)
            map.apply {
                childMap.forEach { (k, v) -> merge(k, v) { oldVal, newVal -> oldVal + newVal } }
            }
        }

        result[curr] = map[labels[curr]]!!

        return map
    }
}