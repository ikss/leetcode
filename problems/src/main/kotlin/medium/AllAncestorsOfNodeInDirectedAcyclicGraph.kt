package medium

/**
 * You are given a positive integer n representing the number of nodes of a Directed Acyclic Graph (DAG).
 * The nodes are numbered from 0 to n - 1 (inclusive).
 *
 * You are also given a 2D integer array edges, where `edges[i] = [fromi, toi]` denotes that there is a unidirectional
 * edge from fromi to toi in the graph.
 *
 * Return a list answer, where` answer[i]` is the list of ancestors of the ith node, sorted in ascending order.
 *
 * A node u is an ancestor of another node v if u can reach v via a set of edges.
 *
 * [URL](https://leetcode.com/problems/all-ancestors-of-a-node-in-a-directed-acyclic-graph/)
 */
object AllAncestorsOfNodeInDirectedAcyclicGraph {
    fun getAncestors(n: Int, edges: Array<IntArray>): List<List<Int>> {
        val result = ArrayList<HashSet<Int>>(n)
        for (i in 0 until n) {
            result.add(HashSet<Int>())
        }
        val graph = HashMap<Int, ArrayList<Int>>()
        val indegree = IntArray(n)
        for ((s, e) in edges) {
            indegree[e]++
            graph.computeIfAbsent(s) { ArrayList() }.add(e)
        }

        val queue = java.util.ArrayDeque<Int>()
        for (i in indegree.indices) {
            if (indegree[i] == 0) queue.offer(i)
        }

        while (queue.isNotEmpty()) {
            val curr = queue.poll()

            for (neigh in graph[curr] ?: emptyList()) {
                result[neigh].addAll(result[curr])
                result[neigh].add(curr)
                indegree[neigh]--
                if (indegree[neigh] == 0) {
                    queue.offer(neigh)
                }
            }
        }

        return result.map { it.sorted() }
    }

}
