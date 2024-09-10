package linked_lists.medium

import data_structures.ListNode

/**
 * Given the head of a linked list head, in which each node contains an integer value.
 *
 * Between every pair of adjacent nodes, insert a new node with a value equal to the greatest common divisor of them.
 *
 * Return the linked list after insertion.
 *
 * The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
 *
 * [URL](https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/)
 */
object InsertGreatestCommonDivisorsInLinkedList {
    fun insertGreatestCommonDivisors(head: ListNode?): ListNode? {
        if (head == null) return null
        var curr = head

        while (curr?.next != null) {
            val gcd = gcd(curr.`val`, curr.next!!.`val`)
            val tmp = curr.next
            val new = ListNode(gcd)

            curr.next = new
            new.next = tmp
            curr = tmp
        }

        return head
    }

    private fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
}
