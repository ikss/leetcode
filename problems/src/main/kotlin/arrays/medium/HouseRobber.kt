package arrays.medium

/**
 * You are a professional robber planning to rob houses along a street.
 * Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them
 * is that adjacent houses have security systems connected and it will automatically contact the police
 * if two adjacent houses were broken into on the same night.
 *
 * Given an integer array nums representing the amount of money of each house, return the maximum amount of money
 * you can rob tonight without alerting the police.
 *
 * [URL](https://leetcode.com/problems/house-robber/)
 */
object HouseRobber {
    fun rob(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        var prev1 = 0
        var prev2 = 0
        for (num in nums) {
            val tmp = prev1
            prev1 = maxOf(prev2 + num, prev1)
            prev2 = tmp
        }
        return prev1
    }
}
