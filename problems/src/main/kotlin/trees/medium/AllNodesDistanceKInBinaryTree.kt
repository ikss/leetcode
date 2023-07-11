package trees.medium

import data_structures.TreeNode

/**
 * Given the root of a binary tree, the value of a target node target, and an integer k,
 * return an array of the values of all nodes that have a distance k from the target node.
 *
 * You can return the answer in any order.
 *
 * [URL](https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/)
 */
object AllNodesDistanceKInBinaryTree {
    fun distanceK(root: TreeNode?, target: TreeNode, k: Int): List<Int> {
        root ?: return emptyList()

        val graph = HashMap<TreeNode, TreeNode>()
        buildGraph(root, graph)

        val result = ArrayList<Int>()
        val visited = HashSet<TreeNode>()
        val queue = java.util.ArrayDeque<TreeNode>()
        queue.offer(target)
        var k = k

        while (queue.isNotEmpty()) {
            val size = queue.size
            for (i in 0 until size) {
                val node = queue.poll()
                if (!visited.add(node)) continue

                if (k == 0) {
                    result.add(node.`val`)
                } else {
                    node.left?.let { queue.offer(it) }
                    node.right?.let { queue.offer(it) }
                    graph[node]?.let { queue.offer(it) }
                }
            }
            k--
        }
        return result
    }

    private fun buildGraph(root: TreeNode, graph: HashMap<TreeNode, TreeNode>) {
        root.left?.let {
            graph[it] = root
            buildGraph(it, graph)
        }
        root.right?.let {
            graph[it] = root
            buildGraph(it, graph)
        }
    }
}
