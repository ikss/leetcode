package trees.medium

import data_structures.TreeNode

/**
 * You are given the root of a binary tree.
 *
 * A ZigZag path for a binary tree is defined as follow:
 * * Choose any node in the binary tree and a direction (right or left).
 * * If the current direction is right, move to the right child of the current node; otherwise, move to the left child.
 * * Change the direction from right to left or from left to right.
 * * Repeat the second and third steps until you can't move in the tree.
 *
 * Zigzag length is defined as the number of nodes visited - 1. (A single node has a length of 0).
 *
 * Return the longest ZigZag path contained in that tree.
 *
 * [URL](https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/)
 */
object LongestZigZagPathInBinaryTree {
    var result = 0

    fun longestZigZagMine(root: TreeNode?): Int {
        result = 0
        zigzag(root)

        return result
    }

    private fun zigzag(node: TreeNode?): Pair<Int, Int> {
        if (node == null) return 0 to 0
        val left = node.left?.let { zigzag(it).second + 1 } ?: 0
        val right = node.right?.let { zigzag(it).first + 1 } ?: 0

        result = maxOf(result, left, right)
        return left to right
    }

    fun longestZigZagEditorial(root: TreeNode?): Int {
        result = 0
        dfs(root, false, 0)
        dfs(root, true, 0)
        return result
    }

    private fun dfs(node: TreeNode?, goLeft: Boolean, steps: Int) {
        if (node == null) {
            return
        }
        result = maxOf(result, steps)
        if (goLeft) {
            dfs(node.left, false, steps + 1)
            dfs(node.right, true, 1)
        } else {
            dfs(node.left, false, 1)
            dfs(node.right, true, steps + 1)
        }
    }
}
