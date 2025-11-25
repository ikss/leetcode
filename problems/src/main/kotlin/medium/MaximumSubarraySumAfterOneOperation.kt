package medium

/**
 * You are given an integer array nums. You must perform exactly one operation where you can replace one element
 * `nums[i]` with `nums[i] * nums[i]`.
 *
 * Return the maximum possible subarray sum after exactly one operation. The subarray must be non-empty.
 *
 * [URL](https://leetcode.com/problems/maximum-subarray-sum-after-one-operation/)
 */
object MaximumSubarraySumAfterOneOperation {
    fun maxSumAfterOperation(nums: IntArray): Int {
        val n = nums.size

        val dp = Array(n) { IntArray(2) }
        dp[0][0] = nums[0]
        dp[0][1] = nums[0] * nums[0]

        var result = 0

        for (i in 1 until n) {
            dp[i][0] = maxOf(
                nums[i],
                dp[i - 1][0] + nums[i]
            )

            dp[i][1] = maxOf(
                nums[i] * nums[i],
                dp[i - 1][1] + nums[i],
                dp[i - 1][0] + nums[i] * nums[i]
            )

            result = maxOf(result, dp[i][1])
        }

        return result
    }
}
