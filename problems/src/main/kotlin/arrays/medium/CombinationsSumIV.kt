package arrays.medium

/**
 * Given an array of distinct integers nums and a target integer target,
 * return the number of possible combinations that add up to target.
 *
 * The test cases are generated so that the answer can fit in a 32-bit integer.
 *
 * [URL](https://leetcode.com/problems/combination-sum-iv/)
 */
object CombinationsSumIV {
    fun combinationSum4dp(nums: IntArray, target: Int): Int {
        val dp = IntArray(target + 1)
        dp[0] = 1
        for (i in 1..target) {
            for (num in nums) {
                if (num <= i) {
                    dp[i] += dp[i - num]
                }
            }
        }
        return dp[target]
    }

    fun combinationSum4recursive(nums: IntArray, target: Int): Int {
        nums.sort()
        return backtrack(nums, target, 0)
    }

    private fun backtrack(nums: IntArray, target: Int, currSum: Int): Int {
        var result = 0
        for (n in nums) {
            val newSum = currSum + n
            if (newSum == target) {
                return result + 1
            }
            if (newSum > target) break
            result += backtrack(nums, target, newSum)
        }
        return result
    }
}