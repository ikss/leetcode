package linked_lists.medium

import data_structures.ListNode

/**
 * Given the head of a linked list, we repeatedly delete consecutive sequences of nodes that sum to 0
 * until there are no such sequences.
 *
 * After doing so, return the head of the final linked list. You may return any such answer.
 *
 * [URL](https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/)
 */
object RemoveZeroSumConsecutiveNodesFromLinkedList {
    fun removeZeroSumSublists(head: ListNode?): ListNode? {
        val dummy = ListNode(0)
        dummy.next = head
        
        var current: ListNode? = dummy
        val map = HashMap<Int, ListNode>()
        var sum = 0
        while (current != null) {
            sum += current.`val`
            map[sum] = current
            current = current.next
        }

        current = dummy
        sum = 0
        while (current != null) {
            sum += current.`val`
            current.next = map[sum]?.next
            current = current.next
        }
        
        return dummy.next
    }
}
