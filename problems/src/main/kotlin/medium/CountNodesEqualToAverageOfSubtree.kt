package medium

import data_structures.TreeNode

/**
 * Given the root of a binary tree, return the number of nodes where the value of the node is equal to the average
 * of the values in its subtree.
 *
 * Note:
 * * The average of n elements is the sum of the n elements divided by n and rounded down to the nearest integer.
 * * A subtree of root is a tree consisting of root and all of its descendants.
 *
 * [URL](https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/)
 */
object CountNodesEqualToAverageOfSubtree {
    private data class State(
        var sum: Int,
        var count: Int,
        var result: Int,
    )
    fun averageOfSubtree(root: TreeNode?): Int {
        return traverse(root).result
    }

    private fun traverse(node: TreeNode?): State {
        if (node == null) {
            return State(0, 0, 0)
        }

        val leftState = traverse(node.left)
        val rightState = traverse(node.right)

        val subSums = leftState.sum + rightState.sum + node.`val`
        val subCounts = leftState.count + rightState.count + 1
        val hasAvg = node.`val` == subSums/subCounts

        val result = leftState.result + rightState.result + if (hasAvg) 1 else 0

        return State(subSums, subCounts, result)
    }
}
