package linked_lists.easy

import data_structures.ListNode

/**
 * Given the head of a singly linked list, return true if it is a palindrome.
 *
 * [URL](https://leetcode.com/problems/palindrome-linked-list/)
 */
object PalindromeLinkedList {
    private var cur: ListNode? = null

    fun isPalindrome(head: ListNode?): Boolean {
        if (head == null) return false
        if (head.next == null) return true

        cur = head
        return traverse(head)
    }

    private fun traverse(head: ListNode): Boolean {
        val next = head.next
            ?: return cur!!.`val` == head.`val`
        if (!traverse(next)) {
            return false
        }
        cur = cur!!.next
        return head.`val` == cur!!.`val`
    }
}
