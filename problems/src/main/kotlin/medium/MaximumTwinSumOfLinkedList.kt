package medium

import data_structures.ListNode

/**
 * In a linked list of size n, where n is even, the ith node (0-indexed) of the linked list is known as the twin of the
 * (n-1-i)th node, if 0 <= i <= (n / 2) - 1.
 *
 * * For example, if n = 4, then node 0 is the twin of node 3, and node 1 is the twin of node 2.
 * These are the only nodes with twins for n = 4.
 *
 * The twin sum is defined as the sum of a node and its twin.
 *
 * Given the head of a linked list with even length, return the maximum twin sum of the linked list.
 *
 * [URL](https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/)
 */
object MaximumTwinSumOfLinkedList {
    fun pairSumRecursive(head: ListNode?): Int {
        head ?: return 0

        return findRecursive(head, head).first
    }

    private fun findRecursive(currNode: ListNode, prevNode: ListNode): Pair<Int, ListNode?> {
        if (currNode.next == null) {
            return currNode.`val` + prevNode.`val` to prevNode.next!!
        }

        val (prevMax, prevNext) = findRecursive(currNode.next!!, prevNode)
        return maxOf(prevMax, currNode.`val` + prevNext!!.`val`) to prevNext.next
    }

    fun pairSumReverseHalf(head: ListNode?): Int {
        head ?: return 0

        var slow = head
        var fast = head.next
        var prev: ListNode? = null

        while (fast != null) {
            val tmp = slow!!.next
            slow.next = prev
            prev = slow
            slow = tmp
            fast = fast.next?.next
        }

        var result = 0
        while (slow != null) {
            result = maxOf(result, slow.`val` + prev!!.`val`)
            slow = slow.next
            prev = prev.next
        }

        return result
    }

}