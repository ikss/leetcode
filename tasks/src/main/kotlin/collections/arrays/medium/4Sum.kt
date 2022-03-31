package collections.arrays.medium

import java.util.*

/**
 * Given an array nums of n integers, return an array of all the unique quadruplets [nums(a), nums(b), nums(c), nums(d)] such that:
 * * 0 <= a, b, c, d < n
 * * a, b, c, and d are distinct.
 * * nums(a) + nums(b) + nums(c) + nums(d) == target
 *
 * URL: [https://leetcode.com/problems/4sum/]
 */
object `4Sum` {
    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
        Arrays.sort(nums)
        return kSum(nums, target, 0, 4)
    }

    private fun kSum(nums: IntArray, target: Int, start: Int, k: Int): List<List<Int>> {
        val res = mutableListOf<MutableList<Int>>()

        // If we have run out of numbers to add, return res.
        if (start == nums.size) {
            return res
        }

        // There are k remaining values to add to the sum. The
        // average of these values is at least target / k.
        val averageValue = target / k

        // We cannot obtain a sum of target if the smallest value
        // in nums is greater than target / k or if the largest
        // value in nums is smaller than target / k.
        if (nums[start] > averageValue || nums[nums.size - 1] < averageValue) {
            return res
        }
        if (k == 2) {
            return twoSum(nums, target, start)
        }
        for (i in start until nums.size) {
            if (i == start || nums[i - 1] != nums[i]) {
                for (subset in kSum(nums, target - nums[i], i + 1, k - 1)) {
                    res.add(mutableListOf(nums[i]))
                    res[res.size - 1].addAll(subset)
                }
            }
        }
        return res
    }

    private fun twoSum(nums: IntArray, target: Int, start: Int): List<List<Int>> {
        val res = mutableListOf<List<Int>>()

        var lo = start
        var hi = nums.size - 1
        while (lo < hi) {
            val currSum = nums[lo] + nums[hi]
            if (currSum < target || lo > start && nums[lo] == nums[lo - 1]) {
                ++lo
            } else if (currSum > target || ((hi < nums.size - 1) && (nums[hi] == nums[hi + 1]))) {
                --hi
            } else {
                res.add(listOf(nums[lo++], nums[hi--]))
            }
        }
        return res
    }
}
