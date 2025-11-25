package medium

import data_structures.TreeNode

/**
 * Given the root of a binary tree, return true if you can partition the tree into two trees
 * with equal sums of values after removing exactly one edge on the original tree.
 *
 * [URL](https://leetcode.com/problems/equal-tree-partition/)
 */
object EqualTreePartition {
    fun checkEqualTree(root: TreeNode?): Boolean {
        if (root == null) {
            return false
        }

        val total = fillSums(root)

        return canPartition(root, total)
    }

    private fun fillSums(node: TreeNode): Int {
        val left = node.left?.let { fillSums(it) } ?: 0
        val right = node.right?.let { fillSums(it) } ?: 0

        val total = left + right + node.`val`

        node.`val` = total

        return total
    }

    private fun canPartition(node: TreeNode, total: Int): Boolean {
        if (node.left == null && node.right == null) {
            return false
        }
        val sumLeft = node.left?.`val` ?: 0
        val sumRight = node.right?.`val` ?: 0

        if (node.left != null && sumLeft == total - sumLeft || node.right != null && sumRight == total - sumRight) {
            return true
        }

        val splitLeft = node.left?.let { canPartition(it, total) } ?: false
        val splitRight = node.right?.let { canPartition(it, total) } ?: false

        return splitLeft || splitRight
    }
}
