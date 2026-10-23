package medium

/**
 * You are given an integer array nums of length n, where nums is a permutation of the numbers in the range `[0..n - 1]`.
 *
 * You may swap elements at indices i and j only if `nums[i]` AND `nums[j] == k`,
 * where AND denotes the bitwise AND operation and k is a non-negative integer.
 *
 * Return the maximum value of k such that the array can be sorted in non-decreasing order using any number
 * of such swaps. If nums is already sorted, return 0.
 *
 * [URL](https://leetcode.com/problems/maximum-k-to-sort-a-permutation/)
 */
object MaximumKToSortAPermutation {
    fun sortPermutation(nums: IntArray): Int {
        val sorted = nums.sorted()

        var result = Int.MAX_VALUE

        var hasNotEqual = false
        for (i in nums.indices) {
            if (nums[i] != sorted[i]) {
                result = result and nums[i]
                hasNotEqual = true
            }
        }

        return if (hasNotEqual) result else 0
    }
}
