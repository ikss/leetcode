package medium

/**
 * Given a directed acyclic graph (DAG) of n nodes labeled from 0 to n - 1,
 * find all possible paths from node 0 to node n - 1 and return them in any order.
 *
 * The graph is given as follows: `graph[i]` is a list of all nodes you can visit from node i
 * (i.e., there is a directed edge from node i to node `graph[i][j]`).
 *
 * [URL](https://leetcode.com/problems/all-paths-from-source-to-target/)
 */
object AllPathsFromSourceToTarget {
    fun allPathsSourceTarget(graph: Array<IntArray>): List<List<Int>> {
        val source = 0
        val target = graph.size - 1

        val result = mutableListOf<List<Int>>()
        val visited = mutableListOf<Int>()
        traverse(source, target, graph, visited, result)

        return result
    }

    private fun traverse(
        current: Int,
        target: Int,
        graph: Array<IntArray>,
        visited: MutableList<Int>,
        result: MutableList<List<Int>>,
    ) {
        visited.add(current)

        if (current == target) {
            result.add(visited.toList())
            visited.removeLast()
            return
        }
        for (next in graph[current]) {
            traverse(next, target, graph, visited, result)
        }
        visited.removeLast()
    }
}
