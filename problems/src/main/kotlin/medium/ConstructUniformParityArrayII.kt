package medium

/**
 * You are given an array nums1 of n distinct integers.
 *
 * You want to construct another array nums2 of length n such that the elements in nums2 are either all odd or all even.
 *
 * For each index i, you must choose exactly one of the following (in any order):
 *
 * `nums2[i] = nums1[i]`
 * `nums2[i] = nums1[i] - nums1[j]`, for an index j != i, such that `nums1[i] - nums1[j] >= 1`
 * Return true if it is possible to construct such an array, otherwise return false.
 *
 * [URL](https://leetcode.com/problems/construct-uniform-parity-array-ii/)
 */
object ConstructUniformParityArrayII {
    fun uniformArray(nums1: IntArray): Boolean {
        if (nums1.size == 1) return true

        var maxOdd = 0
        var minOdd = Int.MAX_VALUE
        var maxEven = 0
        var minEven = Int.MAX_VALUE

        for (n in nums1) {
            if (n % 2 == 0) {
                maxEven = maxOf(maxEven, n)
                minEven = minOf(minEven, n)
            } else {
                maxOdd = maxOf(maxOdd, n)
                minOdd = minOf(minOdd, n)
            }
        }

        return maxOdd == 0 || maxEven == 0 || minEven > minOdd
    }
}
