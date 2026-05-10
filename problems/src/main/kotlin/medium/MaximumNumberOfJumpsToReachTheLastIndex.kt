package medium

/**
 * You are given a 0-indexed array nums of n integers and an integer target.
 *
 * You are initially positioned at index 0. In one step, you can jump from index i to any index j such that:
 *
 * * 0 <= i < j < n
 * * -target <= `nums[j] - nums[i]` <= target
 * Return the maximum number of jumps you can make to reach index n - 1.
 *
 * If there is no way to reach index n - 1, return -1.
 *
 * [URL](https://leetcode.com/problems/maximum-number-of-jumps-to-reach-the-last-index/)
 */
object MaximumNumberOfJumpsToReachTheLastIndex {
    fun maximumJumps(nums: IntArray, target: Int): Int {
        val n = nums.size
        val dp = IntArray(n) { Int.MIN_VALUE }
        dp[0] = 0

        for (i in 0 until n) {
            for (j in 0 until i) {
                if (nums[j] - nums[i] in -target..target) {
                    dp[i] = maxOf(dp[i], dp[j] + 1)
                }
            }
        }

        return if (dp[n - 1] < 0) -1 else dp[n - 1]
    }
}
