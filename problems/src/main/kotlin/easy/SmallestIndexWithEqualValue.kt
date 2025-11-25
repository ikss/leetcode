package easy

/**
 * Given a 0-indexed integer array nums, return the smallest index i of nums such that `i mod 10 == nums[i]`,
 * or -1 if such index does not exist.
 *
 * x mod y denotes the remainder when x is divided by y.
 *
 * [URL](https://leetcode.com/problems/smallest-index-with-equal-value/)
 */
object SmallestIndexWithEqualValue {
    fun smallestEqual(nums: IntArray): Int {
        for (i in nums.indices) {
            if (i % 10 == nums[i]) return i
        }
        return -1
    }

    fun smallestEqualOneLine(nums: IntArray): Int {
        return nums.withIndex().firstOrNull { it.index % 10 == it.value }?.index ?: -1
    }
}
