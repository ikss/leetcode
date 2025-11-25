package easy

import data_structures.ListNode

/**
 * You are given the head of a linked list and two integers m and n.
 *
 * Traverse the linked list and remove some nodes in the following way:
 * * Start with the head as the current node.
 * * Keep the first m nodes starting with the current node.
 * * Remove the next n nodes
 * * Keep repeating steps 2 and 3 until you reach the end of the list.
 *
 * Return the head of the modified list after removing the mentioned nodes.
 *
 * [URL](https://leetcode.com/problems/delete-n-nodes-after-m-nodes-of-a-linked-list/)
 */
object DeleteNNodesAfterMNodesOfLinkedList {
    fun deleteNodes(head: ListNode?, m: Int, n: Int): ListNode? {
        var curr = head

        while (curr?.next != null) {
            repeat(m - 1) {
                curr = curr?.next
            }
            if (curr == null) break
            var next = curr

            repeat(n) {
                next = next?.next
            }
            curr.next = next?.next
            curr = curr.next
        }
        return head
    }
}
