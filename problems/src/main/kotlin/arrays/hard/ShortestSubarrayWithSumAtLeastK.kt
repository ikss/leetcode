package arrays.hard

/**
 * Given an integer array nums and an integer k, return the length of the shortest non-empty subarray of nums with
 * a sum of at least k. If there is no such subarray, return -1.
 *
 * A subarray is a contiguous part of an array.
 *
 * [URL](https://leetcode.com/problems/shortest-subarray-with-sum-at-least-k/)
 */
object ShortestSubarrayWithSumAtLeastK {
    fun shortestSubarray(nums: IntArray, k: Int): Int {
        val n = nums.size
        val prefixSum = LongArray(n + 1)
        for (i in 0 until n) {
            prefixSum[i + 1] = prefixSum[i] + nums[i]
        }
        var result = Int.MAX_VALUE
        val deque = ArrayDeque<Int>()
        for (i in 0..n) {
            while (deque.isNotEmpty() && prefixSum[i] - prefixSum[deque.first()] >= k) {
                result = minOf(result, i - deque.removeFirst())
            }
            while (deque.isNotEmpty() && prefixSum[i] <= prefixSum[deque.last()]) {
                deque.removeLast()
            }
            deque.addLast(i)
        }
        return if (result == Int.MAX_VALUE) -1 else result
    }
}
