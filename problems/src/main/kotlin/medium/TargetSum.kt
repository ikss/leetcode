package medium

/**
 * You are given an integer array nums and an integer target.
 *
 * You want to build an expression out of nums by adding one of the symbols '+' and '-'
 * before each integer in nums and then concatenate all the integers.
 * * For example, if nums = [2, 1], you can add a '+' before 2 and a '-'
 * before 1 and concatenate them to build the expression "+2-1".
 *
 * Return the number of different expressions that you can build, which evaluates to target.
 *
 * [URL](https://leetcode.com/problems/target-sum/)
 */
object TargetSum {
    fun findTargetSumWaysDfs(nums: IntArray, target: Int): Int {
        val cache = HashMap<Pair<Int, Int>, Int>()

        return dfs(nums, 0, target, cache)
    }

    private fun dfs(nums: IntArray, curr: Int, target: Int, cache: HashMap<Pair<Int, Int>, Int>): Int {
        if (curr == nums.size) {
            return if (target == 0) {
                1
            } else {
                0
            }
        }
        cache[curr to target]?.let { return it }

        val result = dfs(nums, curr + 1, target - nums[curr], cache) +
                dfs(nums, curr + 1, target + nums[curr], cache)

        cache[curr to target] = result
        return result
    }

    fun findTargetSumWaysDp(nums: IntArray, target: Int): Int {
        var dp = HashMap<Int, Int>()
        
        dp[nums[0]] = 1
        dp[-nums[0]] = dp.getOrDefault(-nums[0], 0) + 1
        
        for (i in 1 until nums.size) {
            val n = nums[i]
            val next = HashMap<Int, Int>()
            for ((k, v) in dp) {
                next[k + n] = next.getOrDefault(k + n, 0) + v
                next[k - n] = next.getOrDefault(k - n, 0) + v
            }
            dp = next
        }
        
        return dp[target] ?: 0
    }

}
