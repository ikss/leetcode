package easy

/**
 * Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
 *
 * [URL](https://leetcode.com/problems/maximum-product-of-three-numbers/)
 */
object MaximumProductOfThreeNumbers {
    fun maximumProductSort(nums: IntArray): Int {
        nums.sort()
        val n = nums.size

        return maxOf(nums[0] * nums[1] * nums[n - 1], nums[n - 3] * nums[n - 2] * nums[n - 1])
    }

    fun maximumProductMinMax(nums: IntArray): Int {
        var min1 = Int.MAX_VALUE
        var min2 = Int.MAX_VALUE
        var max1 = Int.MIN_VALUE
        var max2 = Int.MIN_VALUE
        var max3 = Int.MIN_VALUE
        for (n in nums) {
            if (n <= min1) {
                min2 = min1
                min1 = n
            } else if (n <= min2) {     // n lies between min1 and min2
                min2 = n
            }
            if (n >= max1) {            // n is greater than max1, max2 and max3
                max3 = max2
                max2 = max1
                max1 = n
            } else if (n >= max2) {     // n lies betweeen max1 and max2
                max3 = max2
                max2 = n
            } else if (n >= max3) {     // n lies betwen max2 and max3
                max3 = n
            }
        }
        return maxOf(min1 * min2 * max1, max1 * max2 * max3)
    }
}
