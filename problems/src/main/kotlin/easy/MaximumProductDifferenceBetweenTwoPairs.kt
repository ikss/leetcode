package easy

/**
 * The product difference between two pairs (a, b) and (c, d) is defined as (a * b) - (c * d).
 *
 * For example, the product difference between (5, 6) and (2, 7) is (5 * 6) - (2 * 7) = 16.
 * Given an integer array nums, choose four distinct indices w, x, y, and z such that the product difference between
 * pairs (`nums[w]`, `nums[x]`) and (`nums[y]`, `nums[z]`) is maximized.
 *
 * Return the maximum such product difference.
 *
 * [URL](https://leetcode.com/problems/maximum-product-difference-between-two-pairs/)
 */
object MaximumProductDifferenceBetweenTwoPairs {
    fun maxProductDifference(nums: IntArray): Int {
        var max1 = Int.MIN_VALUE
        var max2 = Int.MIN_VALUE

        var min1 = Int.MAX_VALUE
        var min2 = Int.MAX_VALUE

        for (i in nums) {
            if (i > max1) {
                max2 = max1
                max1 = i
            } else {
                max2 = maxOf(max2, i)
            }
            if (i < min1) {
                min2 = min1
                min1 = i
            } else {
                min2 = minOf(min2, i)
            }
        }
        return max1 * max2 - min1 * min2
    }
}
