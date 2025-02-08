package arrays.medium

import java.util.*

/**
 * Design a number container system that can do the following:
 * * Insert or Replace a number at the given index in the system.
 * * Return the smallest index for the given number in the system.
 *
 * Implement the NumberContainers class:
 * *NumberContainers() Initializes the number container system.
 * *void change(int index, int number) Fills the container at index with the number.
 * If there is already a number at that index, replace it.
 * *int find(int number) Returns the smallest index for the given number,
 * or -1 if there is no index that is filled by number in the system.
 *
 * [URL](https://leetcode.com/problems/design-a-number-container-system/)
 */
object DesignNumberContainerSystem {
    class NumberContainers {

        private val indexToNumber = HashMap<Int, Int>()
        private val numberToIndex = HashMap<Int, PriorityQueue<Int>>()

        fun change(index: Int, number: Int) {
            if (indexToNumber[index] == number) return

            indexToNumber[index] = number
            numberToIndex.computeIfAbsent(number) { PriorityQueue() }.offer(index)
        }

        fun find(number: Int): Int {
            val queue = numberToIndex[number] ?: return -1

            while (queue.isNotEmpty() && indexToNumber[queue.peek()] != number) {
                queue.poll()
            }
            return if (queue.isEmpty()) -1 else queue.peek()
        }
    }
}