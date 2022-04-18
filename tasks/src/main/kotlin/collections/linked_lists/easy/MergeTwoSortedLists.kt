package collections.linked_lists.easy

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
        if (list1 == null) return list2
        if (list2 == null) return list1

        var val1 = list1
        var val2 = list2
        lateinit var head: ListNode
        var current: ListNode?

        if (val1.`val` <= val2.`val`) {
            head = val1
            val1 = val1.next
        } else {
            head = val2
            val2 = val2.next
        }
        current = head
        while (val1 != null && val2 != null) {
            if (val1.`val` <= val2.`val`) {
                current!!.next = val1
                val1 = val1.next
            } else {
                current!!.next = val2
                val2 = val2.next
            }
            current = current.next
        }
        current!!.next = val1 ?: val2
        return head
    }

    fun mergeTwoListsRecursive(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) return list2
        if (list2 == null) return list1
        if (list1.`val` <= list2.`val`) {
            list1.next = mergeTwoLists(list1.next, list2)
            return list1
        }
        list2.next = mergeTwoLists(list1, list2.next)
        return list2
    }

}
