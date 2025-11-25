package easy

import data_structures.ListNode

/**
 * Given the head of a singly linked list, return the middle node of the linked list.
 *
 * If there are two middle nodes, return the second middle node.
 *
 * [URL](https://leetcode.com/problems/middle-of-the-linked-list/)
 */
object MiddleOfTheLinkedList {
    fun middleNode(head: ListNode?): ListNode? {
        if (head?.next == null) return head

        var slow = head
        var fast = head.next
        while (fast != null) {
            slow = slow?.next
            fast = fast.next?.next
        }
        return slow
    }
}
