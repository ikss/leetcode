package medium

import data_structures.TreeNode

/**
 * Given the root of a binary tree, return the length of the longest consecutive sequence path.
 *
 * A consecutive sequence path is a path where the values increase by one along the path.
 *
 * Note that the path can start at any node in the tree, and you cannot go from a node to its parent in the path.
 *
 * [URL](https://leetcode.com/problems/binary-tree-longest-consecutive-sequence/)
 */
object BinaryTreeLongestConsecutiveSequence {
    fun longestConsecutive(root: TreeNode?): Int {
        return dfs(root, 1)
    }

    private fun dfs(node: TreeNode?, curr: Int): Int {
        if (node == null) return 0
        val left = node.left
        val leftdfs = if (left != null) dfs(left, if (left.`val` == node.`val` + 1) curr + 1 else 1) else 0

        val right = node.right
        val rightdfs = if (right != null) dfs(right, if (right.`val` == node.`val` + 1) curr + 1 else 1) else 0

        return maxOf(
            curr,
            leftdfs,
            rightdfs,
        )
    }
}
