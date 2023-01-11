package trees.medium

/**
 * Given an undirected tree consisting of n vertices numbered from 0 to n-1, which has some apples in their vertices.
 * You spend 1 second to walk over one edge of the tree. Return the minimum time in seconds you have to spend to collect
 * all apples in the tree, starting at vertex 0 and coming back to this vertex.
 *
 * The edges of the undirected tree are given in the array edges, where `edges[i] = [ai, bi]` means that exists an edge
 * connecting the vertices ai and bi. Additionally, there is a boolean array hasApple, where `hasApple[i] = true` means
 * that vertex i has an apple; otherwise, it does not have any apple.
 *
 * [URL](https://leetcode.com/problems/minimum-time-to-collect-all-apples-in-a-tree/)
 */
object MinimumTimeToCollectAllApplesInTree {
    fun minTime(n: Int, edges: Array<IntArray>, hasApple: List<Boolean>): Int {
        val adj = hashMapOf<Int, MutableList<Int>>()
        for (edge in edges) {
            val a = edge[0]
            val b = edge[1]
            adj.computeIfAbsent(a) { ArrayList() }.add(b)
            adj.computeIfAbsent(b) { ArrayList() }.add(a)
        }
        return dfs(0, -1, adj, hasApple)
    }

    private fun dfs(node: Int, parent: Int, adj: Map<Int, List<Int>>, hasApple: List<Boolean>): Int {
        if (!adj.containsKey(node)) {
            return 0
        }
        var totalTime = 0
        var childTime: Int
        for (child in adj[node]!!) {
            if (child == parent) {
                continue
            }
            childTime = dfs(child, node, adj, hasApple)
            // childTime > 0 indicates subtree of child has apples. Since the root node of the
            // subtree does not contribute to the time, even if it has an apple, we have to check it
            // independently.
            if (childTime > 0 || hasApple[child]) {
                totalTime += childTime + 2
            }
        }
        return totalTime
    }
}
