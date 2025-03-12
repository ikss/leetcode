package arrays.medium

/**
 * Given an array nums of n integers and an integer target, find three integers in nums
 * such that the sum is closest to target.
 * Return the sum of the three integers. You may assume that each input would have exactly one solution.
 *
 * [URL](https://leetcode.com/problems/3sum-closest/)
 */
object `3Sum` {
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()

        val triplets = HashSet<List<Int>>()
        val n = nums.size

        for (left in 0 until n - 2) {
            if (nums[left] > 0) break

            var mid = left + 1
            var right = n - 1

            while (mid < right) {
                val sum = nums[left] + nums[mid] + nums[right]
                if (sum < 0) {
                    mid++
                } else if (sum == 0) {
                    triplets.add(listOf(nums[left], nums[mid], nums[right]))
                    mid++
                    right--
                } else {
                    right--
                }
            }
        }

        return triplets.toList()
    }
}
