package hard

/**
 * You are given two 0-indexed arrays nums and cost consisting each of n positive integers.
 *
 * You can do the following operation any number of times:
 * * Increase or decrease any element of the array nums by 1.
 * The cost of doing one operation on the ith element is `cost[i]`.
 *
 * Return the minimum total cost such that all the elements of the array nums become equal.
 *
 * [URL](https://leetcode.com/problems/minimum-cost-to-make-array-equal/)
 */
object MinimumCostToMakeArrayEqual {
    fun minCost(nums: IntArray, cost: IntArray): Long {
        var min = nums.min()
        var max = nums.max()
        if (min == max) return 0

        var result = 0L

        while (min < max) {
            val mid = min + (max - min) / 2

            val costMid = calcCost(nums, cost, mid)
            val costNext = calcCost(nums, cost, mid + 1)

            if (costMid > costNext) {
                min = mid + 1
            } else {
                max = mid
            }
            result = minOf(costMid, costNext)
        }

        return result
    }

    private fun calcCost(nums: IntArray, cost: IntArray, goal: Int): Long {
        var result = 0L
        for (i in nums.indices) {
            result += cost[i].toLong() * (Math.abs(nums[i] - goal))
        }

        return result
    }
}
