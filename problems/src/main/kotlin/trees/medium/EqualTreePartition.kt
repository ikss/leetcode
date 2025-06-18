package trees.medium

import data_structures.TreeNode
import java.util.*

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
        val sums = IdentityHashMap<TreeNode, Long>()
        val total = fillSums(root, sums)

        return canPartition(root, sums, total)
    }

    private fun fillSums(node: TreeNode, sums: IdentityHashMap<TreeNode, Long>): Long {
        val left = node.left?.let { fillSums(it, sums) } ?: 0
        val right = node.right?.let { fillSums(it, sums) } ?: 0

        val total = left + right + node.`val`

        sums[node] = total

        return total
    }

    private fun canPartition(node: TreeNode, sums: Map<TreeNode, Long>, total: Long): Boolean {
        if (node.left == null && node.right == null) {
            return false
        }
        val sumLeft = node.left?.let { sums[it] } ?: 0
        val sumRight = node.right?.let { sums[it] } ?: 0

        if (node.left != null && sumLeft == total - sumLeft || node.right != null && sumRight == total - sumRight) {
            return true
        }

        val splitLeft = node.left?.let { canPartition(it, sums, total) } ?: false
        val splitRight = node.right?.let { canPartition(it, sums, total) } ?: false

        return splitLeft || splitRight
    }
}
