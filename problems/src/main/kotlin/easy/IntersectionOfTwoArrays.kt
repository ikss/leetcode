package easy

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must be unique and you may return the result in any order.
 *
 * [URL](https://leetcode.com/problems/intersection-of-two-arrays/)
 */
object IntersectionOfTwoArrays {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val set1 = nums1.toSet()
        val set2 = nums2.toSet()

        return set1.intersect(set2).toIntArray()
    }
}
