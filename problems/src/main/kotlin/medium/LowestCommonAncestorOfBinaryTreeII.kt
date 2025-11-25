package medium

import data_structures.TreeNode

/**
 * Given the root of a binary tree, return the lowest common ancestor (LCA) of two given nodes, p and q.
 * If either node p or q does not exist in the tree, return null. All values of the nodes in the tree are unique.
 *
 * According to the definition of LCA on Wikipedia:
 * "The lowest common ancestor of two nodes p and q in a binary tree T is the lowest node that has both p and q as
 * descendants (where we allow a node to be a descendant of itself)".
 *
 * A descendant of a node x is a node y that is on the path from node x to some leaf node.
 *
 * [URL](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree-ii/)
 */
object LowestCommonAncestorOfBinaryTreeII {
    private var res: TreeNode? = null
    
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        res = null
        recurseTree(root, p, q)
        return res
    }

    private fun recurseTree(curr: TreeNode?, p: TreeNode?, q: TreeNode?): Boolean {
        if (curr == null) return false

        val left = if (recurseTree(curr.left, p, q)) 1 else 0
        val right = if (recurseTree(curr.right, p, q)) 1 else 0

        val mid = if (curr.`val` == p?.`val` || curr.`val` == q?.`val`) 1 else 0

        if (left + right + mid >= 2) {
            res = curr
        }
        return (left + right + mid > 0)
    }
}
