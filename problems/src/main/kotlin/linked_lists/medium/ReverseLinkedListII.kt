package linked_lists.medium

import data_structures.ListNode

/**
 * Given the head of a singly linked list and two integers left and right where left <= right,
 * reverse the nodes of the list from position left to position right, and return the reversed list.
 *
 * [URL](https://leetcode.com/problems/reverse-linked-list-ii/)
 */
object ReverseLinkedListII {
    private var stop = false
    private lateinit var left: ListNode

    fun reverseBetweenRecursive(head: ListNode?, left: Int, right: Int): ListNode? {
        head?.next
            ?: return head
        var num = 1
        var leftBound = head
        while (leftBound != null && num < left) {
            leftBound = leftBound.next
            num++
        }
        leftBound ?: return head
        this.left = leftBound
        recursiveReverse(leftBound, right - left)
        return head
    }

    private fun recursiveReverse(right: ListNode?, n: Int) {
        val rightNode = right?.next
        if (n == 0 || rightNode == null) {
            return
        }

        // Recurse with m and n reduced.
        recursiveReverse(rightNode, n - 1)

        // In case both the pointers cross each other or become equal, we
        // stop i.e. don't swap data any further. We are done reversing at this
        // point.
        if (left === rightNode || rightNode.next === left) {
            stop = false
        }

        // Until the boolean stop is false, swap data between the two pointers
        if (!stop) {
            val t = left.`val`
            left.`val` = rightNode.`val`
            rightNode.`val` = t
            left = left.next!!
        }
    }

    fun reverseBetweenLoop(head: ListNode?, left: Int, right: Int): ListNode? {
        var newBegin: ListNode? = null
        var prevNode: ListNode? = null
        var newEnd: ListNode? = null

        var count = 1
        var current = head

        while (current != null) {
            val next = current.next

            when (count) {
                left - 1 -> {
                    newBegin = current
                    prevNode = newBegin
                }

                left -> {
                    prevNode = current
                    newEnd = current
                }

                in (left + 1) until right -> {
                    current.next = prevNode
                    prevNode = current
                }

                right -> {
                    current.next = prevNode
                    newEnd?.next = next

                    return if (newBegin != null) {
                        newBegin.next = current
                        head
                    } else {
                        current
                    }
                }
            }

            count++
            current = next
        }
        return head
    }
}
