package medium

/**
 * You are given an integer n. There is an undirected graph with n vertices, numbered from 0 to n - 1.
 * You are given a 2D integer array edges where `edges[i] = [ai, bi]` denotes that there exists an undirected edge
 * connecting vertices ai and bi.
 *
 * Return the number of complete connected components of the graph.
 *
 * A connected component is a subgraph of a graph in which there exists a path between any two vertices,
 * and no vertex of the subgraph shares an edge with a vertex outside of the subgraph.
 *
 * A connected component is said to be complete if there exists an edge between every pair of its vertices.
 *
 * [URL](https://leetcode.com/problems/find-closest-node-to-given-two-nodes/)
 */
object CountTheNumberOfCompleteComponents {
    fun countCompleteComponents(n: Int, edges: Array<IntArray>): Int {
        val graph = HashMap<Int, HashSet<Int>>()

        for ((from, to) in edges) {
            graph.computeIfAbsent(from) { HashSet() }.add(to)
            graph.computeIfAbsent(to) { HashSet() }.add(from)
        }

        var result = 0

        val visited = HashSet<Int>()
        for (i in 0 until n) {
            if (i !in visited && complete(i, graph, visited)) {
                result++
            }
        }

        return result
    }

    private fun complete(node: Int, graph: Map<Int, Set<Int>>, visited: HashSet<Int>): Boolean {
        val edges = HashSet<Pair<Int, Int>>()
        val nodes = HashSet<Int>()

        val queue = java.util.ArrayDeque<Int>()
        queue.offer(node)
        nodes.add(node)

        while (queue.isNotEmpty()) {
            val curr = queue.poll()
            visited.add(curr)

            for (neigh in graph[curr] ?: emptySet()) {
                edges.add(if (curr < neigh) curr to neigh else neigh to curr)
                if (nodes.add(neigh)) {
                    queue.offer(neigh)
                }
            }
        }

        val n = nodes.size
        return n == 1 || edges.size == n * (n - 1) / 2
    }
}
