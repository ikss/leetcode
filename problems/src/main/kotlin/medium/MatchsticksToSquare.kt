package medium

/**
 * You are given an integer array matchsticks where matchsticks[i] is the length of the ith matchstick.
 * You want to use all the matchsticks to make one square. You should not break any stick, but you can link them up,
 * and each matchstick must be used exactly one time.
 *
 * Return true if you can make this square and false otherwise.
 *
 * [URL](https://leetcode.com/problems/matchsticks-to-square/)
 */
object MatchsticksToSquare {

    fun makesquare(nums: IntArray): Boolean {
        if (nums.size < 4) {
            return false
        }
        val sum = nums.sum()
        if (sum % 4 != 0) {
            return false
        }
        return dfs(nums.sortedDescending(), IntArray(4), 0, sum / 4)
    }

    private fun dfs(nums: List<Int>, sums: IntArray, index: Int, target: Int): Boolean {
        if (index == nums.size) {
            return sums[0] == target && sums[1] == target && sums[2] == target
        }
        for (i in 0..3) {
            if (sums[i] + nums[index] > target) {
                continue
            }
            sums[i] += nums[index]
            if (dfs(nums, sums, index + 1, target)) {
                return true
            }
            sums[i] -= nums[index]
        }
        return false
    }
}
