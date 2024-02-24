package trees.medium

/**
 * The diameter of a tree is the number of edges in the longest path in that tree.
 *
 * There is an undirected tree of n nodes labeled from 0 to n - 1.
 * You are given a 2D array edges where edges.length == n - 1 and `edges[i] = [ai, bi]` indicates that there is an
 * undirected edge between nodes ai and bi in the tree.
 *
 * Return the diameter of the tree.
 *
 *  [URL](https://leetcode.com/problems/tree-diameter/)
 */
object TreeDiameter {
    private var result = 0

    fun treeDiameterDfs(edges: Array<IntArray>): Int {
        result = 0
        val graph = HashMap<Int, ArrayList<Int>>()
        val indirection = IntArray(edges.size + 1)

        for ((start, end) in edges) {
            indirection[end]++
            graph.computeIfAbsent(start) { ArrayList() }.add(end)
            graph.computeIfAbsent(end) { ArrayList() }.add(start)
        }

        val start = indirection.indexOfFirst { it == 0 }

        traverse(start, graph, hashSetOf())

        return result
    }

    private fun traverse(node: Int, graph: HashMap<Int, ArrayList<Int>>, visited: HashSet<Int>): Int {
        val children = graph[node] ?: return 0
        visited.add(node)

        var max = 0
        var secondMax = 0
        for (c in children) {
            if (c in visited) continue
            val depth = traverse(c, graph, visited)
            if (depth > max) {
                secondMax = max
                max = depth
            } else if (depth > secondMax) {
                secondMax = depth
            }
        }

        result = maxOf(result, max + secondMax)

        return max + 1
    }
}