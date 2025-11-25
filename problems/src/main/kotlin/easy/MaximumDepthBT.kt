package easy

import data_structures.TreeNode

/**
 * Given the root of a binary tree, return its maximum depth.
 *
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node
 * down to the farthest leaf node.
 *
 * [URL](https://leetcode.com/problems/validate-binary-search-tree/)
 */
object MaximumDepthBT {
    fun maxDepthRecursion(root: TreeNode?): Int {
        if (root == null) return 0
        val left = maxDepthRecursion(root.left)
        val right = maxDepthRecursion(root.right)
        return maxOf(left, right) + 1
    }

    fun maxDepthQueue(root: TreeNode?): Int {
        if (root == null) return 0
        var result = 0
        val queue = java.util.ArrayDeque<TreeNode>()
        queue.offer(root)

        while (!queue.isEmpty()) {
            val size = queue.size
            for (i in 0 until size) {
                val node = queue.poll()
                node.left?.let { queue.offer(it) }
                node.right?.let { queue.offer(it) }
            }
            result++
        }
        return result
    }
}
