package hard

/**
 * You are given an integer n and a 2D integer array queries.
 *
 * There are n cities numbered from 0 to n - 1. Initially, there is a unidirectional road from city i
 * to city i + 1 for all 0 <= i < n - 1.
 *
 * `queries[i] = [ui, vi]` represents the addition of a new unidirectional road from city ui to city vi.
 * After each query, you need to find the length of the shortest path from city 0 to city n - 1.
 *
 * There are no two queries such that `queries[i][0] < queries[j][0] < queries[i][1] < queries[j][1]`.
 *
 * Return an array answer where for each i in the range `[0, queries.length - 1]`, `answer[i]` is the length of the
 * shortest path from city 0 to city n - 1 after processing the first i + 1 queries.
 *
 * [URL](https://leetcode.com/problems/shortest-distance-after-road-addition-queries-ii/)
 */
object ShortestDistanceAfterRoadAdditionQueriesII {
    fun shortestDistanceAfterQueries(n: Int, queries: Array<IntArray>): IntArray {
        val graph = HashMap<Int, Int>()
        for (i in 0 until n - 1) {
            graph[i] = i + 1
        }
        val result = IntArray(queries.size)
        var qi = 0
        for ((i, j) in queries) {
            if (graph.containsKey(i) && graph[i]!! < j) {
                var v = i
                while (v < j && graph.containsKey(v)) {
                    v = graph.remove(v)!!
                }
                graph[i] = j
            }
            result[qi++] = graph.size
        }
        return result
    }
}
