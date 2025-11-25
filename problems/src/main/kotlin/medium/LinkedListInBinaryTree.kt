package medium

import data_structures.ListNode
import data_structures.TreeNode

/**
 * Given a binary tree root and a linked list with head as the first node.
 *
 * Return True if all the elements in the linked list starting from the head correspond to some downward path connected
 * in the binary tree otherwise return False.
 *
 * In this context downward path means a path that starts at some node and goes downwards.
 *
 * [URL](https://leetcode.com/problems/linked-list-in-binary-tree/)
 */
object LinkedListInBinaryTree {
    fun isSubPath(head: ListNode?, root: TreeNode?): Boolean {
        if (root == null) return false
        return dfs(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right)
    }

    private fun dfs(head: ListNode?, node: TreeNode?): Boolean {
        if (head == null) return true
        if (node == null) return false
        if (head.`val` != node.`val`) return false

        return dfs(head.next, node.left) || dfs(head.next, node.right)
    }
}