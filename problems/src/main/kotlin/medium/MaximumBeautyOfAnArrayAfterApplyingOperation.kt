package medium

import kotlin.math.max

/**
 * You are given a 0-indexed array nums and a non-negative integer k.
 *
 * In one operation, you can do the following:
 * * Choose an index i that hasn't been chosen before from the range [0, nums.length - 1].
 * * Replace `nums[i] `with any integer from the range `[nums[i] - k, nums[i] + k]`.
 *
 * The beauty of the array is the length of the longest subsequence consisting of equal elements.
 *
 * Return the maximum possible beauty of the array nums after applying the operation any number of times.
 *
 * Note that you can apply the operation to each index only once.
 *
 * A subsequence of an array is a new array generated from the original array by deleting some elements (possibly none)
 * without changing the order of the remaining elements.
 *
 * [URL](https://leetcode.com/problems/maximum-beauty-of-an-array-after-applying-operation/)
 */
object MaximumBeautyOfAnArrayAfterApplyingOperation {
    fun maximumBeauty(nums: IntArray, k: Int): Int {
        if (nums.size == 1) return 1

        var maxValue = 0
        var minValue = 0

        for (num in nums) {
            maxValue = maxOf(maxValue, num)
            minValue = minOf(minValue, num)
        }

        val counts = IntArray(maxValue - minValue + 1)

        for (num in nums) {
            counts[maxOf(num - k - minValue, 0)]++
            counts[minOf(num + k + 1 - minValue, maxValue - minValue)]--
        }

        var curr = 0
        var result = 0
        for (count in counts) {
            curr += count
            result = max(result, curr)
        }

        return result
    }
}
