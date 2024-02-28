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
object DiameterOfBinaryTree {
    private var result = 0
    fun diameterOfBinaryTree(root: TreeNode?): Int {
        result = 0
        traverse(root)
        return result
    }

    private fun traverse(root: TreeNode?): Int {
        if (root == null) return 0
        val left = traverse(root.left)
        val right = traverse(root.right)

        result = maxOf(result, left + right)

        return maxOf(left, right) + 1
    }
}
