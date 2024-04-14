package trees.easy

import data_structures.TreeNode

/**
 * Given the root of a binary tree, return the sum of all left leaves.
 *
 * A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.
 *
 * [URL](https://leetcode.com/problems/sum-of-left-leaves/)
 */
object SumOfLeftLeaves {
    fun sumOfLeftLeaves(root: TreeNode?): Int {
        root ?: return 0

        val queue = java.util.ArrayDeque<TreeNode>()
        queue.offer(root)

        var result = 0

        while (queue.isNotEmpty()) {
            val node = queue.poll()

            node.left?.let {
                if (it.left == null && it.right == null) {
                    result += it.`val`
                } else {
                    queue.offer(it)
                }
            }
            node.right?.let {
                queue.offer(it)
            }
        }

        return result
    }
}
