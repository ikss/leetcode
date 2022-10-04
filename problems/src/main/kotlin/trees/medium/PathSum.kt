package trees.medium

import data_structures.TreeNode

/**
 * Given the root of a binary tree and an integer targetSum,
 * return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
 *
 * A leaf is a node with no children.
 *
 * [URL](https://leetcode.com/problems/path-sum/)
 */
object PathSum {
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        if (root == null) return false
        val sum = targetSum - root.`val`
        if (sum == 0 && root.left == null && root.right == null) {
            return true
        }
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum)
    }
}
