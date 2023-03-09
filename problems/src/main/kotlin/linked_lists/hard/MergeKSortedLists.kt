package linked_lists.hard

import data_structures.ListNode
import linked_lists.easy.MergeTwoSortedLists

/**
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 * Merge all the linked-lists into one sorted linked-list and return it.
 *
 * [URL](https://leetcode.com/problems/merge-k-sorted-lists/)
 */
object MergeKSortedLists {
    fun mergeKLists(lists: Array<ListNode>): ListNode? {
        if (lists.isEmpty()) {
            return null
        } else if (lists.size == 1) {
            return lists[0]
        }
        var head = MergeTwoSortedLists.mergeTwoLists(lists[0], lists[1])
        for (i in 2 until lists.size) {
            head = MergeTwoSortedLists.mergeTwoLists(head, lists[i])
        }
        return head
    }
}
