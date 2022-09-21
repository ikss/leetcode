package trees.medium

import data_structures.TreeNode

/**
 * Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree
 * and inorder is the inorder traversal of the same tree, construct and return the binary tree.
 *
 * [URL](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/)
 */
object ConstructBinaryTreePreorderInorder {
    private var preorderIndex = 0
    private var inorderIndexMap = mapOf<Int, Int>()

    fun buildTreeNaive(preorder: IntArray, inorder: IntArray): TreeNode? {
        if (preorder.isEmpty() || inorder.isEmpty()) return null

        val root = TreeNode(preorder[0])
        val pivot = inorder.indexOf(preorder[0])

        val leftPreorder = preorder.slice(1..pivot).toIntArray()
        val leftInorder = inorder.slice(0 until pivot).toIntArray()
        root.left = buildTreeNaive(leftPreorder, leftInorder)

        val rightPreorder = preorder.drop(pivot + 1).toIntArray()
        val rightInorder = inorder.drop(pivot + 1).toIntArray()
        root.right = buildTreeNaive(rightPreorder, rightInorder)

        return root
    }

    fun buildTreeWithIndex(preorder: IntArray, inorder: IntArray): TreeNode? {
        preorderIndex = 0
        inorderIndexMap = inorder.mapIndexed { index, it -> it to index }.toMap()
        return arrayToTree(preorder, 0, preorder.size - 1)
    }

    private fun arrayToTree(
        preorder: IntArray,
        left: Int,
        right: Int,
    ): TreeNode? {
        // if there are no elements to construct the tree
        if (left > right) return null

        // select the preorder_index element as the root and increment it
        val rootValue = preorder[preorderIndex++]
        val root = TreeNode(rootValue)

        // build left and right subtree
        // excluding inorderIndexMap[rootValue] element because it's the root
        val inorderIndex = inorderIndexMap[rootValue]!!
        root.left = arrayToTree(preorder, left, inorderIndex - 1)
        root.right = arrayToTree(preorder, inorderIndex + 1, right)
        return root
    }
}
