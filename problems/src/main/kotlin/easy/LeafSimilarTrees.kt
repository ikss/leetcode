package easy

import data_structures.TreeNode
import java.util.*

/**
 * Consider all the leaves of a binary tree, from left to right order,
 * the values of those leaves form a leaf value sequence.
 *
 * [URL](https://leetcode.com/problems/leaf-similar-trees/)
 */
object LeafSimilarTrees {
    fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
        val left = getLeaves(root1)
        val right = getLeaves(root2)
        return left == right
    }

    private fun getLeaves(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()

        if (root == null) return result

        val stack = Stack<TreeNode>()
        stack.push(root)

        while (!stack.isEmpty()) {
            val node = stack.pop()
            if (node.left == null && node.right == null) {
                result.add(node.`val`)
                continue
            }
            node.right?.let { stack.push(it) }
            node.left?.let { stack.push(it) }
        }

        return result
    }
}
