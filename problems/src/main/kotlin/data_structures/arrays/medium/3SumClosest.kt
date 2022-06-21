package data_structures.arrays.medium

/**
 * Given an integer array nums, return all the triplets `[nums[i], nums[j], nums[k]]`
 * such that i != j, i != k, and j != k, and `nums[i] + nums[j] + nums[k] == 0`.
 * Notice that the solution set must not contain duplicate triplets.
 *
 * [URL](https://leetcode.com/problems/3sum/)
 */
object `3SumClosest` {
    fun threeSumClosest(nums: IntArray, target: Int): Int {
        nums.sort()
        var closest = Integer.MAX_VALUE
        var result = 0
        var i = 0
        val n = nums.size

        while (i < n - 2) {
            var j = i + 1
            var k = n - 1

            while (j < k) {
                val sum = nums[i] + nums[j] + nums[k]
                val delta = target - sum
                if (delta == 0) {
                    return sum
                } else if (Math.abs(delta) < closest) {
                    closest = Math.abs(delta)
                    result = sum
                }
                if (delta > 0) {
                    j++
                } else {
                    k--
                }
            }
            i++
        }

        return result
    }
}
