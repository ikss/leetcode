package medium


/**
 * There exist two undirected trees with n and m nodes, with distinct labels in ranges `[0, n - 1]` and `[0, m - 1]`,
 * respectively.
 *
 * You are given two 2D integer arrays edges1 and edges2 of lengths n - 1 and m - 1, respectively,
 * where `edges1[i] = [ai, bi]` indicates that there is an edge between nodes ai and bi in the first tree and
 * `edges2[i] = [ui, vi]` indicates that there is an edge between nodes ui and vi in the second tree.
 * You are also given an integer k.
 *
 * Node u is target to node v if the number of edges on the path from u to v is less than or equal to k.
 * Note that a node is always target to itself.
 *
 * Return an array of n integers answer, where `answer[i]` is the maximum possible number of nodes target to node i of
 * the first tree if you have to connect one node from the first tree to another node in the second tree.
 *
 * Note that queries are independent from each other.
 * That is, for every query you will remove the added edge before proceeding to the next query.
 *
 * [URL](https://leetcode.com/problems/maximize-the-number-of-target-nodes-after-connecting-trees-i/)
 */
object MaximizeTheNumberOfTargetNodesAfterConnectingTreesI {
    fun maxTargetNodes(edges1: Array<IntArray>, edges2: Array<IntArray>, k: Int): IntArray {
        val n = edges1.size + 1
        val count1 = build(edges1, k)
        val count2 = build(edges2, k - 1)
        var maxCount2 = 0
        for (c in count2) {
            if (c > maxCount2) {
                maxCount2 = c
            }
        }
        val result = IntArray(n)
        for (i in 0..<n) {
            result[i] = count1[i] + maxCount2
        }
        return result
    }

    private fun build(edges: Array<IntArray>, k: Int): IntArray {
        val n = edges.size + 1
        val children = Array<ArrayList<Int>>(n) { ArrayList() }
        for (edge in edges) {
            children[edge[0]].add(edge[1])
            children[edge[1]].add(edge[0])
        }
        val res = IntArray(n)
        for (i in 0..<n) {
            res[i] = dfs(i, -1, children, k)
        }
        return res
    }

    private fun dfs(node: Int, parent: Int, children: Array<ArrayList<Int>>, k: Int): Int {
        if (k < 0) {
            return 0
        }
        var result = 1
        for (child in children[node]) {
            if (child == parent) {
                continue
            }
            result += dfs(child, node, children, k - 1)
        }
        return result
    }
}
