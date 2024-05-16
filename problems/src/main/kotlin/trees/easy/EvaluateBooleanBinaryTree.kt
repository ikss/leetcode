package trees.easy

import data_structures.TreeNode

/**
 * Given the root of a binary tree, return the length of the diameter of the tree.
 *
 * The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
 * This path may or may not pass through the root.
 *
 * The length of a path between two nodes is represented by the number of edges between them.
 *
 * [URL](https://leetcode.com/problems/diameter-of-binary-tree/)
 */
object EvaluateBooleanBinaryTree {
    fun evaluateTree(root: TreeNode): Boolean {
        if (root.`val` < 2) return root.`val` == 1

        val left = evaluateTree(root.left!!)
        val right = evaluateTree(root.right!!)

        return when (root.`val`) {
            2 -> left || right
            else -> left && right
        }
    }
}
