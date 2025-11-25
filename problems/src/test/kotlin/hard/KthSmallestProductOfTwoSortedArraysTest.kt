package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class KthSmallestProductOfTwoSortedArraysTest {
    @Test
    fun test1() {
        val nums1 = intArrayOf(2, 5)
        val nums2 = intArrayOf(3, 4)
        val k = 2L
        val expected = 8L

        assertEquals(expected, KthSmallestProductOfTwoSortedArrays.kthSmallestProduct(nums1, nums2, k))
    }

    @Test
    fun test2() {
        val nums1 = intArrayOf(-4, -2, 0, 3)
        val nums2 = intArrayOf(2, 4)
        val k = 6L
        val expected = 0L

        assertEquals(expected, KthSmallestProductOfTwoSortedArrays.kthSmallestProduct(nums1, nums2, k))
    }

    @Test
    fun test3() {
        val nums1 = intArrayOf(-2, -1, 0, 1, 2)
        val nums2 = intArrayOf(-3, -1, 2, 4, 5)
        val k = 3L
        val expected = -6L

        assertEquals(expected, KthSmallestProductOfTwoSortedArrays.kthSmallestProduct(nums1, nums2, k))
    }
}