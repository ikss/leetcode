package trees.hard

/**
 * ou are given a tree (i.e. a connected, undirected graph that has no cycles) rooted at node 0 consisting of n nodes
 * numbered from 0 to n - 1. The tree is represented by a 0-indexed array parent of size n, where `parent[i]`
 * is the parent of node i. Since node 0 is the root, `parent[0] == -1`.
 *
 * You are also given a string s of length n, where `s[i]` is the character assigned to node i.
 *
 * Return the length of the longest path in the tree such that no pair of adjacent nodes on the path have
 * the same character assigned to them.
 *
 * [URL](https://leetcode.com/problems/longest-path-with-different-adjacent-characters/)
 */
object LongestPathWithDifferentAdjacentCharacters {
    private var longestPath = 1

    fun longestPath(parent: IntArray, s: String): Int {
        longestPath = 1
        val n = parent.size
        val children = mutableMapOf<Int, MutableList<Int>>()
        // Start from node 1, since root node 0 does not have a parent.
        for (i in 1 until n) {
            children.computeIfAbsent(parent[i]) { ArrayList() }.add(i)
        }
        dfs(0, children, s)
        return longestPath
    }

    fun dfs(currentNode: Int, children: Map<Int, List<Int>>, s: String): Int {
        // If the node is the only child, return 1 for the currentNode itself.
        if (!children.containsKey(currentNode)) {
            return 1
        }

        // Longest and second longest path starting from currentNode (does not count the
        // currentNode itself).
        var longestChain = 0
        var secondLongestChain = 0
        for (child in children[currentNode]!!) {
            // Get the number of nodes in the longest chain starting from the child,
            // including the child.
            val longestChainStartingFromChild = dfs(child, children, s)
            // We won't move to the child if it has the same character as the currentNode.
            if (s[currentNode] == s[child]) {
                continue
            }
            // Modify the longestChain and secondLongestChain if longestChainStartingFromChild
            // is bigger.
            if (longestChainStartingFromChild > longestChain) {
                secondLongestChain = longestChain
                longestChain = longestChainStartingFromChild
            } else if (longestChainStartingFromChild > secondLongestChain) {
                secondLongestChain = longestChainStartingFromChild
            }
        }

        // Add "1" for the node itself.
        longestPath = maxOf(longestPath, longestChain + secondLongestChain + 1)
        return longestChain + 1
    }
}
