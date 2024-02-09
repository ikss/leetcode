package arrays.medium

import java.util.*

/**
 * Given a set of distinct positive integers nums, return the largest subset answer such that
 * every pair `(answer[i], answer[j])` of elements in this subset satisfies:
 * * `answer[i] % answer[j] == 0`, or
 * * `answer[j] % answer[i] == 0`
 *
 * If there are multiple solutions, return any of them.
 *
 * [URL](https://leetcode.com/problems/largest-divisible-subset/)
 */
object LargestDivisibleSubset {
    fun largestDivisibleSubset(nums: IntArray): List<Int> {
        nums.sort()
        val dp = Array(nums.size) { arrayListOf(nums[it]) }
        var result = dp.first()

        for (i in 1 until nums.size) {
            val curr = nums[i]
            for (j in 0 until i) {
                val prev = nums[j]
                if (prev > curr / 2) break
                if ((curr % prev == 0) && (dp[i].size < dp[j].size + 1)) {
                    dp[i] = ArrayList(dp[j]).apply { add(curr) }
                }
            }
            if (dp[i].size > result.size) {
                result = dp[i]
            }
        }

        return result
    }

}