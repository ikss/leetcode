package medium

import data_structures.TreeNode

/**
 * Given the root of a binary tree, return the leftmost value in the last row of the tree.
 *
 * [URL](https://leetcode.com/problems/find-bottom-left-tree-value/)
 */
object FindBottomLeftTreeValue {
    fun findBottomLeftValue(root: TreeNode): Int {
        val queue = java.util.ArrayDeque<TreeNode>()
        var current = root
        queue.add(current)

        while (!queue.isEmpty()) {
            current = queue.poll()
            current.right?.let(queue::add)
            current.left?.let(queue::add)
        }
        return current.`val`
    }
}
