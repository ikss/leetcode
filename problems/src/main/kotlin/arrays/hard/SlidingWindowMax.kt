package arrays.hard

import java.util.*

/**
 * You are given an array of integers nums, there is a sliding window of size k which is moving from the
 * very left of the array to the very right. You can only see the k numbers in the window.
 * Each time the sliding window moves right by one position.
 *
 * Return the max sliding window.
 *
 * Return the minimum number of candies you need to have to distribute the candies to the children.
 *
 * [URL](https://leetcode.com/problems/sliding-window-maximum/)
 */
object SlidingWindowMax {
    fun maxSlidingWindowPriorityQueue(nums: IntArray, k: Int): IntArray {
        val result = IntArray(nums.size - k + 1)
        val pq = PriorityQueue<Int> { o1, o2 -> o2 - o1 }

        for (i in nums.indices) {
            if (pq.size == k) {
                pq.remove(nums[i - k])
            }
            pq.offer(nums[i])
            if (pq.size == k) {
                result[i - k + 1] = pq.peek()
            }
        }

        return result
    }

    fun maxSlidingWindowIndexDeque(nums: IntArray, k: Int): IntArray {
        val result = IntArray(nums.size - k + 1)
        val dq = ArrayDeque<Int>()

        for (i in 0 until k) {
            while (!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]) {
                dq.pollLast()
            }
            dq.offerLast(i)
        }
        result[0] = nums[dq.peekFirst()]

        for (i in k until nums.size) {
            if (dq.peekFirst() == i - k) {
                dq.pollFirst()
            }
            while (!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]) {
                dq.pollLast()
            }
            dq.offerLast(i)
            result[i - k + 1] = nums[dq.peekFirst()]
        }
        return result
    }
}
