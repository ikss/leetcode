package medium

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
 * [URL](https://leetcode.com/problems/merge-nodes-in-between-zeros/)
 */
object MergeNodesInBetweenZeros {
    fun mergeNodes(head: ListNode?): ListNode? {
        if (head == null) return head

        var curr = head.next
        var next = curr

        while (next != null) {
            var sum = 0
            while (next!!.`val` != 0) {
                sum += next.`val`
                next = next.next
            }
            curr!!.`val` = sum
            next = next.next
            curr.next = next
            curr = next
        }
        return head.next
    }
}
