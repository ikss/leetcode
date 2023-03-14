package trees.medium

import data_structures.ListNode
import data_structures.TreeNode

/**
 * Given the head of a singly linked list where elements are sorted in ascending order, convert it to a
 * height-balanced binary search tree.
 *
 * [URL](https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/)
 */
object ConvertSortedListToBinarySearchTree {
    fun sortedListToBST(head: ListNode?): TreeNode? {
        if (head == null) {
            return null
        } else if (head.next == null) {
            return TreeNode(head.`val`)
        }
        var slow: ListNode = head
        var pre = slow
        var fast = head
        while (fast?.next != null) {
            pre = slow
            slow = slow.next!!
            fast = fast.next!!.next
        }
        // cut left sub list here
        pre.next = null
        return TreeNode(slow.`val`).apply {
            left = sortedListToBST(head)
            right = sortedListToBST(slow.next)
        }
    }
}
