package medium

import data_structures.ListNode
import java.util.*

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The most significant digit comes first and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * [URL](https://leetcode.com/problems/add-two-numbers-ii/)
 */
object AddTwoNumbersII {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val s1 = listToStack(l1)
        val s2 = listToStack(l2)

        var carry = 0
        var result = ListNode(0)
        while (s1.isNotEmpty() || s2.isNotEmpty()) {
            var sum = carry
            if (s1.isNotEmpty()) sum += s1.pop()
            if (s2.isNotEmpty()) sum += s2.pop()
            result.`val` = sum % 10
            carry = sum / 10

            val head = ListNode(carry)
            head.next = result
            result = head
        }
        return if (carry == 0) result.next else result
    }

    private fun listToStack(l: ListNode?): Stack<Int> {
        val s = Stack<Int>()
        var l = l
        while (l != null) {
            s.push(l.`val`)
            l = l.next
        }
        return s
    }
}
