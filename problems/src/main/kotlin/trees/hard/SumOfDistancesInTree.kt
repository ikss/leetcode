package trees.hard

import java.util.*


/**
 * There is an undirected connected tree with n nodes labeled from 0 to n - 1 and n - 1 edges.
 *
 * You are given the integer n and the array edges where `edges[i] = [ai, bi]` indicates that
 * there is an edge between nodes ai and bi in the tree.
 *
 * Return an array answer of length n where `answer[i]` is the sum of the distances
 * between the ith node in the tree and all other nodes.
 *
 * [URL](https://leetcode.com/problems/sum-of-distances-in-tree/)
 */
object SumOfDistancesInTree {
    fun sumOfDistancesInTree(n: Int, edges: Array<IntArray>): IntArray {
        val graph = ArrayList<ArrayList<Int>>()
        val ans = IntArray(n)
        val count = IntArray(n)
        Arrays.fill(count, 1)
        for (i in 0 until n) {
            graph.add(ArrayList())
        }
        for (edge in edges) {
            graph[edge[0]].add(edge[1])
            graph[edge[1]].add(edge[0])
        }
        dfs(0, -1, graph, count, ans)
        dfs2(0, -1, graph, count, ans, n)
        return ans
    }

    fun dfs(node: Int, parent: Int, graph: ArrayList<ArrayList<Int>>, count: IntArray, ans: IntArray) {
        for (child in graph[node]) {
            if (child != parent) {
                dfs(child, node, graph, count, ans)
                count[node] += count[child]
                ans[node] += ans[child] + count[child]
            }
        }
    }

    private fun dfs2(node: Int, parent: Int, graph: ArrayList<ArrayList<Int>>, count: IntArray, ans: IntArray, n: Int) {
        for (child in graph[node]) {
            if (child != parent) {
                ans[child] = ans[node] - count[child] + n - count[child]
                dfs2(child, node, graph, count, ans, n)
            }
        }
    }
}
