package arrays.easy

/**
 * Given the array of integers nums, you will choose two different indices i and j of that array.
 * Return the maximum value of `(nums[i]-1)*(nums[j]-1)`.
 *
 * [URL](https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/)
 */
object MaximumProductOfTwoElementsInArray {
    fun maxProduct(nums: IntArray): Int {
        var max1 = 0
        var max2 = 0

        for (n in nums) {
            if (n == max1) {
                max2 = n
            } else if (n > max1) {
                max2 = max1
                max1 = n
            } else {
                max2 = maxOf(max2, n)
            }
        }
        return (max1 - 1) * (max2 - 1)
    }
}
