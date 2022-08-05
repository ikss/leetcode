package data_structures.arrays.medium

/**
 * Given an array of distinct integers nums and a target integer target,
 * return the number of possible combinations that add up to target.
 *
 * The test cases are generated so that the answer can fit in a 32-bit integer.
 *
 * [URL](https://leetcode.com/problems/01-matrix/)
 */
object CombinationsSumIV {
    fun combinationSum4(nums: IntArray, target: Int): Int {
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
}
