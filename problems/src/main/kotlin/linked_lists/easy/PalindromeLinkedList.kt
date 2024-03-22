package linked_lists.easy

import data_structures.ListNode

/**
 * Given the head of a singly linked list, return true if it is a palindrome.
 *
 * [URL](https://leetcode.com/problems/palindrome-linked-list/)
 */
object PalindromeLinkedList {
    private var forward: ListNode? = null

    fun isPalindrome(head: ListNode?): Boolean {
        if (head == null) return false
        if (head.next == null) return true

        forward = head
        return traverse(head)
    }

    private fun traverse(curr: ListNode?): Boolean {
        if (curr == null) return true
        val next = curr.next
        if (!traverse(next) || curr.`val` != forward!!.`val`) {
            return false
        }
        forward = forward!!.next
        return true
    }
}
