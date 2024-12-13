package arrays.medium

import java.util.*

/**
 * You are given an array nums consisting of positive integers.
 *
 * Starting with score = 0, apply the following algorithm:
 * * Choose the smallest integer of the array that is not marked.
 * If there is a tie, choose the one with the smallest index.
 * * Add the value of the chosen integer to score.
 * * Mark the chosen element and its two adjacent elements if they exist.
 * * Repeat until all the array elements are marked.
 *
 * Return the score you get after applying the above algorithm.
 *
 * [URL](https://leetcode.com/problems/find-score-of-an-array-after-marking-all-elements/)
 */
object FindScoreOfAnArrayAfterMarkingAllElements {
    fun findScore(nums: IntArray): Long {
        val marked = HashSet<Int>()
        var result = 0L

        val queue = PriorityQueue<IntArray> { a1, a2 ->
            val diff = a1[0] - a2[0]
            if (diff == 0) a1[1] - a2[1] else diff
        }

        for (i in nums.indices) {
            queue.offer(intArrayOf(nums[i], i))
        }

        while (queue.isNotEmpty()) {
            val (num, index) = queue.poll()
            if (!marked.add(index)) continue
            marked.add(index - 1)
            marked.add(index + 1)
            result += num
        }

        return result
    }
}