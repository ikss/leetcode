package collections.linked_lists.medium

import data_structures.ListNode

/**
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 *
 * [URL](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
 */
object RemoveNthNode {
    fun removeNthFromEndRecursive(head: ListNode?, n: Int): ListNode? {
        if (head == null) {
            return null
        }

        val result = removeNthFromEndWithCount(head, n)
        if (result == n) {
            return head.next
        }
        return head
    }

    private fun removeNthFromEndWithCount(head: ListNode?, n: Int): Int {
        if (head == null) {
            return 0
        }
        val result = removeNthFromEndWithCount(head.next, n)
        if (result == n) {
            head.next = head.next?.next
        }
        return result + 1
    }

    fun removeNthFromEndCycle(head: ListNode?, n: Int): ListNode? {
        var start = head
        var end = head
        for (i in 0 until n) end = end?.next
        if (end == null) return head?.next
        while (end?.next != null) {
            start = start?.next
            end = end.next
        }

        start?.next = start?.next?.next

        return head

    }
}
