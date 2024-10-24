package trees.medium

import data_structures.TreeNode

/**
 * For a binary tree T, we can define a flip operation as follows: choose any node,
 * and swap the left and right child subtrees.
 *
 * A binary tree X is flip equivalent to a binary tree Y if and only if we can make X equal to Y after some number
 * of flip operations.
 *
 * Given the roots of two binary trees root1 and root2, return true if the two trees are flip equivalent or false otherwise.
 *
 * [URL](https://leetcode.com/problems/flip-equivalent-binary-trees/)
 */
object FlipEquivalentBinaryTrees {
    fun flipEquiv(root1: TreeNode?, root2: TreeNode?): Boolean {
        return dfs(root1, root2)
    }

    private fun dfs(node1: TreeNode?, node2: TreeNode?): Boolean {
        if (node1 == null || node2 == null) {
            return node1 == null && node2 == null
        }

        if (node1.`val` != node2.`val`) return false

        // check non-flipped
        val nonFlipped = dfs(node1.left, node2.left) && dfs(node1.right, node2.right)
        if (nonFlipped) return true


        // check flipped
        val flipped = dfs(node1.left, node2.right) && dfs(node1.right, node2.left)
        return flipped
    }
}