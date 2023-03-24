package graphs.medium

import java.util.*

/**
 * There are n cities numbered from 0 to n - 1 and n - 1 roads such that there is only one way to travel between two
 * different cities (this network form a tree). Last year, The ministry of transport decided to orient the roads in one
 * direction because they are too narrow.
 *
 * Roads are represented by connections where `connections[i] = [ai, bi]` represents a road from city ai to city bi.
 *
 * This year, there will be a big event in the capital (city 0), and many people want to travel to this city.
 *
 * Your task consists of reorienting some roads such that each city can visit the city 0.
 * Return the minimum number of edges changed.
 *
 * It's guaranteed that each city can reach city 0 after reorder.
 *
 * [URL](https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/)
 */
object ReorderRoutesToMakeAllPathsLeadToTheCityZero {
    fun minReorder(n: Int, connections: Array<IntArray>): Int {
        val graph = HashMap<Int, ArrayList<Pair<Int, Int>>>()

        for ((s, e) in connections) {
            graph.computeIfAbsent(s) { ArrayList() }.add(e to 1)
            graph.computeIfAbsent(e) { ArrayList() }.add(s to 0)
        }

        return bfs(n, graph)
    }

    private fun bfs(n: Int, graph: Map<Int, List<Pair<Int, Int>>>): Int {
        val queue = ArrayDeque<Int>()
        queue.offer(0)

        val visited = BooleanArray(n)
        visited[0] = true

        var result = 0
        while (!queue.isEmpty()) {
            val neighbours = graph[queue.poll()]
                ?: continue

            for ((neighbour, sign) in neighbours) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true
                    result += sign
                    queue.offer(neighbour)
                }
            }
        }

        return result
    }
}
