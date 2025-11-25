package medium

import data_structures.UnionFind

/**
 * There are n cities labeled from 1 to n. You are given the integer n and an array connections where
 * `connections[i] = [xi, yi, costi]` indicates that the cost of connecting city xi and city yi
 * (bidirectional connection) is costi.
 *
 * Return the minimum cost to connect all the n cities such that there is at least one path between each pair of cities.
 * If it is impossible to connect all the n cities, return -1,
 *
 * The cost is the sum of the connections' costs used.
 *
 * [URL](https://leetcode.com/problems/connecting-cities-with-minimum-cost/)
 */
object ConnectingCitiesWithMinimumCost {
    fun minimumCost(n: Int, connections: Array<IntArray>): Int {
        val uf = UnionFind(n + 1)

        // Sort connections based on their weights (in increasing order)
        connections.sortWith(Comparator { a, b -> a[2] - b[2] })

        // Keep track of total edges added in the MST
        var result = 0

        // Keep track of the total cost of adding all those edges
        var cost = 0
        for ((a, b, c) in connections) {
            // Do not add the edge from a to b if it is already connected
            if (uf.areConnected(a, b)) continue
            // If a and b are not connected, take union
            uf.union(a, b)
            // increment cost
            cost += c
            // increment number of edges added in the MST
            result++
        }

        // If all N nodes are connected, the MST will have a total of N - 1 edges
        return if (result == n - 1) {
            cost
        } else {
            -1
        }
    }

}