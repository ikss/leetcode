package medium

import java.util.*

/**
 * You are given an integer n representing the number of nodes in a graph, labeled from 0 to n - 1.
 *
 * You are also given an integer array nums of length n sorted in non-decreasing order, and an integer maxDiff.
 *
 * An undirected edge exists between nodes i and j if the absolute difference between `nums[i]` and `nums[j]`
 * is at most maxDiff (i.e., `|nums[i] - nums[j]| <= maxDiff`).
 *
 * You are also given a 2D integer array queries. For each `queries[i] = [ui, vi]`,
 * determine whether there exists a path between nodes ui and vi.
 *
 * Return a boolean array answer, where `answer[i] is true if there exists a path between ui and vi
 * in the ith query and false otherwise.
 *
 * [URL](https://leetcode.com/problems/path-existence-queries-in-a-graph-i/)
 */
object PathExistenceQueriesInAGraphI {
    fun pathExistenceQueries(n: Int, nums: IntArray, maxDiff: Int, queries: Array<IntArray>): BooleanArray {
        val parents = TreeMap<Int, Int>()
        parents[0] = 0

        var prevNum = nums[0]
        var prevParent = 0

        for (node in 1 until n) {
            val nodeNum = nums[node]
            if (prevNum + maxDiff >= nodeNum) {
                prevNum = nodeNum
                continue
            }

            prevNum = nodeNum
            parents[node - 1] = prevParent
            parents[node] = node
            prevParent = node
        }
        parents[n - 1] = prevParent

        val result = BooleanArray(queries.size)

        for (i in queries.indices) {
            val (start, end) = queries[i]

            val startParent = parents.floorEntry(start)!!.value
            val endParent = parents.ceilingEntry(end)!!.value

            result[i] = startParent == endParent
        }

        return result
    }
}
