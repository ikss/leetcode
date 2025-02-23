package trees.medium

import data_structures.TreeNode

/**
 * Given two integer arrays, preorder and postorder where preorder is the preorder traversal of a binary tree of
 * distinct values and postorder is the postorder traversal of the same tree, reconstruct and return the binary tree.
 *
 * If there exist multiple answers, you can return any of them.
 *
 * [URL](https://leetcode.com/problems/all-possible-full-binary-trees/)
 */
object ConstructBinaryTreeFromPreorderAndPostorderTraversal {
    private var preIndex = 0
    private var postIndex = 0

    fun constructFromPrePost(preorder: IntArray, postorder: IntArray): TreeNode {
        preIndex = 0
        postIndex = 0
        return constructTree(preorder, postorder)
    }

    // Helper function to recursively build the tree
    private fun constructTree(preorder: IntArray, postorder: IntArray): TreeNode {
        // Create a new node with the value at the current preorder index
        val root = TreeNode(preorder[preIndex++])

        // Recursively construct the left subtree if the root is not the last of its subtree
        if (root.`val` != postorder[postIndex]) {
            root.left = constructTree(preorder, postorder)
        }

        // Recursively construct the right subtree if the root is still not the last of its subtree
        if (root.`val` != postorder[postIndex]) {
            root.right = constructTree(preorder, postorder)
        }

        // Mark this node and its subtree as fully processed
        postIndex++
        return root
    }
}
