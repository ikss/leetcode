package easy

import data_structures.TreeNode
import java.util.*

/**
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 *
 * [URL](https://leetcode.com/problems/binary-tree-inorder-traversal/)
 */
object InorderTraversal {
    fun inorderTraversalRecursive(root: TreeNode?): List<Int> {
        val res = ArrayList<Int>()
        helper(root, res)
        return res
    }

    private fun helper(root: TreeNode?, res: ArrayList<Int>) {
        if (root == null) return
        helper(root.left, res)
        res.add(root.`val`)
        helper(root.right, res)
    }

    fun inorderTraversalStack(root: TreeNode?): List<Int> {
        val res = ArrayList<Int>()
        val stack = Stack<TreeNode>()
        var curr = root
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr)
                curr = curr.left
            }
            curr = stack.pop()
            res.add(curr.`val`)
            curr = curr.right
        }
        return res
    }
}
