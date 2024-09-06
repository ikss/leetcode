package linked_lists

import data_structures.ListNode

/**
 * You are given an array of integers nums and the head of a linked list. Return the head of the modified linked list
 * after removing all nodes from the linked list that have a value that exists in nums.
 *
 * [URL](https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array/)
 */
object DeleteNodesFromLinkedListPresentInArray {
    fun modifiedList(nums: IntArray, head: ListNode?): ListNode? {
        if (head == null) return null
        val set = HashSet<Int>()

        for (n in nums) {
            set.add(n)
        }

        val dummy = ListNode(0)
        dummy.next = head
        var curr = dummy

        while (curr.next != null) {
            val next = curr.next!!

            if (next.`val` in set) {
                curr.next = next.next
            } else {
                curr = next
            }
        }

        return dummy.next
    }
}
