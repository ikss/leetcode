package collections.linked_lists.easy

import collections.linked_lists.util.ListNode

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 *
 * [URL](https://leetcode.com/problems/reverse-linked-list/)
 */
object ReverseLinkedList {
    fun reverseLoop(head: ListNode?): ListNode? {
        head?.next
            ?: return head
        var current = head
        var previous: ListNode? = null
        while (current != null) {
            val tmp = current.next
            current.next = previous
            previous = current
            current = tmp
        }
        return previous
    }

    fun reverseRecursive(head: ListNode?): ListNode? {
        val next = head?.next
            ?: return head;
        val reversed = reverseRecursive(head.next)
        next.next = head
        head.next = null
        return reversed
    }

}
