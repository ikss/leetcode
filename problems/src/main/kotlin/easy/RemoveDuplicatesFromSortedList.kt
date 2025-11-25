package easy

import data_structures.ListNode

/**
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
 * Return the linked list sorted as well.
 *
 * [URL](https://leetcode.com/problems/remove-duplicates-from-sorted-list/)
 */
object RemoveDuplicatesFromSortedList {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        head?.next ?: return head
        var tmp = head

        while (tmp?.next != null) {
            if (tmp.`val` == tmp.next!!.`val`) {
                tmp.next = tmp.next!!.next
            } else {
                tmp = tmp.next
            }
        }

        return head
    }
}
