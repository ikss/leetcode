package trees.medium

import data_structures.TreeNode

/**
 * Given the root of a binary tree, return the same tree where every subtree (of the given tree) not containing a 1 has been removed.
 *
 * A subtree of a node _node_ is _node_ plus every node that is a descendant of _node_.
 *
 * [URL](https://leetcode.com/problems/binary-tree-pruning/)
 */
object BinaryTreePruning {
    fun pruneTree(root: TreeNode?): TreeNode? {
        return prune(root)
    }

    private fun prune(node: TreeNode?): TreeNode? {
        if (node == null) return null

        node.left = prune(node.left)
        node.right = prune(node.right)

        if (node.`val` == 1 || node.left != null || node.right != null) {
            return node
        }
        return null
    }
}
