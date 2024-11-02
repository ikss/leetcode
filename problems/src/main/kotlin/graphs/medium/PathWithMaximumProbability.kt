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

        for (i in edges.indices) {
            val (from, to) = edges[i]
            val succ = succProb[i]

            graph.computeIfAbsent(from) { ArrayList() }.add(to to succ)
            graph.computeIfAbsent(to) { ArrayList() }.add(from to succ)
        }

        val queue = PriorityQueue<Pair<Int, Double>>(compareBy { -it.second })
        queue.offer(start to 1.0)
        val maxProb = DoubleArray(n)
        maxProb[start] = 1.0

        while (queue.isNotEmpty()) {
            val (from, succ) = queue.poll()
            if (from == end) return succ

            for ((to, stepSucc) in graph[from] ?: continue) {
                val nextSucc = succ * stepSucc
                if (nextSucc > maxProb[to]) {
                    maxProb[to] = nextSucc
                    queue.offer(to to nextSucc)
                }
            }
        }

        return maxProb[end]
    }
}
