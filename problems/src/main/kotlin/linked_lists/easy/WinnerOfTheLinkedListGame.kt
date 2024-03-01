package linked_lists.easy

import data_structures.ListNode

/**
 * You are given the head of a linked list of even length containing integers.
 *
 * Each odd-indexed node contains an odd integer and each even-indexed node contains an even integer.
 *
 * We call each even-indexed node and its next node a pair, e.g., the nodes with indices 0 and 1 are a pair,
 * the nodes with indices 2 and 3 are a pair, and so on.
 *
 * For every pair, we compare the values of the nodes in the pair:
 * * If the odd-indexed node is higher, the "Odd" team gets a point.
 * * If the even-indexed node is higher, the "Even" team gets a point.
 *
 * Return the name of the team with the higher points, if the points are equal, return "Tie".
 *
 * [URL](https://leetcode.com/problems/winner-of-the-linked-list-game/)
 */
object WinnerOfTheLinkedListGame {
    fun gameResult(head: ListNode): String {
        var result = 0

        var node: ListNode? = head

        while (node != null) {
            if (node.`val` > node.next!!.`val`) {
                result++
            } else {
                result--
            }
            node = node.next!!.next
        }

        return when {
            result == 0 -> "Tie"
            result > 0 -> "Even"
            else -> "Odd"
        }
    }
}
