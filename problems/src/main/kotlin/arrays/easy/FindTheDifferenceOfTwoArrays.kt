package arrays.easy

/**
 * Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
 * * `answer[0]` is a list of all distinct integers in nums1 which are not present in nums2.
 * * `answer[1]` is a list of all distinct integers in nums2 which are not present in nums1.
 *
 * Note that the integers in the lists may be returned in any order.
 *
 * [URL](https://leetcode.com/problems/two-sum/)
 */
object FindTheDifferenceOfTwoArrays {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        val s1 = nums1.toSet()
        val s2 = nums2.toSet()

        val res1 = s1 - s2
        val res2 = s2 - s1

        return listOf(res1.toList(), res2.toList())
    }
}
