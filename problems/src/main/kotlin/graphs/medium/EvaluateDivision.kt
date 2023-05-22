package graphs.medium

/**
 * You are given an array of variable pairs equations and an array of real numbers values,
 * where `equations[i] = [Ai, Bi]` and `values[i]` represent the equation `Ai / Bi = values[i]`.
 * Each Ai or Bi is a string that represents a single variable.
 *
 * You are also given some queries, where `queries[j] = [Cj, Dj]` represents the jth query where you must find the
 * answer for Cj / Dj = ?.
 *
 * Return the answers to all queries. If a single answer cannot be determined, return -1.0.
 *
 * [URL](https://leetcode.com/problems/evaluate-division/)
 */
object EvaluateDivision {
    fun calcEquation(equations: List<List<String>>, values: DoubleArray, queries: List<List<String>>): DoubleArray {
        val graph = HashMap<String, HashMap<String, Double>>()

        for (i in equations.indices) {
            val (start, end) = equations[i]
            val value = values[i]

            graph.computeIfAbsent(start) { HashMap() }.put(end, value)
            graph.computeIfAbsent(end) { HashMap() }.put(start, 1.0 / value)
        }

        val results = DoubleArray(queries.size)

        for (i in queries.indices) {
            val (start, end) = queries[i]
            results[i] = if (graph.containsKey(start) && graph.containsKey(end)) {
                dfs(graph, start, end, HashSet())
            } else {
                -1.0
            }
        }

        return results
    }

    private fun dfs(graph: HashMap<String, HashMap<String, Double>>, start: String, end: String, visited: HashSet<String>): Double {
        val neighbours = graph[start]
            ?: return -1.0
        if (neighbours.containsKey(end)) {
            return neighbours[end]!!
        }
        visited.add(start)

        for ((neighbour, value) in neighbours) {
            if (visited.contains(neighbour)) continue
            val res = dfs(graph, neighbour, end, visited)
            if (res == -1.0) continue
            return res * value
        }
        return -1.0
    }
}
