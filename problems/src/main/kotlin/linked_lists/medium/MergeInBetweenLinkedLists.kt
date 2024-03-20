package linked_lists.medium

import data_structures.ListNode

/**
 * You are given two linked lists: list1 and list2 of sizes n and m respectively.
 *
 * Remove list1's nodes from the ath node to the bth node, and put list2 in their place.
 *
 * [URL](https://leetcode.com/problems/merge-in-between-linked-lists/)
 */
object MergeInBetweenLinkedLists {
    fun mergeInBetween(list1: ListNode, a: Int, b: Int, list2: ListNode): ListNode {
        var last = list2
        while (last.next != null) {
            last = last.next!!
        }

        val dummy = ListNode(0)
        dummy.next = list1

        var count = 0
        var curr = dummy

        while (count < a) {
            curr = curr.next!!
            count++
        }

        var tmp = curr.next!!
        curr.next = list2

        while (count < b) {
            tmp = tmp.next!!
            count++
        }
        last.next = tmp.next

        return dummy.next!!
    }
}
