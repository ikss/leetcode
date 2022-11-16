package trees.medium

import data_structures.TreeNode

/**
 * Given the root of a binary tree and two integers val and depth, add a row of nodes with value _val_
 * at the given depth _depth_.
 *
 * Note that the root node is at depth 1.
 *
 * The adding rule is:
 * * Given the integer depth, for each not null tree node cur at the depth _depth - 1_,
 * * create two tree nodes with value _val_ as cur's left subtree root and right subtree root.
 * * cur's original left subtree should be the left subtree of the new left subtree root.
 * * cur's original right subtree should be the right subtree of the new right subtree root.
 * * If depth == 1 that means there is no depth _depth - 1_ at all, then create a tree node with value _val_
 * as the new root of the whole original tree, and the original tree is the new root's left subtree.
 *
 * [URL](https://leetcode.com/problems/add-one-row-to-tree/)
 */
object AddOneRowToTree {
    fun addOneRow(root: TreeNode?, `val`: Int, depth: Int): TreeNode? {
        if (depth == 1) {
            val node = TreeNode(`val`)
            node.left = root
            return node
        } else if (root == null) {
            return null
        }

        traverse(root, `val`, depth - 1)
        return root
    }

    private fun traverse(root: TreeNode?, `val`: Int, depth: Int) {
        if (root == null) return
        if (depth == 1) {
            val leftNode = TreeNode(`val`)
            leftNode.left = root.left

            val rightNode = TreeNode(`val`)
            rightNode.right = root.right

            root.left = leftNode
            root.right = rightNode
        } else {
            traverse(root.left, `val`, depth - 1)
            traverse(root.right, `val`, depth - 1)
        }

    }
}
