package hard

import java.util.*

/**
 * There are n cities numbered from 0 to n-1. Given the array edges where `edges[i] = [fromi, toi, weighti]` represents
 * a bidirectional and weighted edge between cities fromi and toi, and given the integer distanceThreshold.
 *
 * Return the city with the smallest number of cities that are reachable through some path and whose distance is at most
 * distanceThreshold, If there are multiple such cities, return the city with the greatest number.
 *
 * Notice that the distance of a path connecting cities i and j is equal to the sum of the edges' weights along that path.
 *
 * [URL](https://leetcode.com/problems/find-the-city-with-the-smallest-number-of-neighbors-at-a-threshold-distance/)
 */
object FindTheCityWithTheSmallestNumberOfNeighborsAtThresholdDistance {
    fun findTheCity(n: Int, edges: Array<IntArray>, distanceThreshold: Int): Int {
        val graph = HashMap<Int, ArrayList<Pair<Int, Int>>>()

        for ((start, end, weight) in edges) {
            graph.computeIfAbsent(start) { ArrayList() }.add(end to weight)
            graph.computeIfAbsent(end) { ArrayList() }.add(start to weight)
        }

        val distances = Array(n) { IntArray(n) { Int.MAX_VALUE } }

        for (start in 0 until n) {
            findDistancesDijkstra(start, graph, distances[start])
        }

        return fewestNeighCity(distances, distanceThreshold)
    }

    private fun findDistancesDijkstra(
        start: Int,
        graph: HashMap<Int, ArrayList<Pair<Int, Int>>>,
        distances: IntArray,
    ) {
        val priorityQueue = PriorityQueue<Pair<Int, Int>> { p1, p2 -> p1.second - p2.second }
        priorityQueue.offer(start to 0)

        distances[start] = 0

        while (!priorityQueue.isEmpty()) {
            val (curr, currDistance) = priorityQueue.poll()
            if (currDistance > distances[curr]) {
                continue
            }

            for ((neigh, weight) in graph[curr] ?: continue) {
                val newDistance = currDistance + weight
                if (distances[neigh] <= newDistance) continue

                distances[neigh] = newDistance
                priorityQueue.offer(neigh to newDistance)
            }
        }
    }

    private fun fewestNeighCity(distances: Array<IntArray>, distanceThreshold: Int): Int {
        var result = -1
        var fewestReachableCount = distances.size

        for (i in distances.indices) {
            var reachableCount = 0
            for (j in distances.indices) {
                if (i == j) continue

                if (distances[i][j] <= distanceThreshold) {
                    reachableCount++
                }
            }

            if (reachableCount <= fewestReachableCount) {
                fewestReachableCount = reachableCount
                result = i
            }
        }
        return result
    }

}
