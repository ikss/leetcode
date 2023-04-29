package graphs.hard

import data_structures.UnionFind
import java.util.*

/**
 * An undirected graph of n nodes is defined by edgeList, where `edgeList[i] = [ui, vi, disi]` denotes an edge between
 * nodes ui and vi with distance disi. Note that there may be multiple edges between two nodes.
 *
 * Given an array queries, where `queries[j] = [pj, qj, limitj]`, your task is to determine for each `queries[j]`
 * whether there is a path between pj and qj such that each edge on the path has a distance strictly less than limitj.
 *
 * Return a boolean array answer, where answer.length == queries.length and the jth value of answer is true if there is
 * a path for `queries[j]` is true, and false otherwise.
 *
 * [URL](https://leetcode.com/problems/checking-existence-of-edge-length-limited-paths/)
 */
object CheckingExistenceOfEdgeLengthLimitedPaths {

    fun distanceLimitedPathsExist(n: Int, edgeList: Array<IntArray>, queries: Array<IntArray>): BooleanArray? {
        val uf = UnionFind(n)
        val queriesCount = queries.size
        val answer = BooleanArray(queriesCount)

        // Store original indices with all queries.
        val queriesWithIndex = Array(queriesCount) { IntArray(4) }
        for (i in 0 until queriesCount) {
            queriesWithIndex[i][0] = queries[i][0]
            queriesWithIndex[i][1] = queries[i][1]
            queriesWithIndex[i][2] = queries[i][2]
            queriesWithIndex[i][3] = i
        }

        // Sort all edges in increasing order of their edge weights.
        edgeList.sortBy { it[2] }
        // Sort all queries in increasing order of the limit of edge allowed.
        queriesWithIndex.sortBy { it[2] }
        var edgesIndex = 0

        // Iterate on each query one by one.
        var queryIndex = 0
        while (queryIndex < queriesCount) {
            val p = queriesWithIndex[queryIndex][0]
            val q = queriesWithIndex[queryIndex][1]
            val limit = queriesWithIndex[queryIndex][2]
            val queryOriginalIndex = queriesWithIndex[queryIndex][3]

            // We can attach all edges which satisfy the limit given by the query.
            while (edgesIndex < edgeList.size && edgeList[edgesIndex][2] < limit) {
                val node1 = edgeList[edgesIndex][0]
                val node2 = edgeList[edgesIndex][1]
                uf.union(node1, node2)
                edgesIndex += 1
            }

            // If both nodes belong to the same component, it means we can reach them.
            answer[queryOriginalIndex] = uf.areConnected(p, q)
            queryIndex += 1
        }
        return answer
    }
}

fun main() {
    val n = 3
    val edgeList = arrayOf(intArrayOf(0, 1, 2), intArrayOf(1, 2, 4), intArrayOf(2, 0, 8), intArrayOf(1, 0, 16))
    val queries = arrayOf(intArrayOf(0, 1, 2), intArrayOf(0, 2, 5))

    println(CheckingExistenceOfEdgeLengthLimitedPaths.distanceLimitedPathsExist(n, edgeList, queries).contentToString())
}