package trees.easy

import data_structures.TreeNode

/**
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
 * A valid BST is defined as follows:
 * * The left subtree of a node contains only nodes with keys less than the node's key.
 * * The right subtree of a node contains only nodes with keys greater than the node's key.
 * * Both the left and right subtrees must also be binary search trees.
 *
 * [URL](https://leetcode.com/problems/validate-binary-search-tree/)
 */
object ValidateBST {
    fun isValidBST(root: TreeNode?): Boolean =
        isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE)

    private fun isValidBST(root: TreeNode?, minValue: Long, maxValue: Long): Boolean {
        if (root == null) return true
        val value = root.`val`.toLong()
        if (value >= maxValue || value <= minValue) return false
        return isValidBST(root.left, minValue, value) && isValidBST(root.right, value, maxValue)
    }
}
