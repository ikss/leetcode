package easy

import data_structures.ListNode

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * Return the head of the merged linked list.
 *
 * [URL](https://leetcode.com/problems/merge-two-sorted-lists/)
 */
object MergeTwoSortedLists {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) {
            return list2
        } else if (list2 == null) {
            return list1
        }
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
        current.next = l2 ?: l1
        return head.next
    }

    fun mergeTwoListsRecursive(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) return list2
        if (list2 == null) return list1
        if (list1.`val` <= list2.`val`) {
            list1.next = mergeTwoListsRecursive(list1.next, list2)
            return list1
        }
        list2.next = mergeTwoListsRecursive(list1, list2.next)
        return list2
    }

}
