package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MedianTwoSortedArraysTest {

    @Test
    fun test1() {
        val nums1 = intArrayOf(1, 3)
        val nums2 = intArrayOf(2)
        val expected = 2.0

        assertEquals(expected, MedianTwoSortedArrays.findMedianSortedArrays(nums1, nums2))
    }

    @Test
    fun test2() {
        val nums1 = intArrayOf(1, 2)
        val nums2 = intArrayOf(3, 4)
        val expected = 2.5

        assertEquals(expected, MedianTwoSortedArrays.findMedianSortedArrays(nums1, nums2))
    }

    @Test
    fun test3() {
        val nums1 = intArrayOf(0, 0)
        val nums2 = intArrayOf(0, 0)
        val expected = 0.0

        assertEquals(expected, MedianTwoSortedArrays.findMedianSortedArrays(nums1, nums2))
    }

    @Test
    fun test4() {
        val nums1 = intArrayOf()
        val nums2 = intArrayOf(1)
        val expected = 1.0

        assertEquals(expected, MedianTwoSortedArrays.findMedianSortedArrays(nums1, nums2))
    }

    @Test
    fun test5() {
        val nums1 = intArrayOf(2)
        val nums2 = intArrayOf()
        val expected = 2.0

        assertEquals(expected, MedianTwoSortedArrays.findMedianSortedArrays(nums1, nums2))
    }

    @Test
    fun test6() {
        val nums1 = intArrayOf(2, 2, 4, 4)
        val nums2 = intArrayOf(2, 2, 4, 4)
        val expected = 3.0

        assertEquals(expected, MedianTwoSortedArrays.findMedianSortedArrays(nums1, nums2))
    }

    @Test
    fun test7() {
        val nums1 = intArrayOf()
        val nums2 = intArrayOf(1, 2, 3, 4, 5)
        val expected = 3.0

        assertEquals(expected, MedianTwoSortedArrays.findMedianSortedArrays(nums1, nums2))
    }
}
