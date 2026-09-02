package easy

/**
 * You are given an array nums1 of n distinct integers.
 *
 * You want to construct another array nums2 of length n such that the elements in nums2 are either all odd or all even.
 *
 * For each index i, you must choose exactly one of the following (in any order):
 * * `nums2[i] = nums1[i]`
 * * `nums2[i] = nums1[i] - nums1[j]`, for an index j != i
 *
 * Return true if it is possible to construct such an array, otherwise, return false.
 *
 * [URL](https://leetcode.com/problems/construct-uniform-parity-array-i/)
 */
object ConstructUniformParityArrayI {
    fun uniformArray(nums1: IntArray): Boolean {
        return true
    }
}