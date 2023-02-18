package trees.easy

import data_structures.TreeNode

/**
 * Given the root of a binary tree, invert the tree, and return its root.
 *
 * [URL](https://leetcode.com/problems/invert-binary-tree/)
 */
object InvertBinaryTree {
    fun invertTree(root: TreeNode?): TreeNode? {
        if (root == null) {
            return null
        }
        val left = invertTree(root.left)
        val right = invertTree(root.right)

        root.left = right
        root.right = left
        return root
    }
}
