package data_structures.linked_lists.easy

import data_structures.ListNode

/**
 * Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect.
 * If the two linked lists have no intersection at all, return null.
 *
 * [URL](https://leetcode.com/problems/intersection-of-two-linked-lists/)
 */
object IntersectionOfTwoLinkedLists {
    fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
        if (headA == null || headB == null) return null

        var a: ListNode? = headA
        var b: ListNode? = headB

        //if a & b have different len, then we will stop the loop after second iteration (a.len + b.len == b.len + a.len)
        while (a !== b) {
            //for the end of first iteration, we just reset the pointer to the head of another linked list
            a = if (a == null) headB else a.next
            b = if (b == null) headA else b.next
        }

        return a
    }
}

