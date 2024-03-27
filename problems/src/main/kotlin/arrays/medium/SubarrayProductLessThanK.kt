package arrays.medium

/**
 * Given an array of integers nums and an integer k, return the number of contiguous subarrays where
 * the product of all the elements in the subarray is strictly less than k.
 *
 * [URL](https://leetcode.com/problems/subarray-product-less-than-k/)
 */
object SubarrayProductLessThanK {
    fun numSubarrayProductLessThanKBruteForce(nums: IntArray, k: Int): Int {
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

    fun numSubarrayProductLessThanKSlidingWindow(nums: IntArray, k: Int): Int {
        if (k <= 1) return 0

        var result = 0
        var product = 1

        var left = 0
        var right = 0
        while (right < nums.size) {
            product *= nums[right]

            while (product >= k) {
                product /= nums[left++]
            }

            result += right - left + 1
            right++
        }

        return result
    }
}