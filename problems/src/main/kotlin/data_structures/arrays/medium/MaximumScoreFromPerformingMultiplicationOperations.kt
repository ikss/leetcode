package data_structures.arrays.medium

/**
 * You are given two integer arrays nums and multipliers of size n and m respectively, where n >= m. The arrays are 1-indexed.
 *
 * You begin with a score of 0. You want to perform exactly m operations. On the ith operation (1-indexed), you will:
 *
 *  * Choose one integer x from either the start or the end of the array nums.
 *  * Add `multipliers[i]` * x to your score.
 *  * Remove x from the array nums.
 *
 * Return the maximum score after performing m operations.
 *
 * [URL](https://leetcode.com/problems/maximum-score-from-performing-multiplication-operations/)
 */
object MaximumScoreFromPerformingMultiplicationOperations {
    fun maximumScore(nums: IntArray, multipliers: IntArray): Int {
        val n = nums.size
        val m = multipliers.size

        val dp = Array(m + 1) { IntArray(m + 1) }

        for (op in m - 1 downTo 0) {
            for (left in op downTo 0) {
                val multiplier = multipliers[op]
                dp[op][left] = maxOf(
                    multiplier * nums[left] + dp[op + 1][left + 1],
                    multiplier * nums[n - 1 - (op - left)] + dp[op + 1][left]
                )
                println(dp.contentDeepToString())
            }
        }
        return dp[0][0]
    }
}