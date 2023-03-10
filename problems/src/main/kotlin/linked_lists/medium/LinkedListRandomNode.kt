package linked_lists.medium

import data_structures.ListNode
import java.util.*

/**
 * Given a singly linked list, return a random node's value from the linked list.
 * Each node must have the same probability of being chosen.
 *
 * Implement the Solution class:
 * * Solution(ListNode head) Initializes the object with the head of the singly-linked list head.
 * * int getRandom() Chooses a node randomly from the list and returns its value.
 * All the nodes of the list should be equally likely to be chosen.
 *
 * [URL](https://leetcode.com/problems/linked-list-random-node/)
 */
object LinkedListRandomNode {
    class SolutionNaive(private val head: ListNode?, private val random: Random = Random()) {
        private val length: Int

        init {
            var res = 0
            var node = head

            while (node != null) {
                res++
                node = node.next
            }
            length = res
        }

        fun getRandom(): Int {
            val rnd = random.nextInt(length)
            var node = head
            repeat(rnd) {
                node = node!!.next
            }
            return node!!.`val`
        }
    }

    class SolutionReservoirSampling(private val head: ListNode?, private val random: Random = Random()) {
        fun getRandom(): Int {
            var state = 1
            var node = head
            var picked = head
            while (node?.next != null) {
                if (random.nextDouble() < 1.0 / state) {
                    picked = node
                }
                state++
                node = node.next
            }
            return picked!!.`val`
        }
    }
}
