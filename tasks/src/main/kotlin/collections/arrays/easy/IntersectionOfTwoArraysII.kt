package collections.arrays.easy

import java.util.*

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must appear as many times as it shows in both arrays, and you may return the result in any order.
 *
 * [URL](https://leetcode.com/problems/intersection-of-two-arrays-ii/)
 */
object IntersectionOfTwoArraysII {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val result = mutableListOf<Int>()
        Arrays.sort(nums1)
        Arrays.sort(nums2)
        var index1 = 0
        var index2 = 0
        do {
            val val1 = nums1[index1]
            val val2 = nums2[index2]

            if (val1 == val2) {
                result += val1
                index1++
                index2++
            } else if (val1 < val2) {
                index1++
            } else {
                index2++
            }
        } while (index1 < nums1.size && index2 < nums2.size)
        return result.toIntArray()
    }
}
