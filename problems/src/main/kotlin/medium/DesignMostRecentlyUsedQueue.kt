package medium

/**
 * Design a queue-like data structure that moves the most recently used element to the end of the queue.
 *
 * Implement the MRUQueue class:
 * * MRUQueue(int n) constructs the MRUQueue with n elements: [1,2,3,...,n].
 * * int fetch(int k) moves the kth element (1-indexed) to the end of the queue and returns it.
 *
 * [URL](https://leetcode.com/problems/design-most-recently-used-queue/)
 */
object DesignMostRecentlyUsedQueue {
    class MRUQueue(n: Int) {
        private class Node(val value: Int) {
            var prev: Node? = null
            var next: Node? = null
        }

        private val head = Node(-1)
        private val tail = Node(-1)

        init {
            var prev = head
            for (i in 1..n) {
                val node = Node(i)
                prev.next = node
                node.prev = prev
                prev = node
            }
            prev.next = tail
            tail.prev = prev
        }

        fun fetch(k: Int): Int {
            var node = head.next
            repeat(k - 1) {
                node = node?.next
            }
            node?.let {
                it.prev!!.next = it.next
                it.next!!.prev = it.prev
                
                val prev = tail.prev
                it.prev = prev
                prev!!.next = it
                it.next = tail
                tail.prev = it
            }
            return node?.value ?: -1
        }
    }
}