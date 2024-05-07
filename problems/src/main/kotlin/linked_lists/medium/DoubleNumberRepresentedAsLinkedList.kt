package linked_lists.medium

import data_structures.ListNode

/**
 * You are given the head of a non-empty linked list representing a non-negative integer without leading zeroes.
 *
 * Return the head of the linked list after doubling it.
 *
 * [URL](https://leetcode.com/problems/double-a-number-represented-as-a-linked-list/)
 */
object DoubleNumberRepresentedAsLinkedList {
    fun doubleIt(head: ListNode?): ListNode? {
        if (head == null) return null
        val traverse = recursive(head)
        if (traverse == 0) {
            return head
        }
        val dummy = ListNode(traverse)
        dummy.next = head
        return dummy
    }

    private fun recursive(node: ListNode?): Int {
        if (node == null) return 0

        val traverse = recursive(node.next)
        val newValue = node.`val` * 2 + traverse
        node.`val` = newValue % 10

        return newValue / 10
    }
}
