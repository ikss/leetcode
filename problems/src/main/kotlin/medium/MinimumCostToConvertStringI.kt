package medium

import java.util.*

/**
 * You are given two 0-indexed strings source and target, both of length n and consisting of lowercase English letters.
 * You are also given two 0-indexed character arrays original and changed, and an integer array cost, where `cost[i]`
 * represents the cost of changing the character `original[i]` to the character `changed[i]`.
 *
 * You start with the string source. In one operation, you can pick a character x from the string
 * and change it to the character y at a cost of z if there exists any index j such that `cost[j] == z`,
 * `original[j] == x`, and `changed[j] == y`.
 *
 * Return the minimum cost to convert the string source to the string target using any number of operations.
 * If it is impossible to convert source to target, return -1.
 *
 * Note that there may exist indices i, j such that `original[j] == original[i]` and `changed[j] == changed[i]`.
 *
 * [URL](https://leetcode.com/problems/minimum-cost-to-convert-string-i/)
 */
object MinimumCostToConvertStringI {
    fun minimumCost(source: String, target: String, original: CharArray, changed: CharArray, cost: IntArray): Long {
        val graph = HashMap<Char, HashMap<Char, Int>>()

        for (i in original.indices) {
            val from = original[i]
            val to = changed[i]

            graph.computeIfAbsent(from) { HashMap() }.merge(to, cost[i], ::minOf)
        }

        var result = 0L

        for (i in source.indices) {
            val from = source[i]
            val to = target[i]
            if (from == to) continue
            val charCost = findMinCostDijkstra(from, to, graph)
            if (charCost == -1L) return -1L
            result += charCost
        }

        return result

    }

    private fun findMinCostDijkstra(from: Char, to: Char, graph: HashMap<Char, HashMap<Char, Int>>): Long {
        val queue = PriorityQueue<Pair<Char, Long>> { p1, p2 -> p1.second.compareTo(p2.second) }
        queue.offer(from to 0L)

        val visited = HashMap<Char, Long>()
        visited[from] = 0L
        while (queue.isNotEmpty()) {
            val (curr, currCost) = queue.poll()
            if (curr == to) return currCost

            if (visited[curr] != null && visited[curr]!! < currCost) continue
            visited[curr] = currCost

            for ((k, v) in graph[curr] ?: continue) {
                queue.offer(k to v + currCost)
            }
        }
        return -1
    }
}