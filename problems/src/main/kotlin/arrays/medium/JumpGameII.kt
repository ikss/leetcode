package arrays.medium

/**
 * You are given a 0-indexed array of integers nums of length n. You are initially positioned at `nums[0]`.
 *
 * Each element `nums[i]` represents the maximum length of a forward jump from index i. In other words,
 * if you are at `nums[i]`, you can jump to any `nums[i + j]` where:
 * * 0 <= j <= `nums[i]` and
 * * i + j < n
 *
 * Return the minimum number of jumps to reach `nums[n - 1]`. The test cases are generated such that you can reach
 * `nums[n - 1]`.
 *
 * [URL](https://leetcode.com/problems/jump-game-ii/)
 */
object JumpGameII {
    fun jumpDp(nums: IntArray): Int {
        val dp = IntArray(nums.size) { 100001 }
        dp[0] = 0

        for (i in nums.indices) {
            println(dp.contentToString())
            val num = nums[i]
            for (j in i..minOf(nums.size - 1, num + i)) {
                dp[j] = minOf(dp[j], dp[i] + 1)
            }
        }

        return dp[nums.size - 1]
    }

    fun jumpOfficial(nums: IntArray): Int {
        var result = 0
        var currFar = 0
        var currEnd = 0

        for (i in 0 until nums.size - 1) {
            currFar = maxOf(currFar, nums[i] + i)
            if (i == currEnd) {
                result++
                currEnd = currFar
            }
        }

        return result
    }
}
