package graphs.medium

import java.util.*

/**
 * A series of highways connect n cities numbered from 0 to n - 1. You are given a 2D integer array highways where
 * `highways[i] = [city1i, city2i, tolli]` indicates that there is a highway that connects city1i and city2i,
 * allowing a car to go from city1i to city2i and vice versa for a cost of tolli.
 *
 * You are also given an integer discounts which represents the number of discounts you have.
 * You can use a discount to travel across the ith highway for a cost of tolli / 2 (integer division).
 * Each discount may only be used once, and you can only use at most one discount per highway.
 *
 * Return the minimum total cost to go from city 0 to city n - 1, or -1 if it is not possible to go from city 0
 * to city n - 1.
 *
 * [URL](https://leetcode.com/problems/minimum-cost-to-reach-city-with-discounts/)
 */
object MinimumCostToReachCityWithDiscounts {
    private data class State(
        var currCost: Int,
        var currCity: Int,
        var discountsLeft: Int,
    )

    fun minimumCost(n: Int, highways: Array<IntArray>, discounts: Int): Int {
        val graph = HashMap<Int, ArrayList<Pair<Int, Int>>>()

        for ((start, end, toll) in highways) {
            graph.computeIfAbsent(start) { ArrayList() }.add(end to toll)
            graph.computeIfAbsent(end) { ArrayList() }.add(start to toll)
        }

        val queue = PriorityQueue<State> { s1, s2 -> s1.currCost.compareTo(s2.currCost) }
        queue.offer(State(0, 0, discounts))
        val visited = HashSet<Pair<Int, Int>>()

        while (queue.isNotEmpty()) {
            val curr = queue.poll()
            if (curr.currCity == n - 1) return curr.currCost
            if (!visited.add(curr.currCity to curr.discountsLeft)) continue

            for ((neighbour, toll) in graph[curr.currCity] ?: emptyList()) {
                if (curr.discountsLeft > 0) {
                    queue.offer(State(curr.currCost + toll / 2, neighbour, curr.discountsLeft - 1))
                }
                queue.offer(State(curr.currCost + toll, neighbour, curr.discountsLeft))
            }
        }

        return -1
    }
}
