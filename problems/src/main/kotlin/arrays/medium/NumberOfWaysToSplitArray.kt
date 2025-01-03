package arrays.medium

import java.util.*

/**
 * You are given a 0-indexed integer array nums of length n.
 *
 * nums contains a valid split at index i if the following are true:
 *
 * * The sum of the first i + 1 elements is greater than or equal to the sum of the last n - i - 1 elements.
 * * There is at least one element to the right of i. That is, 0 <= i < n - 1.
 *
 * Return the number of valid splits in nums.
 *
 * [URL](https://leetcode.com/problems/number-of-ways-to-split-array/)
 */
object NumberOfWaysToSplitArray {
    fun waysToSplitArray(nums: IntArray): Int {
        val prefixSum = LongArray(nums.size + 1)
        prefixSum[0] = 0

        for (i in nums.indices) {
            prefixSum[i + 1] = prefixSum[i] + nums[i]
        }

        var result = 0

        for (i in 0 until nums.size - 1) {
            val left = prefixSum[i + 1]
            val right = prefixSum[nums.size] - left

            if (left >= right) {
                result++
            }
        }

        return result
    }
}