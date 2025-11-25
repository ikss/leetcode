package medium

/**
 * Given a circular integer array nums of length n, return the maximum possible sum of a non-empty subarray of nums.
 *
 * A circular array means the end of the array connects to the beginning of the array. Formally, the next element of
 * `nums[i]` is nums[(i + 1) % n] and the previous element of `nums[i]` is `nums[(i - 1 + n) % n]`.
 *
 * A subarray may only include each element of the fixed buffer nums at most once. Formally, for a subarray `nums[i]`,
 * `nums[i + 1], ..., nums[j]`, there does not exist i <= k1, k2 <= j with k1 % n == k2 % n.
 *
 * [URL](https://leetcode.com/problems/maximum-sum-circular-subarray/)
 */
object MaximumSumCircularSubarray {
    fun maxSubarraySumCircular(nums: IntArray): Int {
        var curMax = 0
        var curMin = 0
        var sum = 0
        var maxSum = nums[0]
        var minSum = maxSum

        for (num in nums) {
            curMax = maxOf(curMax, 0) + num
            maxSum = maxOf(maxSum, curMax)

            curMin = minOf(curMin, 0) + num
            minSum = minOf(minSum, curMin)

            sum += num
        }
        return when (sum) {
            minSum -> maxSum
            else -> maxOf(maxSum, sum - minSum)
        }
    }
}