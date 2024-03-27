package arrays.medium

/**
 * Given an array of integers nums and an integer k, return the number of contiguous subarrays where
 * the product of all the elements in the subarray is strictly less than k.
 *
 * [URL](https://leetcode.com/problems/subarray-product-less-than-k/)
 */
object SubarrayProductLessThanK {
    fun numSubarrayProductLessThanK(nums: IntArray, k: Int): Int {
        var result = 0
        for (i in nums.indices) {
            result += recursive(nums, k, i, nums[i])
        }
        return result
    }

    private fun recursive(nums: IntArray, k: Int, currI: Int, product: Int): Int {
        if (product >= k) {
            return 0
        }

        var result = 1
        if (currI < nums.size - 1) {
            result += recursive(nums, k, currI + 1, product * nums[currI + 1])
        }
        return result
    }

}