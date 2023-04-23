package trees.easy

import data_structures.TreeNode

/**
 * Given the root of a binary tree, return the postorder traversal of its nodes' values.
 *
 * [URL](https://leetcode.com/problems/binary-tree-postorder-traversal/)
 */
object BinaryTreePostorderTraversal {
    fun postorderTraversal(root: TreeNode?): List<Int> {
        root ?: return emptyList()

        val result = ArrayList<Int>()

        root.left?.let { result.addAll(postorderTraversal(it)) }
        root.right?.let { result.addAll(postorderTraversal(it)) }
        result.add(root.`val`)

        return result
    }
}
