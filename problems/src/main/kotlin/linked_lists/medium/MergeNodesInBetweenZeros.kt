package linked_lists.medium

import data_structures.ListNode

/**
 * You are given the head of a linked list, which contains a series of integers separated by 0's.
 * The beginning and end of the linked list will have Node.val == 0.
 *
 * For every two consecutive 0's, merge all the nodes lying in between them into a single node
 * whose value is the sum of all the merged nodes. The modified list should not contain any 0's.
 *
 * Return the head of the modified linked list.
 *
 * [URL](https://leetcode.com/problems/merge-nodes-in-between-zeros/description/)
 */
object MergeNodesInBetweenZeros {
    fun mergeNodes(head: ListNode?): ListNode? {
        if (head?.next == null) return head
        var head: ListNode = head.next!!

        val dummyHead = ListNode(0)
        var curr = dummyHead

        while (head.next != null) {
            if (head.`val` == 0) {
                curr.next = ListNode(0)
                curr = curr.next!!
            } else {
                curr.`val` = curr.`val` + head.`val`
            }

            head = head.next!!
        }

        return dummyHead
    }
}
