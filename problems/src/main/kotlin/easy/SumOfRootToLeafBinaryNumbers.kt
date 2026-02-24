package easy

import data_structures.TreeNode

/**
 * You are given the root of a binary tree where each node has a value 0 or 1.
 * Each root-to-leaf path represents a binary number starting with the most significant bit.
 *
 * * For example, if the path is 0 -> 1 -> 1 -> 0 -> 1, then this could represent 01101 in binary, which is 13.
 *
 * For all leaves in the tree, consider the numbers represented by the path from the root to that leaf.
 * Return the sum of these numbers.
 *
 * The test cases are generated so that the answer fits in a 32-bits integer.
 *
 * [URL](https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/)
 */
object SumOfRootToLeafBinaryNumbers {
    fun sumRootToLeaf(root: TreeNode?): Int {
        return traverse(root, 0)
    }

    private fun traverse(node: TreeNode?, parentNum: Int): Int {
        if (node == null) return 0

        val num = parentNum * 2 + node.`val`

        if (node.left == null && node.right == null) {
            return num
        }
        return traverse(node.left, num) + traverse(node.right, num)
    }
}
