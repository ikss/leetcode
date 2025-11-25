package medium

import java.util.*

/**
 * You are given a positive integer n which is the number of nodes of a 0-indexed directed weighted graph and a
 * 0-indexed 2D array edges where `edges[i] = [ui, vi, wi]` indicates that there is an edge from node ui to node vi
 * with weight wi.
 *
 * You are also given a node s and a node array marked; your task is to find the minimum distance from s to any of the
 * nodes in marked.
 *
 * Return an integer denoting the minimum distance from s to any node in marked or -1 if there are no paths from s to
 * any of the marked nodes.
 *
 * [URL](https://leetcode.com/problems/find-the-closest-marked-node/)
 */
object FindTheClosestMarkedNode {
    fun minimumDistance(n: Int, edges: List<List<Int>>, s: Int, marked: IntArray): Int {
        val graph = Array<ArrayList<Pair<Int, Int>>>(n) { ArrayList() }
        val marks = marked.toSet()

        for ((start, end, weight) in edges) {
            graph[start].add(end to weight)
        }

        val weights = LongArray(n) { Long.MAX_VALUE }
        val queue = PriorityQueue<Pair<Int, Long>> { p1, p2 -> p1.second.compareTo(p2.second) }
        queue.offer(s to 0)

        while (queue.isNotEmpty()) {
            val (curr, currWeight) = queue.poll()
            if (curr in marked) {
                return currWeight.toInt()
            }
            if (weights[curr] < currWeight) continue

            for ((neigh, neighWeight) in graph[curr]) {
                if (currWeight + neighWeight >= weights[neigh]) {
                    continue
                }
                weights[neigh] = currWeight + neighWeight
                queue.offer(neigh to weights[neigh])
            }
        }

        return -1
    }
}
