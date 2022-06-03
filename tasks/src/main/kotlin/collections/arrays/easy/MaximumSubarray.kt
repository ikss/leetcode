package collections.arrays.easy

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number)
 * which has the largest sum and return its sum.
 * A subarray is a contiguous part of an array.
 *
 * [URL](https://leetcode.com/problems/maximum-subarray/)
 */
object MaximumSubarray {
    fun maxSubArray(nums: IntArray): Int {
        var maxSum = nums[0]
        var curSum = nums[0]
        for (i in 1 until nums.size) {
            val num = nums[i]
            curSum = Math.max(curSum + num, num)
            maxSum = Math.max(maxSum, curSum)
        }
        return maxSum
    }
}
