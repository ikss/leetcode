package medium

import java.util.*

/**
 * You are given a positive integer n representing n cities numbered from 1 to n. You are also given a 2D array roads,
 * where `roads[i] = [ai, bi, costi]` indicates that there is a bidirectional road between cities ai and bi
 * with a cost of traveling equal to costi.
 *
 * You can buy apples in any city you want, but some cities have different costs to buy apples.
 * You are given the 1-based array appleCost where `appleCost[i]` is the cost of buying one apple from city i.
 *
 * You start at some city, traverse through various roads, and eventually buy exactly one apple from any city.
 * After you buy that apple, you have to return back to the city you started at, but now the cost of all the roads will
 * be multiplied by a given factor k.
 *
 * Given the integer k, return a 1-based array answer of size n where `answer[i]` is the minimum total cost
 * to buy an apple if you start at city i.
 *
 * [URL](https://leetcode.com/problems/minimum-cost-to-buy-apples/)
 */
object MinimumCostToBuyApples {
    fun minCost(n: Int, roads: Array<IntArray>, appleCost: IntArray, k: Int): LongArray {
        val graph = HashMap<Int, ArrayList<Pair<Int, Int>>>()

        for ((start, end, cost) in roads) {
            graph.computeIfAbsent(start - 1) { ArrayList() }.add(end - 1 to cost)
            graph.computeIfAbsent(end - 1) { ArrayList() }.add(start - 1 to cost)
        }

        val result = LongArray(n)
        for (i in 0 until n) {
            result[i] = collectApples(i, n, graph, appleCost, k)
        }

        return result
    }

    private fun collectApples(startCity: Int, n: Int, graph: HashMap<Int, ArrayList<Pair<Int, Int>>>, appleCost: IntArray, k: Int): Long {
        val travelCosts = IntArray(n) { Int.MAX_VALUE }
        travelCosts[startCity] = 0

        val heap = PriorityQueue<Pair<Int, Int>>(Comparator.comparingInt { it.first })
        heap.offer(0 to startCity)
        var minCost = Long.MAX_VALUE

        while (!heap.isEmpty()) {
            val (travelCost, currCity) = heap.poll()

            minCost = minOf(minCost, appleCost[currCity].toLong() + (k + 1) * travelCost)

            for ((neighbor, cost) in graph[currCity] ?: continue) {
                val nextCost = travelCost + cost
                if (nextCost < travelCosts[neighbor]) {
                    travelCosts[neighbor] = nextCost
                    heap.offer(nextCost to neighbor)
                }
            }
        }
        return minCost
    }
}
