package linked_lists.easy

import data_structures.ListNode

/**
 * Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val,
 * and return the new head.
 *
 * [URL](https://leetcode.com/problems/remove-linked-list-elements/)
 */
object RemoveLinkedListElements {
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        head ?: return null
        val dummy = ListNode(0)
        dummy.next = head
        var tmp = dummy
        while (tmp.next != null) {
            if (tmp.next!!.`val` == `val`) {
                tmp.next = tmp.next!!.next
            } else {
                tmp = tmp.next!!
            }
        }

        return dummy.next
    }
}
