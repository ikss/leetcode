package linked_lists.medium

import data_structures.ListNode
import java.util.*

/**
 * You are given the head of a linked list.
 *
 * Remove every node which has a node with a greater value anywhere to the right side of it.
 *
 * Return the head of the modified linked list.
 *
 * [URL](https://leetcode.com/problems/remove-nodes-from-linked-list/)
 */
object RemoveNodesFromLinkedList {
    fun removeNodes(head: ListNode?): ListNode? {
        val stack = Stack<ListNode>()
        var curr = head
        while (curr != null) {
            while (stack.isNotEmpty() && stack.peek().`val` < curr.`val`) {
                stack.pop()
            }
            if (stack.isNotEmpty()) {
                stack.peek().next = curr
            }
            stack.push(curr)
            curr = curr.next
        }

        return stack.first()
    }
}
