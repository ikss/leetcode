package medium

import data_structures.ListNode

/**
 * You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.
 *
 * The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using 0-based indexing,
 * where ⌊x⌋ denotes the largest integer less than or equal to x.
 *
 * For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively.
 *
 * [URL](https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/)
 */
object DeleteMiddleNodeOfLinkedList {
    fun deleteMiddle(head: ListNode?): ListNode? {
        head?.next ?: return null

        var slow = head
        var fast = head.next!!.next

        while (fast?.next != null) {
            fast = fast.next?.next
            slow = slow!!.next
        }

        slow!!.next = slow.next!!.next
        return head
    }

}
