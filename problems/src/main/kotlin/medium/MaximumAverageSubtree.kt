package medium

import data_structures.TreeNode

/**
 * Given the root of a binary tree, return the maximum average value of a subtree of that tree.
 * Answers within 10-5 of the actual answer will be accepted.
 *
 * A subtree of a tree is any node of that tree plus all its descendants.
 *
 * The average value of a tree is the sum of its values, divided by the number of nodes.
 *
 * [URL](https://leetcode.com/problems/maximum-average-subtree/)
 */
object MaximumAverageSubtree {
    private var result = 0.0

    fun maximumAverageSubtree(root: TreeNode?): Double {
        result = 0.0
        traverse(root)
        return result
    }

    private fun traverse(root: TreeNode?): Pair<Double, Int> {
        if (root == null) return 0.0 to 0
        val (left, countLeft) = traverse(root.left)
        val (right, countRight) = traverse(root.right)

        val curr = left + right + root.`val`
        val count = countLeft + countRight + 1

        result = maxOf(result, curr / count)

        return curr to count
    }
}