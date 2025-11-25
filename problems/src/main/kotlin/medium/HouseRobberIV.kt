package medium

/**
 * There are several consecutive houses along a street, each of which has some money inside.
 * There is also a robber, who wants to steal money from the homes, but he refuses to steal from adjacent homes.
 *
 * The capability of the robber is the maximum amount of money he steals from one house of all the houses he robbed.
 *
 * You are given an integer array nums representing how much money is stashed in each house. More formally,
 * the ith house from the left has `nums[i]` dollars.
 *
 * You are also given an integer k, representing the minimum number of houses the robber will steal from.
 * It is always possible to steal at least k houses.
 *
 * Return the minimum capability of the robber out of all the possible ways to steal at least k houses.
 *
 * [URL](https://leetcode.com/problems/house-robber-iv/)
 */
object HouseRobberIV {
    fun minCapability(nums: IntArray, k: Int): Int {
        var min = 1
        var max = nums.max()

        while (min < max) {
            val mid = (max - min) / 2 + min
            val possible = countPossible(mid, k, nums)
            if (possible) {
                max = mid
            } else {
                min = mid + 1
            }
        }
        return min
    }

    private fun countPossible(capability: Int, k: Int, nums: IntArray): Boolean {
        var houses = 0
        var i = 0
        while (i < nums.size) {
            val n = nums[i]
            if (n <= capability) {
                houses++
                if (houses >= k) {
                    return true
                }
                i += 2
            } else {
                i++
            }
        }
        return false
    }
}
