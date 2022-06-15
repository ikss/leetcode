package data_structures.linked_lists.easy

import data_structures.ListNode

/**
 * Write a function to delete a node in a singly-linked list. You will not be given access to the head of the list,
 * instead you will be given access to the node to be deleted directly.
 * It is guaranteed that the node to be deleted is not a tail node in the list.
 *
 * [URL](https://leetcode.com/problems/linked-list-cycle/)
 */
object DeleteNodeInLinkedList {
    fun deleteNode(node: ListNode?) {
        node?.next ?: return
        node.`val` = node.next!!.`val`
        node.next = node.next!!.next
    }
}
