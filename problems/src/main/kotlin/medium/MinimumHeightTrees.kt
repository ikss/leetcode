package medium

/**
 * A tree is an undirected graph in which any two vertices are connected by exactly one path.
 * In other words, any connected graph without simple cycles is a tree.
 *
 * Given a tree of n nodes labelled from 0 to n - 1, and an array of n - 1 edges where `edges[i] = [ai, bi]` indicates
 * that there is an undirected edge between the two nodes ai and bi in the tree,
 * you can choose any node of the tree as the root. When you select a node x as the root, the result tree has height h.
 * Among all possible rooted trees, those with minimum height (i.e. min(h))  are called minimum height trees (MHTs).
 *
 * Return a list of all MHTs' root labels. You can return the answer in any order.
 *
 * The height of a rooted tree is the number of edges on the longest downward path between the root and a leaf.
 *
 * [URL](https://leetcode.com/problems/minimum-height-trees/)
 */
object MinimumHeightTrees {
    fun findMinHeightTreesList(n: Int, edges: Array<IntArray>): List<Int> {
        val result = ArrayList<Int>()
        if (n < 3) {
            for (node in 0 until n) {
                result.add(node)
            }
            return result
        }

        val graph = ArrayList<HashSet<Int>>(n)
        for (i in 0 until n) {
            graph.add(HashSet())
        }

        for ((start, end) in edges) {
            graph[start].add(end)
            graph[end].add(start)
        }

        var leaves = ArrayList<Int>()

        for (i in 0 until n) {
            if (graph[i].size == 1) {
                leaves.add(i)
            }
        }
        var remaining = n
        while (remaining > 2) {
            val newLeaves = ArrayList<Int>()

            remaining -= leaves.size
            for (curr in leaves) {
                val neighbour = graph[curr].first()
                graph[neighbour].remove(curr)
                if (graph[neighbour].size == 1) {
                    newLeaves.add(neighbour)
                }
            }
            leaves = newLeaves
        }
        return leaves
    }

    fun findMinHeightTreesQueue(n: Int, edges: Array<IntArray>): List<Int> {
        if (n < 3) {
            return listOf(0, 1)
        }

        val graph = Array(n) { HashSet<Int>() }

        for ((s, e) in edges) {
            graph[s].add(e)
            graph[e].add(s)
        }

        val leaves = java.util.ArrayDeque<Int>()

        for (i in graph.indices) {
            val set = graph[i]
            if (set.size == 1) {
                leaves.offer(i)
            }
        }
        var n = n

        while (n > 2) {
            repeat(leaves.size) {
                val l = leaves.poll()

                for (neigh in graph[l]) {
                    graph[neigh].remove(l)
                    if (graph[neigh].size == 1) {
                        leaves.offer(neigh)
                    }
                }
                n--
            }
        }

        return leaves.toList()
    }
}
