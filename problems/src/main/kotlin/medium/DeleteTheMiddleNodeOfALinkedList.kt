package medium

import data_structures.ListNode

/**
 * You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.
 *
 * The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using 0-based indexing,
 * where ⌊x⌋ denotes the largest integer less than or equal to x.
 * * For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively.
 *
 * [URL](https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/)
 */
object DeleteTheMiddleNodeOfALinkedList {
    fun deleteMiddle(head: ListNode?): ListNode? {
        if (head?.next == null) return null

        var toDelete = getSize(head) / 2

        var curr: ListNode? = head

        while (curr != null) {
            if (toDelete == 1) {
                curr.next = curr.next!!.next
                break
            }
            toDelete--
            curr = curr?.next
        }

        return head
    }

    private fun getSize(head: ListNode): Int {
        var curr: ListNode? = head

        var result = 0
        while (curr != null) {
            curr = curr.next
            result++
        }

        return result
    }
}
