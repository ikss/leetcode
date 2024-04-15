package linked_lists.medium

import data_structures.ListNode

/**
 * Given the head of a sorted linked list, delete all nodes that have duplicate numbers,
 * leaving only distinct numbers from the original list. Return the linked list sorted as well.
 *
 * [URL](https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/)
 */
object RemoveDuplicatesFromSortedListII {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        head?.next ?: return head

        val dummy = ListNode(0)
        dummy.next = head

        var prev: ListNode? = dummy
        var curr: ListNode? = head

        while (curr != null) {
            if (curr.`val` == curr.next?.`val`) {
                while (curr!!.`val` == curr.next?.`val`) {
                    curr = curr.next
                }
                prev!!.next = curr.next
            } else {
                prev = prev!!.next
            }
            curr = curr.next
        }

        return dummy.next
    }
}