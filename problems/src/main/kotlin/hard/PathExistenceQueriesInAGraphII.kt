package hard

import java.util.*

/**
 * You are given an integer n representing the number of nodes in a graph, labeled from 0 to n - 1.
 *
 * You are also given an integer array nums of length n and an integer maxDiff.
 *
 * An undirected edge exists between nodes i and j if the absolute difference between `nums[i]` and `nums[j]`
 * is at most maxDiff (i.e., `|nums[i] - nums[j]| <= maxDiff`).
 *
 * You are also given a 2D integer array queries. For each `queries[i] = [ui, vi]`,
 * find the minimum distance between nodes ui and vi. If no path exists between the two nodes, return -1 for that query.
 *
 * Return an array answer, where `answer[i]` is the result of the ith query.
 *
 * Note: The edges between the nodes are unweighted.
 *
 * [URL](https://leetcode.com/problems/path-existence-queries-in-a-graph-ii/)
 */
object PathExistenceQueriesInAGraphII {
    fun pathExistenceQueries(n: Int, nums: IntArray, maxDiff: Int, queries: Array<IntArray>): IntArray {
        val order = (0 until n).sortedBy { nums[it] }.toIntArray()
        val posOf = IntArray(n)
        for (i in 0 until n) posOf[order[i]] = i
        val sortedVal = IntArray(n) { nums[order[it]] }

        val uf = UnionFind(n)
        for (i in 1 until n) {
            if (sortedVal[i] - sortedVal[i - 1] <= maxDiff) {
                uf.union(order[i], order[i - 1])
            }
        }

        // far[i]: furthest sorted position reachable from i in a single hop.
        val far = IntArray(n)
        var right = 0
        for (i in 0 until n) {
            if (right < i) right = i
            while (right + 1 < n && sortedVal[right + 1] - sortedVal[i] <= maxDiff) right++
            far[i] = right
        }

        // Binary lifting over the "far" jump pointer, so any query resolves in O(log n).
        val log = maxOf(1, 32 - Integer.numberOfLeadingZeros(n))
        val up = Array(log) { IntArray(n) }
        up[0] = far
        for (k in 1 until log) {
            for (i in 0 until n) {
                up[k][i] = up[k - 1][up[k - 1][i]]
            }
        }

        fun minHops(from: Int, to: Int): Int {
            var lo = from
            var hi = to
            if (lo > hi) {
                val tmp = lo
                lo = hi
                hi = tmp
            }
            if (lo == hi) return 0

            var cur = lo
            var steps = 0
            for (k in log - 1 downTo 0) {
                if (up[k][cur] < hi) {
                    cur = up[k][cur]
                    steps += 1 shl k
                }
            }
            return steps + 1
        }

        val result = IntArray(queries.size)

        for (i in queries.indices) {
            val (start, end) = queries[i]

            if (start == end) {
                result[i] = 0
            } else if (uf.find(start) != uf.find(end)) {
                result[i] = -1
            } else {
                result[i] = minHops(posOf[start], posOf[end])
            }
        }

        return result
    }

    private class UnionFind(val n: Int) {
        val root = IntArray(n) { it }
        val rank = IntArray(n) { 1 }

        fun find(x: Int): Int {
            if (root[x] != x) {
                root[x] = find(root[x])
            }
            return root[x]
        }

        fun union(x: Int, y: Int): Boolean {
            var rootX = find(x)
            var rootY = find(y)
            if (rootX == rootY) return false
            if (rank[rootX] > rank[rootY]) {
                val tmp = rootX
                rootX = rootY
                rootY = tmp
            }
            root[rootX] = rootY
            rank[rootY] += rank[rootX]
            return true
        }
    }
}
