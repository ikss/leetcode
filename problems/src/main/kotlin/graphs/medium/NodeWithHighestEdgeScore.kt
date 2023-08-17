package graphs.medium

/**
 * You are given a directed graph with n nodes labeled from 0 to n - 1, where each node has exactly one outgoing edge.
 *
 * The graph is represented by a given 0-indexed integer array edges of length n, where `edges[i]` indicates that
 * there is a directed edge from node i to node `edges[i]`.
 *
 * The edge score of a node i is defined as the sum of the labels of all the nodes that have an edge pointing to i.
 *
 * Return the node with the highest edge score. If multiple nodes have the same edge score,
 * return the node with the smallest index.
 *
 * [URL](https://leetcode.com/problems/node-with-highest-edge-score/)
 */
object NodeWithHighestEdgeScore {
    fun edgeScore(edges: IntArray): Int {
        val n = edges.size
        val result = LongArray(n)

        var max = Long.MIN_VALUE
        var imax = Int.MAX_VALUE
        for (from in 0 until n) {
            val to = edges[from]
            result[to] += from.toLong()
            if (result[to] > max || (result[to] == max && to < imax)) {
                max = result[to]
                imax = to
            }
        }
        return imax
    }
}