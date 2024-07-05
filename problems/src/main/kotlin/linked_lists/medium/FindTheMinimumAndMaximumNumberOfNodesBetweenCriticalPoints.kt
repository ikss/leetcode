package linked_lists.medium

import data_structures.ListNode
import data_structures.ListNodeCycled

/**
 * A critical point in a linked list is defined as either a local maxima or a local minima.
 *
 * A node is a local maxima if the current node has a value strictly greater than the previous node and the next node.
 *
 * A node is a local minima if the current node has a value strictly smaller than the previous node and the next node.
 *
 * Note that a node can only be a local maxima/minima if there exists both a previous node and a next node.
 *
 * Given a linked list head, return an array of length 2 containing [minDistance, maxDistance] where minDistance is the
 * minimum distance between any two distinct critical points and maxDistance is the maximum distance between any two
 * distinct critical points. If there are fewer than two critical points, return `[-1, -1]`.
 *
 * [URL](https://leetcode.com/problems/find-the-minimum-and-maximum-number-of-nodes-between-critical-points/)
 */
object FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints {
    fun nodesBetweenCriticalPoints(head: ListNode?): IntArray {
        val result = intArrayOf(-1, -1)
        if (head?.next?.next == null) return intArrayOf(-1, -1)

        var prev = head!!
        var curr = head.next!!
        var next = head.next!!.next

        var firstCrit = -1
        var lastCrit = -1
        var prevCrit = -1
        var count = 1

        while (next != null) {
            if ((prev.`val` > curr.`val` && next.`val` > curr.`val`) ||
                (prev.`val` < curr.`val` && next.`val` < curr.`val`)) {
                if (firstCrit == -1) {
                    firstCrit = count
                } else {
                    lastCrit = count
                    result[1] = lastCrit - firstCrit
                }
                if (prevCrit != -1) {
                    val diff = count - prevCrit
                    result[0] = if (result[0] == -1 ) diff else minOf(result[0], diff)
                }
                prevCrit = count
            }
            count++
            prev = curr
            curr = next
            next = next.next
        }
        return result
    }
}
