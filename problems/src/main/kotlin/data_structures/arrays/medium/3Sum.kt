package data_structures.arrays.medium

/**
 * Given an array nums of n integers and an integer target, find three integers in nums
 * such that the sum is closest to target.
 * Return the sum of the three integers. You may assume that each input would have exactly one solution.
 *
 * [URL](https://leetcode.com/problems/3sum-closest/)
 */
object `3Sum` {
    fun threeSum(nums: IntArray): List<List<Int>> {
        if (nums.size < 3) return emptyList()
        nums.sort()
        val distinctTriplets = mutableSetOf<List<Int>>()

        var i = 0
        val n = nums.size

        while (i < n - 2) {
            var j = i + 1
            var k = n - 1
            if (nums[i] > 0) break

            while (j < k) {
                val sum = nums[i] + nums[j] + nums[k]
                if (sum < 0) {
                    j++
                } else if (sum == 0) {
                    distinctTriplets.add(listOf(nums[i], nums[j], nums[k]))
                    j++
                    k--
                } else {
                    k--
                }
            }
            i++
        }

        return distinctTriplets.toList()
    }
}
