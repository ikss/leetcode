package arrays.medium

/**
 * You are given an integer array nums sorted in non-decreasing order.
 *
 * Build and return an integer array result with the same length as nums such that `result[i]` is equal to the
 * summation of absolute differences between `nums[i]` and all the other elements in the array.
 *
 * In other words, `result[i]` is equal to `sum(|nums[i]-nums[j]|)` where 0 <= j < nums.length and j != i (0-indexed).
 *
 * [URL](https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array/)
 */
object SumOfAbsoluteDifferencesInSortedArray {
    fun getSumAbsoluteDifferences(nums: IntArray): IntArray {
        val size = nums.size
        var sum = 0
        for (n in nums) {
            sum += n
        }

        val result = IntArray(size)
        
        var rollingSum = 0
        for (i in nums.indices) {
            val n = nums[i]
            val left = i * n - rollingSum
            val right = sum - (size - i) * n

            result[i] = left + right
            rollingSum += n
            sum -= n
        }
        return result
    }
}