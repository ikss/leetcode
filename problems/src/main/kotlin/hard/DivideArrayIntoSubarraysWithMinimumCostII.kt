package hard

import java.util.PriorityQueue

/**
 * You are given a 0-indexed array of integers nums of length n, and two positive integers k and dist.
 *
 * The cost of an array is the value of its first element.
 * For example, the cost of `[1,2,3]` is 1 while the cost of `[3,4,1]` is 3.
 *
 * You need to divide nums into k disjoint contiguous subarrays, such that the difference between the starting index of
 * the second subarray and the starting index of the kth subarray should be less than or equal to dist.
 * In other words, if you divide nums into the subarrays `nums[0..(i1 - 1)], nums[i1..(i2 - 1)], ..., nums[ik-1..(n - 1)]`,
 * then ik-1 - i1 <= dist.
 *
 * Return the minimum possible sum of the cost of these subarrays.
 *
 * [URL](https://leetcode.com/problems/adding-spaces-to-a-string/)
 */
object DivideArrayIntoSubarraysWithMinimumCostII {
    fun minimumCost(nums: IntArray, k: Int, dist: Int): Long {
        var result = Long.MAX_VALUE

        for (i in 1 until nums.size - (k - 2)) {
            val midRes = calcResult(nums, k, dist, i)
            result = minOf(result, midRes)
        }

        return result + nums[0]
    }

    private fun calcResult(nums: IntArray, k: Int, dist: Int, start: Int): Long {
        var result = nums[start].toLong()

        val queue = PriorityQueue<Int>(compareByDescending { it })

        for (i in start + 1 .. minOf(start + dist, nums.size - 1)) {
            queue.offer(nums[i])
            if (queue.size > k - 2) {
                queue.poll()
            }
        }

        while (queue.isNotEmpty()) {
            result += queue.poll()
        }

        return result
    }
}