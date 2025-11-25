package easy

import data_structures.ListNode

/**
 * Given the head of a linked list containing k distinct elements,
 * return the head to a linked list of length k containing the frequency of
 * each distinct element in the given linked list in any order.
 *
 * [URL](https://leetcode.com/problems/linked-list-frequency/)
 */
object LinkedListFrequency {
    fun frequenciesOfElements(head: ListNode?): ListNode? {
        val map = HashMap<Int, ListNode>()
        var result: ListNode? = null
        var curr = head

        while (curr != null) {
            val prev = map[curr.`val`]

            if (prev == null) {
                val node = ListNode(1, result)
                result = node
                map[curr.`val`] = node
            } else {
                prev.`val` += 1
            }

            curr = curr.next
        }

        return result
    }
}
