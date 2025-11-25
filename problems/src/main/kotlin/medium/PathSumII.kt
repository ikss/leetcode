package medium

import data_structures.TreeNode

/**
 * Given the root of a binary tree and an integer targetSum, return all root-to-leaf paths
 * where the sum of the node values in the path equals targetSum.
 * Each path should be returned as a list of the node values, not node references.
 *
 * A root-to-leaf path is a path starting from the root and ending at any leaf node. A leaf is a node with no children.
 *
 * [URL](https://leetcode.com/problems/path-sum-ii/)
 */
object PathSumII {
    private val result = mutableListOf<MutableList<Int>>()

    fun pathSum(root: TreeNode?, targetSum: Int): List<List<Int>> {
        result.clear()
        traverse(root, targetSum, mutableListOf())
        return result
    }

    private fun traverse(root: TreeNode?, targetSum: Int, nodes: MutableList<Int>) {
        if (root == null) return
        nodes.add(root.`val`)

        if (root.left == null && root.right == null && targetSum == root.`val`) {
            result.add(ArrayList(nodes))
        } else {
            traverse(root.left, targetSum - root.`val`, nodes)

            traverse(root.right, targetSum - root.`val`, nodes)
        }
        nodes.removeAt(nodes.size - 1)
    }
}
