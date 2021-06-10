package collections.arrays.hard

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MedianTwoSortedArraysTest {

    @Test
    fun `example 1 test`() {
        val nums1 = intArrayOf(1, 3)
        val nums2 = intArrayOf(2)
        assertEquals(2.0, MedianTwoSortedArrays.findMedianSortedArrays(nums1, nums2))
    }

    @Test
    fun `example 2 test`() {
        val nums1 = intArrayOf(1, 2)
        val nums2 = intArrayOf(3, 4)
        assertEquals(2.5, MedianTwoSortedArrays.findMedianSortedArrays(nums1, nums2))
    }

    @Test
    fun `example 3 test`() {
        val nums1 = intArrayOf(0, 0)
        val nums2 = intArrayOf(0, 0)
        assertEquals(0.0, MedianTwoSortedArrays.findMedianSortedArrays(nums1, nums2))
    }

    @Test
    fun `example 4 test`() {
        val nums1 = intArrayOf()
        val nums2 = intArrayOf(1)
        assertEquals(1.0, MedianTwoSortedArrays.findMedianSortedArrays(nums1, nums2))
    }

    @Test
    fun `example 5 test`() {
        val nums1 = intArrayOf(2)
        val nums2 = intArrayOf()
        assertEquals(2.0, MedianTwoSortedArrays.findMedianSortedArrays(nums1, nums2))
    }

    @Test
    fun `example 6 test`() {
        val nums1 = intArrayOf(2, 2, 4, 4)
        val nums2 = intArrayOf(2, 2, 4, 4)
        assertEquals(3.0, MedianTwoSortedArrays.findMedianSortedArrays(nums1, nums2))
    }

    @Test
    fun `example 7 test`() {
        val nums1 = intArrayOf()
        val nums2 = intArrayOf(1, 2, 3, 4, 5)
        assertEquals(3.0, MedianTwoSortedArrays.findMedianSortedArrays(nums1, nums2))
    }
}
