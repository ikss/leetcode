package trees.medium

import data_structures.TreeNode

/**
 * Given a binary tree root, a node X in the tree is named good if in the path from root
 * to X there are no nodes with a value greater than X.
 * Return the number of good nodes in the binary tree.
 *
 * [URL](https://leetcode.com/problems/count-good-nodes-in-binary-tree/)
 */
object CountGoodNodesInBinaryTree {
    fun goodNodes(root: TreeNode?): Int {
        return traverse(root, Int.MIN_VALUE)
    }

    private fun traverse(node: TreeNode?, curMax: Int): Int {
        if (node == null) return 0
        var result = 0
        if (node.`val` >= curMax) result++
        val max = maxOf(curMax, node.`val`)
        result += traverse(node.left, max) + traverse(node.right, max)
        return result
    }
}
