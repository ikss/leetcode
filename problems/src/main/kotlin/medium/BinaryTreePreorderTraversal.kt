package medium

import data_structures.TreeNode
import java.util.*

/**
 * Given the root of a binary tree, return the preorder traversal of its nodes' values.
 *
 * [URL](https://leetcode.com/problems/binary-tree-preorder-traversal/)
 */
object BinaryTreePreorderTraversal {
    fun preorderTraversal(root: TreeNode?): List<Int> {
        root ?: return emptyList()
        val stack = Stack<TreeNode>()
        stack.push(root)
        val result = mutableListOf<Int>()

        while (stack.isNotEmpty()) {
            val node = stack.pop()!!
            result.add(node.`val`)
            node.right?.let { stack.push(it) }
            node.left?.let { stack.push(it) }
        }

        return result
    }
}
