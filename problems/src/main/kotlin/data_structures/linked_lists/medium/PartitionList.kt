package data_structures.linked_lists.medium

import data_structures.ListNode

/**
 * Given the head of a linked list and a value x,
 * partition it such that all nodes less than x come before nodes greater than or equal to x.
 *
 * You should preserve the original relative order of the nodes in each of the two partitions.
 *
 * [URL](https://leetcode.com/problems/partition-list/)
 */
object PartitionList {
    fun partition(head: ListNode?, x: Int): ListNode? {
        var curr = head
        val smallHead = ListNode(0)
        var currSmall: ListNode? = smallHead
        val largeHead = ListNode(0)
        var currLarge: ListNode? = largeHead

        while (curr != null) {
            if (curr.`val` < x) {
                currSmall!!.next = curr
                currSmall = currSmall.next
            } else {
                currLarge!!.next = curr
                currLarge = currLarge.next
            }
            curr = curr.next
        }

        currLarge!!.next = null
        currSmall!!.next = largeHead.next

        return smallHead.next
    }

}
