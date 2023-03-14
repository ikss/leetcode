package arrays.medium

import data_structures.TreeNode

/**
 * You are given the root of a binary tree containing digits from 0 to 9 only.
 *
 * Each root-to-leaf path in the tree represents a number.
 * * For example, the root-to-leaf path 1 -> 2 -> 3 represents the number 123.
 *
 * Return the total sum of all root-to-leaf numbers. Test cases are generated so that the answer will fit
 * in a 32-bit integer.
 *
 * A leaf node is a node with no children.
 *
 * [URL](https://leetcode.com/problems/sum-root-to-leaf-numbers/)
 */
object SumRootToLeafNumbers {
    fun sumNumbers(root: TreeNode?): Int {
        root ?: return 0
        return traverse(root, 0)
    }

    private fun traverse(node: TreeNode, sumSoFar: Int): Int {
        val sumSoFar = sumSoFar * 10 + node.`val`
        if (node.left == null && node.right == null) {
            return sumSoFar
        }

        var result = 0

        node.left?.let {
            result += traverse(it, sumSoFar)
        }

        node.right?.let {
            result += traverse(it, sumSoFar)
        }
        return result
    }
}