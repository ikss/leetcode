package graphs.medium

import java.util.*

/**
 * You are given an undirected weighted graph of n nodes (0-indexed), represented by an edge list where
 * `edges[i] = [a, b]` is an undirected edge connecting the nodes a and b with a probability of success of traversing
 * that edge `succProb[i]`.
 *
 * Given two nodes start and end, find the path with the maximum probability of success to go from start to end and
 * return its success probability.
 *
 * If there is no path from start to end, return 0. Your answer will be accepted if it differs from the correct answer
 * by at most 1e-5.
 *
 * [URL](https://leetcode.com/problems/path-with-maximum-probability/)
 */
object PathWithMaximumProbability {
    fun maxProbability(n: Int, edges: Array<IntArray>, succProb: DoubleArray, start: Int, end: Int): Double {
        val graph = HashMap<Int, ArrayList<Pair<Int, Double>>>()
        val maxProb = DoubleArray(n)

        for (i in edges.indices) {
            val (from, toe) = edges[i]
            val succ = succProb[i]

            graph.computeIfAbsent(from) { ArrayList() }.add(toe to succ)
            graph.computeIfAbsent(toe) { ArrayList() }.add(from to succ)
        }

        val queue = ArrayDeque<Pair<Int, Double>>()
        queue.offer(start to 1.0)

        while (queue.isNotEmpty()) {
            val (from, succ) = queue.poll()

            if (maxProb[from] >= succ || succ <= maxProb[end]) continue
            maxProb[from] = succ

            for ((toe, stepSucc) in graph[from] ?: continue) {
                queue.offer(toe to succ * stepSucc)
            }
        }

        return maxProb[end]
    }
}
