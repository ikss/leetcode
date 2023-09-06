package linked_lists.medium

import data_structures.ListNode

/**
 * Given the head of a singly linked list and an integer k, split the linked list into k consecutive linked list parts.
 *
 * The length of each part should be as equal as possible: no two parts should have a size differing by more than one.
 * This may lead to some parts being null.
 *
 * The parts should be in the order of occurrence in the input list, and parts occurring earlier should always have a
 * size greater than or equal to parts occurring later.
 *
 * Return an array of the k parts.
 *
 * [URL](https://leetcode.com/problems/split-linked-list-in-parts/)
 */
object SplitLinkedListInParts {
    fun splitListToPartsStraightforward(head: ListNode?, k: Int): Array<ListNode?> {
        var size = 0
        var curr = head

        while (curr != null) {
            size++
            curr = curr.next
        }

        val result = Array<ListNode?>(k) { null }
        var index = 0
        curr = head
        while (curr != null) {
            val batchSize = (size - 1) / (k - index) + 1

            result[index] = curr
            repeat(batchSize - 1) {
                curr = curr?.next
            }
            if (curr != null) {
                val temp = curr!!.next
                curr!!.next = null
                curr = temp
            }
            index++
            size -= batchSize
        }
        return result
    }

}
