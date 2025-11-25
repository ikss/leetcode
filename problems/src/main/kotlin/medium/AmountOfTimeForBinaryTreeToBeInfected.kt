package medium

import data_structures.TreeNode

/**
 * You are given the root of a binary tree with unique values, and an integer start.
 * At minute 0, an infection starts from the node with value start.
 *
 * Each minute, a node becomes infected if:
 * * The node is currently uninfected.
 * * The node is adjacent to an infected node.
 *
 * Return the number of minutes needed for the entire tree to be infected.
 *
 * [URL](https://leetcode.com/problems/amount-of-time-for-binary-tree-to-be-infected/)
 */
object AmountOfTimeForBinaryTreeToBeInfected {
    private var maxDistance = 0

    fun amountOfTime(root: TreeNode?, start: Int): Int {
        maxDistance = 0
        traverse(root, start)
        return maxDistance
    }

    private fun traverse(root: TreeNode?, start: Int): Int {
        if (root == null) {
            return 0
        }

        val leftDepth = traverse(root.left, start)
        val rightDepth = traverse(root.right, start)

        return if (root.`val` == start) {
            maxDistance = maxOf(leftDepth, rightDepth)
            -1
        } else if (leftDepth >= 0 && rightDepth >= 0) {
            maxOf(leftDepth, rightDepth) + 1
        } else {
            val distance = Math.abs(leftDepth) + Math.abs(rightDepth)
            maxDistance = maxOf(maxDistance, distance)
            minOf(leftDepth, rightDepth) - 1
        }
    }
}