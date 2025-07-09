package trees.medium

import data_structures.TreeNode

/**
 * Given the root of a binary search tree and a node p in it, return the in-order successor of that node in the BST.
 * If the given node has no in-order successor in the tree, return null.
 *
 * The successor of a node p is the node with the smallest key greater than p.val.
 *
 * [URL](https://leetcode.com/problems/inorder-successor-in-bst/)
 */
object InorderSuccessorInBST {
    fun inorderSuccessor(root: TreeNode?, p: TreeNode?): TreeNode? {
        if (root == null || p == null) return null
        var curr = root
        var successor: TreeNode? = null

        while (curr != null) {
            if (curr.`val` <= p.`val`) {
                curr = curr.right
            } else {
                successor = curr
                curr = curr.left
            }
        }

        return successor
    }
}
