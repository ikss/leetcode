package arrays.medium

import java.util.*

/**
 * Given an integer array nums, your goal is to make all elements in nums equal. To complete one operation,
 * follow these steps:
 * * Find the largest value in nums. Let its index be i (0-indexed) and its value be largest.
 * If there are multiple elements with the largest value, pick the smallest i.
 * * Find the next largest value in nums strictly smaller than largest. Let its value be nextLargest.
 * * Reduce `nums[i]` to nextLargest.
 *
 * Return the number of operations to make all elements in nums equal.
 *
 * [URL](https://leetcode.com/problems/reduction-operations-to-make-the-array-elements-equal/)
 */
object ReductionOperationsToMakeTheArrayElementsEqual {
    fun reductionOperations(nums: IntArray): Int {
        nums.sort()

        var result = 0
        var steps = 0

        for (i in 1 until nums.size) {
            if (nums[i] != nums[i - 1]) {
                steps++
            }
            result += steps
        }
        return result
    }
}