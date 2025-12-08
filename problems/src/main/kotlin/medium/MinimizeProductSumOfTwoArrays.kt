package medium

/**
 * The product sum of two equal-length arrays a and b is equal to the sum of `a[i] * b[i]` for all 0 <= i < a.length (0-indexed).
 *
 * * For example, if `a = [1,2,3,4]` and `b = [5,2,3,1]`, the product sum would be 1*5 + 2*2 + 3*3 + 4*1 = 22.
 * Given two arrays nums1 and nums2 of length n,
 * return the minimum product sum if you are allowed to rearrange the order of the elements in nums1.
 *
 * [URL](https://leetcode.com/problems/minimize-product-sum-of-two-arrays/)
 */
object MinimizeProductSumOfTwoArrays {
    fun minProductSum(nums1: IntArray, nums2: IntArray): Int {
        var result = 0

        nums1.sort()
        nums2.sortDescending()

        for (i in nums1.indices) {
            result += nums1[i] * nums2[i]
        }

        return result
    }
}
