package design.easy

import java.util.*

/**
 * Design a class to find the kth largest element in a stream.
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
 *
 * Implement KthLargest class:
 * * KthLargest(int k, int[] nums) Initializes the object with the integer k and the stream of integers nums.
 * * int add(int val) Appends the integer val to the stream and returns the element representing the kth largest
 * element in the stream.
 *
 * [URL](https://leetcode.com/problems/kth-largest-element-in-a-stream/)
 */
object KthLargestElementInStream {
    class KthLargest(val k: Int, nums: IntArray) {
        private val heap = PriorityQueue<Int>()

        init {
            for (n in nums) {
                add(n)
            }
        }

        fun add(`val`: Int): Int {
            heap.add(`val`)
            if (heap.size > k) heap.poll()

            return heap.peek()
        }

    }
}