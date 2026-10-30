package medium

import java.util.ArrayDeque
import java.util.PriorityQueue

/**
 * You are given an integer n representing the number of nodes in a directed weighted graph, numbered from 0 to n - 1.
 * This is represented by a 2D integer array edges,
 * where `edges[i] = [ui, vi, wi]` represents a directed edge from node ui to node vi with weight wi.
 *
 * You are also given a string labels of length n, where `labels[i]` is the character assigned to node i, and an integer k.
 *
 * Return the minimum total edge weight of a path from node 0 to node n - 1 such that the concatenation of the labels
 * of the nodes along the path contains at most k consecutive identical characters. If no valid path exists, return -1.
 *
 * [URL](https://leetcode.com/problems/shortest-path-with-at-most-k-consecutive-identical-characters/)
 */
object ShortestPathWithAtMostKConsecutiveIdenticalCharacters {
    private data class Edge(
        val index: Int,
        val weight: Int,
    )

    private data class State(
        val currIndex: Int,
        val totalWeight: Int,
        val lastCharCount: Int,
    )

    fun shortestPath(n: Int, edges: Array<IntArray>, labels: String, k: Int): Int {
        val graph = HashMap<Int, ArrayList<Edge>>()

        for ((from, to, w) in edges) {
            graph.computeIfAbsent(from) { ArrayList() }.add(Edge(to, w))
        }

        val queue = PriorityQueue<State> { s1, s2 ->
            if (s1.totalWeight == s2.totalWeight) {
                s1.lastCharCount - s2.lastCharCount
            } else {
                s1.totalWeight - s2.totalWeight
            }
        }

        queue.offer(State(currIndex = 0, totalWeight = 0, lastCharCount = 1))
        val seen = HashMap<Pair<Int, Int>, Int>()
        seen[0 to 1] = 0
        while (queue.isNotEmpty()) {
            val curr = queue.poll()

            if (curr.currIndex == n - 1) {
                return curr.totalWeight
            }

            for ((nextIndex, nextWeight) in graph[curr.currIndex] ?: continue) {
                val nextCount = if (labels[nextIndex] == labels[curr.currIndex]) {
                    if (curr.lastCharCount == k) continue
                    curr.lastCharCount + 1
                } else {
                    1
                }
                val newWeight = curr.totalWeight + nextWeight
                val prevSeen = seen[nextIndex to nextCount]
                if (prevSeen != null && prevSeen <= newWeight) continue
                seen[nextIndex to nextCount] = newWeight

                queue.offer(State(currIndex = nextIndex, totalWeight = newWeight, lastCharCount = nextCount))
            }
        }

        return -1
    }
}
