package medium

import data_structures.ListNode

/**
 * You are given the head of a linked list, and an integer k.
 *
 * Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node
 * from the end (the list is 1-indexed).
 *
 * [URL](https://leetcode.com/problems/swapping-nodes-in-a-linked-list/)
 */
object SwappingNodesInLinkedList {
    fun swapNodes(head: ListNode?, k: Int): ListNode? {
        var fast = head
        for (i in 1 until k) {
            fast = fast!!.next
        }
        val first = fast

        var slow = head
        while (fast!!.next != null) {
            fast = fast.next
            slow = slow!!.next
        }
        val second = slow

        val tmp = first!!.`val`
        first.`val` = second!!.`val`
        second.`val` = tmp

        return head
    }

}
