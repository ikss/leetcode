package arrays.easy

/**
 * Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
 *
 * [URL](https://leetcode.com/problems/maximum-product-of-three-numbers/)
 */
object MaximumProductOfThreeNumbers {
    fun maximumProduct(nums: IntArray): Int {
        nums.sort()
        val n = nums.size

        return maxOf(nums[0] * nums[1] * nums[n - 1], nums[n - 3] * nums[n - 2] * nums[n - 1])
    }
}
