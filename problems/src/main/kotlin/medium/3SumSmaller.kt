package medium

/**
 * Given an array of n integers nums and an integer target, find the number of index triplets i, j,
 * k with 0 <= i < j < k < n that satisfy the condition `nums[i] + nums[j] + nums[k] < target`.
 *
 * [URL](https://leetcode.com/problems/3sum-smaller/)
 */
object `3SumSmaller` {
    fun threeSumSmaller(nums: IntArray, target: Int): Int {
        nums.sort()

        var result = 0
        for (i in 0 until nums.size - 2) {
            result += twoSumSmaller(nums, i + 1, target - nums[i])
        }
        return result
    }

    private fun twoSumSmaller(nums: IntArray, startIndex: Int, target: Int): Int {
        var sum = 0
        var left = startIndex
        var right = nums.size - 1
        while (left < right) {
            if (nums[left] + nums[right] < target) {
                sum += right - left
                left++
            } else {
                right--
            }
        }
        return sum
    }
}