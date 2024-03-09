package arrays.easy

/**
 * Given two integer arrays nums1 and nums2, sorted in non-decreasing order,
 * return the minimum integer common to both arrays. If there is no common integer amongst nums1 and nums2, return -1.
 *
 * Note that an integer is said to be common to nums1 and nums2
 * if both arrays have at least one occurrence of that integer.
 *
 * [URL](https://leetcode.com/problems/minimum-common-value/)
 */
object MinimumCommonValue {
    fun getCommon(nums1: IntArray, nums2: IntArray): Int {
        var i1 = 0
        var i2 = 0

        while (i1 < nums1.size && i2 < nums2.size) {
            val n1 = nums1[i1]
            val n2 = nums2[i2]
            if (n1 == n2) return n1

            if (n1 > n2) {
                i2++
            } else {
                i1++
            }
        }

        return -1
    }
}
