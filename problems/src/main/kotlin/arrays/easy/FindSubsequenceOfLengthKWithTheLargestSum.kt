package arrays.easy

import java.util.*

/**
 * You are given an integer array nums and an integer k.
 * You want to find a subsequence of nums of length k that has the largest sum.
 *
 * Return any such subsequence as an integer array of length k.
 *
 * A subsequence is an array that can be derived from another array by deleting some or no elements
 * without changing the order of the remaining elements.
 * [URL](https://leetcode.com/problems/find-subsequence-of-length-k-with-the-largest-sum/)
 */
object FindSubsequenceOfLengthKWithTheLargestSum {
    fun maxSubsequence(nums: IntArray, k: Int): IntArray {
        val queue = PriorityQueue<Pair<Int, Int>> { p1, p2 -> p1.first - p2.first }

        for (i in nums.indices) {
            val n = nums[i]
            if (queue.size == k && n == queue.peek().first) continue
            queue.offer(n to i)
            if (queue.size > k) {
                queue.poll()
            }
        }

        return queue.sortedBy { it.second }.map { it.first }.toIntArray()
    }
}
