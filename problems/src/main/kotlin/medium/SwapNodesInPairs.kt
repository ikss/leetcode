package medium

import data_structures.ListNode

/**
 * Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying
 * the values in the list's nodes (i.e., only nodes themselves may be changed.)
 *
 * [URL](https://leetcode.com/problems/swap-nodes-in-pairs/)
 */
object SwapNodesInPairs {
    fun swapPairs(head: ListNode?): ListNode? {
        head?.next ?: return head

        val dummy = ListNode(0)
        dummy.next = head
        var prev: ListNode = dummy
        var curr: ListNode? = head

        while (curr?.next != null) {
            val next = curr.next!!
            curr.next = next.next
            prev.next = next
            next.next = curr

            prev = curr
            curr = curr.next
        }

        return dummy.next
    }

}
