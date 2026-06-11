package medium

/**
 * There is an undirected tree with n nodes labeled from 1 to n, rooted at node 1.
 * The tree is represented by a 2D integer array edges of length n - 1,
 * where `edges[i] = [ui, vi]` indicates that there is an edge between nodes ui and vi.
 *
 * Initially, all edges have a weight of 0. You must assign each edge a weight of either 1 or 2.
 *
 * The cost of a path between any two nodes u and v is the total weight of all edges in the path connecting them.
 *
 * Select any one node x at the maximum depth.
 * Return the number of ways to assign edge weights in the path from node 1 to x such that its total cost is odd.
 *
 * Since the answer may be large, return it modulo 10^9 + 7.
 *
 * Note: Ignore all edges not in the path from node 1 to x.
 *
 * [URL](https://leetcode.com/problems/number-of-ways-to-assign-edge-weights-i/)
 */
object NumberOfWaysToAssignEdgeWeightsI {
    fun assignEdgeWeights(edges: Array<IntArray>): Int {
        val tree = HashMap<Int, HashSet<Int>>()

        for ((f, t) in edges) {
            tree.computeIfAbsent(f) { HashSet() }.add(t)
            tree.computeIfAbsent(t) { HashSet() }.add(f)
        }

        val height = findTreeHeight(tree)

        var result = 1
        for (i in 0 until height - 1) {
            result *= 2
            result %= 1_000_000_007
        }
        return result
    }

    private fun findTreeHeight(tree: Map<Int, Set<Int>>): Int {
        var height = 0
        var queue = java.util.ArrayDeque<Int>()
        queue.offer(1)

        val visited = HashSet<Int>()
        visited.add(1)

        while (queue.isNotEmpty()) {
            val size = queue.size

            for (i in 0 until size) {
                val curr = queue.poll()

                for (neigh in tree[curr] ?: continue) {
                    if (!visited.add(neigh)) continue
                    queue.offer(neigh)
                }
            }
            height++
        }
        return height - 1
    }
}
