package medium

import data_structures.ListNode

/**
 * You are given the head of a singly linked-list. The list can be represented as:
 * L0 → L1 → … → Ln - 1 → Ln
 *
 * Reorder the list to be on the following form:
 * L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
 *
 * You may not modify the values in the list's nodes. Only nodes themselves may be changed.
 *
 * [URL](https://leetcode.com/problems/reorder-list/)
 */
object ReorderList {
    fun reorderList(head: ListNode?) {
        if (head?.next == null) return

        val middle = findMiddleNode(head)

        val reversed = reverseList(middle)

        mergeLists(head, reversed)
    }

    private fun findMiddleNode(node: ListNode): ListNode {
        var slow = node
        var fast: ListNode? = node

        while (fast?.next != null) {
            slow = slow.next!!
            fast = fast.next?.next
        }

        return slow
    }

    private fun reverseList(node: ListNode): ListNode {
        val dummy = ListNode(0)
        dummy.next = node
        var prev: ListNode? = null
        var curr: ListNode? = node

        while (curr != null) {
            val temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
        }
        return prev!!
    }

    private fun mergeLists(first: ListNode, second: ListNode) {
        var first = first
        var second = second

        while (second.next != null) {
            var temp = first.next
            first.next = second
            first = temp!!

            temp = second.next
            second.next = first
            second = temp!!
        }
    }
}
