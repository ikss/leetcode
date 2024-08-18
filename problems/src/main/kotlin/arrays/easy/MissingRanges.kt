package arrays.easy

/**
 * You are given an inclusive range `[lower, upper]` and a sorted unique integer array nums,
 * where all elements are within the inclusive range.
 *
 * A number x is considered missing if x is in the range [lower, upper] and x is not in nums.
 *
 * Return the shortest sorted list of ranges that exactly covers all the missing numbers.
 * That is, no element of nums is included in any of the ranges, and each missing number is covered by one of the ranges.
 *
 * [URL](https://leetcode.com/problems/missing-ranges/)
 */
object MissingRanges {
    fun findMissingRanges(nums: IntArray, lower: Int, upper: Int): List<List<Int>> {
        if (nums.isEmpty()) {
            return listOf(listOf(lower, upper))
        }

        val result = ArrayList<List<Int>>()

        if (lower < nums.first()) {
            result.add(listOf(lower, nums[0] - 1))
        }

        for (i in 0 until nums.size - 1) {
            if (nums[i] != nums[i + 1] - 1) {
                result.add(listOf(nums[i] + 1, nums[i + 1] - 1))
            }
        }

        if (upper > nums.last()) {
            result.add(listOf(nums.last() + 1, upper))
        }

        return result
    }
}
