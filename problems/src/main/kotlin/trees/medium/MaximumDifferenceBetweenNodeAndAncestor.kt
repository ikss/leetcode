package trees.medium

import data_structures.TreeNode

/**
 * Given the root of a binary tree and two integers val and depth, add a row of nodes with value _val_
 * at the given depth _depth_.
 *
 * Note that the root node is at depth 1.
 *
 * Given the root of a binary tree, find the maximum value v for which there exist different nodes a and b
 * where v = |a.val - b.val| and a is an ancestor of b.
 *
 * A node a is an ancestor of b if either: any child of a is equal to b or any child of a is an ancestor of b.
 *
 * [URL](https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/)
 */
object MaximumDifferenceBetweenNodeAndAncestor {
    fun maxAncestorDiff(root: TreeNode?): Int {
        return when (root) {
            null -> 0
            else -> helper(root, root.`val`, root.`val`)
        }
    }

    private fun helper(node: TreeNode?, curMax: Int, curMin: Int): Int {
        // if encounter leaves, return the max-min along the path
        if (node == null) {
            return curMax - curMin
        }
        // else, update max and min and return the max of left and right subtrees
        val curMax = maxOf(curMax, node.`val`)
        val curMin = minOf(curMin, node.`val`)

        val left = helper(node.left, curMax, curMin)
        val right = helper(node.right, curMax, curMin)

        return maxOf(left, right)
    }
}
