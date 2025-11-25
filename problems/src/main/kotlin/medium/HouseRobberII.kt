package medium

/**
 * You are a professional robber planning to rob houses along a street.
 * Each house has a certain amount of money stashed. All houses at this place are arranged in a circle.
 * That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have a security system
 * connected, and it will automatically contact the police if two adjacent houses were broken into on the same night.
 *
 * Given an integer array nums representing the amount of money of each house, return the maximum amount of money you
 * can rob tonight without alerting the police.
 *
 * [URL](https://leetcode.com/problems/house-robber-ii/)
 */
object HouseRobberII {
    fun rob(nums: IntArray): Int {
        val cache = HashMap<Pair<Int, Boolean>, Int>()
        return maxOf(
            dfs(1, nums, cache, false),
            nums[0] + dfs(2, nums, cache, true)
        )
    }

    private fun dfs(curr: Int, nums: IntArray, cache: HashMap<Pair<Int, Boolean>, Int>, firstRobbed: Boolean): Int {
        if (curr >= nums.size || (curr == nums.size - 1 && firstRobbed)) return 0
        val key = curr to firstRobbed
        cache[key]?.let { return it }

        val rob = nums[curr] + dfs(curr + 2, nums, cache, firstRobbed)
        val notRob = dfs(curr + 1, nums, cache, firstRobbed)
        val result = maxOf(rob, notRob)

        cache[key] = result
        return result
    }
}
