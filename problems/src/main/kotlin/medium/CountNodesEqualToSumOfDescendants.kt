package medium

import data_structures.TreeNode

/**
 * Given the root of a binary tree, return the number of nodes where the value of the node
 * is equal to the sum of the values of its descendants.
 *
 * A descendant of a node x is any node that is on the path from node x to some leaf node.
 * The sum is considered to be 0 if the node has no descendants.
 *
 * [URL](https://leetcode.com/problems/count-nodes-equal-to-sum-of-descendants/)
 */
object CountNodesEqualToSumOfDescendants {
    private var result = 0

    fun equalToDescendants(root: TreeNode?): Int {
        result = 0
        traverse(root)
        return result
    }

    private fun traverse(node: TreeNode?): Int {
        if (node == null) return 0

        val left = traverse(node.left)
        val right = traverse(node.right)

        if (left + right == node.`val`) {
            result++
        }

        return node.`val` + left + right
    }
}