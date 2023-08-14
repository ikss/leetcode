package arrays.medium

import java.util.*

/**
 * Given an integer array nums and an integer k, return the kth largest element in the array.
 *
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
 *
 * Can you solve it without sorting?
 *
 * [URL](https://leetcode.com/problems/kth-largest-element-in-an-array/)
 */
object KthLargestElementInArray {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        val pq = PriorityQueue<Int>()

        for (n in nums) {
            pq.offer(n)
            if (pq.size > k) pq.poll()
        }
        return pq.poll()
    }
}