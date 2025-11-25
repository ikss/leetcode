package hard

import data_structures.TreeNode

/**
 * A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence
 * has an edge connecting them. A node can only appear in the sequence at most once.
 * Note that the path does not need to pass through the root.
 *
 * The path sum of a path is the sum of the node's values in the path.
 *
 * Given the root of a binary tree, return the maximum path sum of any non-empty path.
 *
 * [URL](https://leetcode.com/problems/binary-tree-maximum-path-sum/)
 */
object BinaryTreeMaximumPathSum {
    private var maxSum = 0

    fun maxPathSum(root: TreeNode?): Int {
        maxSum = Int.MIN_VALUE
        gainFromSubtree(root)
        return maxSum
    }

    // post order traversal of subtree rooted at `root`
    private fun gainFromSubtree(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }

        // add the path sum from left subtree. Note that if the path
        // sum is negative, we can ignore it, or count it as 0.
        // This is the reason we use `Math.max` here.
        val gainFromLeft = maxOf(gainFromSubtree(root.left), 0)

        // add the path sum from right subtree. 0 if negative
        val gainFromRight = maxOf(gainFromSubtree(root.right), 0)

        // if left or right path sum are negative, they are counted
        // as 0, so this statement takes care of all four scenarios
        maxSum = maxOf(maxSum, gainFromLeft + gainFromRight + root.`val`)

        // return the max sum for a path starting at the root of subtree
        return maxOf(gainFromLeft + root.`val`, gainFromRight + root.`val`)
    }
}
