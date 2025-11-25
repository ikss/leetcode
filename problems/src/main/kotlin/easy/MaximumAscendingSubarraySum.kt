package easy

/**
 * Given an array of positive integers nums, return the maximum possible sum of an ascending subarray in nums.
 *
 * A subarray is defined as a contiguous sequence of numbers in an array.
 *
 * A subarray `[numsl, numsl+1, ..., numsr-1, numsr]` is ascending if for all i where l <= i < r, numsi  < numsi+1.
 * Note that a subarray of size 1 is ascending.
 *
 * [URL](https://leetcode.com/problems/maximum-ascending-subarray-sum/)
 */
object MaximumAscendingSubarraySum {
    fun maxAscendingSum(nums: IntArray): Int {
        var curr = nums[0]
        var result = nums[0]

        for (i in 1 until nums.size) {
            if (nums[i] > nums[i - 1]) {
                curr += nums[i]
            } else {
                curr = nums[i]
            }

            result = maxOf(result, curr)
        }

        return result
    }
}
