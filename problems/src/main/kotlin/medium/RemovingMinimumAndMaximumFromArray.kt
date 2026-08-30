package medium

import java.util.*

/**
 * You are given a 0-indexed array of distinct integers nums.
 *
 * There is an element in nums that has the lowest value and an element that has the highest value.
 * We call them the minimum and maximum respectively. Your goal is to remove both these elements from the array.
 *
 * A deletion is defined as either removing an element from the front of the array or removing an element from the back of the array.
 *
 * Return the minimum number of deletions it would take to remove both the minimum and maximum element from the array.
 *
 * [URL](https://leetcode.com/problems/removing-minimum-and-maximum-from-array/)
 */
object RemovingMinimumAndMaximumFromArray {
    fun minimumDeletions(nums: IntArray): Int {
        val n = nums.size
        var min = nums[0]
        var minIndex = 0
        var max = nums[0]
        var maxIndex = 0

        for (i in 1 until n) {
            if (nums[i] < min) {
                min = nums[i]
                minIndex = i
            }
            if (nums[i] > max) {
                max = nums[i]
                maxIndex = i
            }
        }

        val left = minOf(minIndex, maxIndex)
        val right = maxOf(minIndex, maxIndex)

        return 2 + minOf(
            right - 1,
            left + n - right - 1,
            - left - 1 + n - 1,
        )
    }
}