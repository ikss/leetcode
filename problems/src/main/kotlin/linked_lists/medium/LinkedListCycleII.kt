package linked_lists.medium

import data_structures.ListNodeCycled

/**
 * Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
 *
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously
 * following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer
 * is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.
 *
 * Do not modify the linked list.
 *
 * [URL](https://leetcode.com/problems/linked-list-cycle-ii/)
 */
object LinkedListCycleII {
    fun detectCycleNaive(head: ListNodeCycled?): ListNodeCycled? {
        var node: ListNodeCycled? = head ?: return null

        val set = hashSetOf<ListNodeCycled>()
        while (node != null) {
            if (!set.add(node)) {
                return node
            }
            node = node.next
        }
        return null
    }
}
