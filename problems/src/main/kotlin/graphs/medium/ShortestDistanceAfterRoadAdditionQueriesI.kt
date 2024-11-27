package graphs.medium

import java.util.*

/**
 *You are given an integer n and a 2D integer array queries.
 *
 * There are n cities numbered from 0 to n - 1. Initially, there is a unidirectional
 * road from city i to city i + 1 for all 0 <= i < n - 1.
 *
 * `queries[i] = [ui, vi]` represents the addition of a new unidirectional road from city ui to city vi.
 * After each query, you need to find the length of the shortest path from city 0 to city n - 1.
 *
 * Return an array answer where for each i in the range `[0, queries.length - 1]`,
 * `answer[i]` is the length of the shortest path from city 0 to city n - 1 after processing the first i + 1 queries.
 *
 * [URL](https://leetcode.com/problems/shortest-distance-after-road-addition-queries-i/)
 */
object ShortestDistanceAfterRoadAdditionQueriesI {
    fun shortestDistanceAfterQueries(n: Int, queries: Array<IntArray>): IntArray {
        val graph = Array(n) { HashSet<Int>() }

        for (i in 1 until n) {
            graph[i - 1].add(i)
        }

        val shortest = IntArray(n) { it }
        val result = IntArray(queries.size)
        var i = 0

        for ((s, e) in queries) {
            val shortestStart = shortest[s]
            graph[s].add(e)

            val queue = java.util.ArrayDeque<Int>()
            if (shortestStart + 1 < shortest[e]) {
                shortest[e] = shortestStart + 1
                queue.offer(e)
            }

            while (queue.isNotEmpty()) {
                val curr = queue.poll()
                val currPath = shortest[curr]
                for (neigh in graph[curr]) {
                    if (shortest[neigh] > currPath + 1) {
                        shortest[neigh] = currPath + 1
                        queue.offer(neigh)
                    }
                }
            }

            result[i++] = shortest[n - 1]
        }

        return result
    }
}
