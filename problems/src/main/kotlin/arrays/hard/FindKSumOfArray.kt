package arrays.hard

import java.util.*

/**
 * You are given an integer array nums and a positive integer k. You can choose any subsequence of the array
 * and sum all of its elements together.
 *
 * We define the K-Sum of the array as the kth largest subsequence sum that can be obtained (not necessarily distinct).
 *
 * Return the K-Sum of the array.
 *
 * A subsequence is an array that can be derived from another array by deleting some or no elements
 * without changing the order of the remaining elements.
 *
 * Note that the empty subsequence is considered to have a sum of 0.
 *
 * [URL](https://leetcode.com/problems/find-the-k-sum-of-an-array/)
 */
object FindKSumOfArray {
    fun kSum(nums: IntArray, k: Int): Long {
        var minusSum = 0L
        var positiveSum = 0L

        for (i in nums.indices) {
            positiveSum += maxOf(nums[i], 0)
            nums[i] = Math.abs(nums[i])
        }
        nums.sort()

        val heap = PriorityQueue<LongArray> { a1, a2 -> a1[0].compareTo(a2[0]) }
        heap.offer(longArrayOf(nums[0].toLong(), 0))

        var k = k
        while (--k > 0) {
            val top = heap.poll()
            val value = top[0]
            val i = top[1]++.toInt()
            minusSum = value

            if (i >= nums.size - 1) continue
            top[0] = top[0] + nums[i + 1]

            heap.offer(longArrayOf(value - nums[i] + nums[i + 1], i + 1L))
            heap.offer(top)
        }
        return positiveSum - minusSum
    }
}
