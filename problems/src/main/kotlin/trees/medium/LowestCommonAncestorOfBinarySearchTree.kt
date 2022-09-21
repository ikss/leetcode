package trees.medium

import data_structures.TreeNode

/**
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.
 *
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q
 * as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
 *
 * [URL](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 */
object LowestCommonAncestorOfBinarySearchTree {

    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        var root = root
        val small = minOf(p!!.`val`, q!!.`val`)
        val large = maxOf(p.`val`, q.`val`)
        while (root != null) {
            root = if (root.`val` > large) {// p, q belong to the left subtree
                root.left
            } else if (root.`val` < small) {// p, q belong to the right subtree
                root.right
            } else { // Now, small <= root.val <= large -> This root is the LCA between p and q
                break
            }
        }
        return root
    }
}
