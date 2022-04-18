package collections.linked_lists.hard

import data_structures.ListNode

/**
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 * Merge all the linked-lists into one sorted linked-list and return it.
 *
 * [URL](https://leetcode.com/problems/merge-k-sorted-lists/)
 */
object MergeKSortedLists {
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        if (lists.isEmpty()) {
            return null
        } else if (lists.size == 1) {
            return lists[0]
        }
        var head = mergeTwoLists(lists[0], lists[1])
        for (i in 2 until lists.size) {
            head = mergeTwoLists(head, lists[i])
        }
        return head
    }

    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val head = ListNode(0)
        var current = head
        var l1 = list1
        var l2 = list2
        while (l1 != null && l2 != null) {
            if (l1.`val` < l2.`val`) {
                current.next = l1
                current = current.next!!
                l1 = l1.next
            } else {
                current.next = l2
                current = current.next!!
                l2 = l2.next
            }
        }

        if (l2 != null) {
            current.next = l2
        } else if (l1 != null) {
            current.next = l1
        }
        return head.next
    }
}
