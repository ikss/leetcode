package data_structures.other_data_structures.medium

import data_structures.TreeNode
import java.util.*

/**
 * Given the root of a binary tree, flatten the tree into a "linked list":
 *
 *  * The "linked list" should use the same TreeNode class where the right child pointer
 *  points to the next node in the list and the left child pointer is always null.
 *  * The "linked list" should be in the same order as a pre-order traversal of the binary tree.
 *
 * [URL](https://leetcode.com/problems/flatten-binary-tree-to-linked-list/)
 */
object FlattenBinaryTreeToLinkedList {
    private var prev: TreeNode? = null

    fun flattenRecursive(root: TreeNode?) {
        prev = null
        helper(root)
    }

    private fun helper(root: TreeNode?) {
        root ?: return
        helper(root.right)
        helper(root.left)
        root.right = prev
        root.left = null
        prev = root
    }

    fun flattenStack(root: TreeNode?) {
        if (root == null) return
        val stk = Stack<TreeNode>()
        stk.push(root)

        while (!stk.isEmpty()) {
            val curr = stk.pop()
            curr.right?.let {
                stk.push(it)
            }
            curr.left?.let {
                stk.push(it)
            }
            if (!stk.isEmpty()) {
                curr.right = stk.peek()
            }
            curr.left = null
        }
    }

}
