package medium

import data_structures.TreeNode

/**
 * Given the root of a binary tree, construct a string consisting of parenthesis and integers from a binary tree
 * with the preorder traversal way, and return it.
 *
 * Omit all the empty parenthesis pairs that do not affect the one-to-one mapping relationship between the string
 * and the original binary tree.
 *
 * [URL](https://leetcode.com/problems/construct-string-from-binary-tree/)
 */
object ConstructStringFromBinaryTree {
    fun tree2str(root: TreeNode?): String {
        return traverse(root)
    }

    private fun traverse(node: TreeNode?): String {
        if (node == null) return ""

        val result = StringBuilder()
        result.append(node.`val`)
        if (node.left == null && node.right == null) {
            return result.toString()
        }
        result.append('(', traverse(node.left), ')')

        if (node.right != null) {
            result.append('(', traverse(node.right), ')')
        }
        return result.toString()
    }
}
