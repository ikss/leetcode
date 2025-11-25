package hard

import java.util.*

/**
 * There is an undirected tree with n nodes labeled from 0 to n - 1. You are given the integer n and a 2D integer array
 * edges of length n - 1, where edges[i] = [ai, bi] indicates that there is an edge between nodes ai and bi in the tree.
 *
 * You are also given a 0-indexed integer array values of length n, where `values[i]` is the value associated with the
 * ith node, and an integer k.
 *
 * A valid split of the tree is obtained by removing any set of edges, possibly empty, from the tree such that the
 * resulting components all have values that are divisible by k, where the value of a connected component is the sum
 * of the values of its nodes.
 *
 * Return the maximum number of components in any valid split.
 *
 * [URL](https://leetcode.com/problems/maximum-number-of-k-divisible-components/)
 */
object MaximumNumberOfKDivisibleComponents {
    fun maxKDivisibleComponents(n: Int, edges: Array<IntArray>, values: IntArray, k: Int): Int {
        if (n < 2) return 1

        val graph = Array(n) { ArrayList<Int>() }
        val inDegree = IntArray(n)

        for ((node1, node2) in edges) {
            graph[node1].add(node2)
            graph[node2].add(node1)
            inDegree[node1]++
            inDegree[node2]++
        }

        val longValues = LongArray(n) { values[it].toLong() }

        val queue = ArrayDeque<Int>()
        for (node in 0 until n) {
            if (inDegree[node] == 1) {
                queue.offer(node)
            }
        }

        var result = 0
        while (!queue.isEmpty()) {
            val currentNode = queue.poll()
            inDegree[currentNode]--

            var addValue = 0L

            if (longValues[currentNode] % k == 0L) {
                result++
            } else {
                addValue = longValues[currentNode] % k
            }

            for (neighborNode in graph[currentNode]) {
                if (inDegree[neighborNode] == 0) {
                    continue
                }

                longValues[neighborNode] += addValue

                if (--inDegree[neighborNode] == 1) {
                    queue.offer(neighborNode)
                }
            }
        }

        return result
    }
}
