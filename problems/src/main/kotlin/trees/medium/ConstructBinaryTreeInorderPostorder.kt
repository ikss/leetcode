package trees.medium

import data_structures.TreeNode

/**
 * Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree
 * and inorder is the inorder traversal of the same tree, construct and return the binary tree.
 *
 * [URL](https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/)
 */
object ConstructBinaryTreeInorderPostorder {
    private var inorderIndexMap = mapOf<Int, Int>()

    fun buildTree(inorder: IntArray, postorder: IntArray): TreeNode? {
        inorderIndexMap = inorder.mapIndexed { index, it -> it to index }.toMap()
        return helper(postorder, postorder.size - 1, 0, inorder.size - 1)
    }

    private fun helper(postorder: IntArray, ppos: Int, inorderStart: Int, inorderEnd: Int): TreeNode? {
        if (ppos >= postorder.size || inorderStart > inorderEnd) return null
        val rootValue = postorder[ppos]
        val root = TreeNode(rootValue)
        val postorderIndex = inorderIndexMap[rootValue]!!

        root.left = helper(postorder, ppos - 1 - inorderEnd + postorderIndex, inorderStart, postorderIndex - 1)
        root.right = helper(postorder, ppos - 1, postorderIndex + 1, inorderEnd)
        return root
    }
}