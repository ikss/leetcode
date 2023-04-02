package trees.easy

import data_structures.TreeNode
import java.util.*

/**
 * Given a binary tree, find its minimum depth.
 *
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 *
 * Note: A leaf is a node with no children.
 *
 * [URL](https://leetcode.com/problems/minimum-depth-of-binary-tree/)
 */
object MinimumDepthOfBinaryTree {
    fun minDepth(root: TreeNode?): Int {
        root ?: return 0

        val queue = ArrayDeque<TreeNode>()
        queue.offer(root)
        var level = 1

        while (queue.isNotEmpty()) {
            val size = queue.size
            for (i in 0 until size) {
                val node = queue.poll()
                if (node.left == null && node.right == null) {
                    return level
                }
                node.left?.let { queue.offer(it) }
                node.right?.let { queue.offer(it) }
            }
            level++
        }

        return level
    }
}
