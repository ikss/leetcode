package trees.easy

import data_structures.TreeNode

/**
 * You are given the root of a binary search tree (BST) and an integer val.
 * Find the node in the BST that the node's value equals val and return the subtree rooted with that node.
 * If such a node does not exist, return null.
 *
 * [URL](https://leetcode.com/problems/search-in-a-binary-search-tree/)
 */
object SearchBST {
    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? =
        when {
            root == null -> null
            `val` == root.`val` -> root
            `val` <= root.`val` -> searchBST(root.left, `val`)
            else -> searchBST(root.right, `val`)
        }
}
