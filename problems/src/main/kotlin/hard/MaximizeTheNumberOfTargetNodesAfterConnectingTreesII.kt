package hard

import kotlin.math.max


/**
 * There exist two undirected trees with n and m nodes, labeled from `[0, n - 1]` and `[0, m - 1]`, respectively.
 *
 * You are given two 2D integer arrays edges1 and edges2 of lengths n - 1 and m - 1, respectively,
 * where `edges1[i] = [ai, bi]` indicates that there is an edge between nodes ai and bi in the first tree and
 * `edges2[i] = [ui, vi]` indicates that there is an edge between nodes ui and vi in the second tree.
 *
 * Node u is target to node v if the number of edges on the path from u to v is even.
 * Note that a node is always target to itself.
 *
 * Return an array of n integers answer, where `answer[i]` is the maximum possible number of nodes that are target to
 * node i of the first tree if you had to connect one node from the first tree to another node in the second tree.
 *
 * Note that queries are independent from each other.
 * That is, for every query you will remove the added edge before proceeding to the next query.
 *
 * [URL](https://leetcode.com/problems/maximize-the-number-of-target-nodes-after-connecting-trees-ii/)
 */
object MaximizeTheNumberOfTargetNodesAfterConnectingTreesII {

    fun maxTargetNodes(edges1: Array<IntArray>, edges2: Array<IntArray>): IntArray {
        val n = edges1.size + 1
        val m = edges2.size + 1
        val color1 = IntArray(n)
        val color2 = IntArray(m)
        val count1 = build(edges1, color1)
        val count2 = build(edges2, color2)
        val res = IntArray(n)
        val max = max(count2[0], count2[1])

        for (i in 0..<n) {
            res[i] = count1[color1[i]] + max
        }
        return res
    }

    private fun build(edges: Array<IntArray>, color: IntArray): IntArray {
        val n = edges.size + 1
        val children = Array<ArrayList<Int>>(n) { ArrayList() }
        for (edge in edges) {
            children[edge[0]].add(edge[1])
            children[edge[1]].add(edge[0])
        }
        val res = dfs(0, -1, 0, children, color)
        return intArrayOf(res, n - res)
    }

    private fun dfs(node: Int, parent: Int, depth: Int, children: Array<ArrayList<Int>>, color: IntArray): Int {
        var res = 1 - (depth % 2)
        color[node] = depth % 2
        for (child in children[node]) {
            if (child == parent) {
                continue
            }
            res += dfs(child, node, depth + 1, children, color)
        }
        return res
    }
}
