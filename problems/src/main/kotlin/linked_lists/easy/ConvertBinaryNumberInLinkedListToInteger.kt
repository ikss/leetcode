package linked_lists.easy

import data_structures.ListNode

/**
 * Given head which is a reference node to a singly-linked list.
 * The value of each node in the linked list is either 0 or 1.
 * The linked list holds the binary representation of a number.
 *
 * Return the decimal value of the number in the linked list.
 *
 * The most significant bit is at the head of the linked list.
 *
 * [URL](https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/)
 */
object ConvertBinaryNumberInLinkedListToInteger {
    fun getDecimalValue(head: ListNode?): Int {
        if (head == null) return 0

        var result = 0
        var curr = head

        while (curr != null) {
            result *= 2
            result += curr.`val`
            curr = curr.next
        }

        return result
    }
}
