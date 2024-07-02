package arrays.easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class IntersectionOfTwoArraysIITest {
    @Test
    fun test1sort() {
        val nums1 = intArrayOf(1, 2, 2, 1)
        val nums2 = intArrayOf(2, 2)
        val expected = intArrayOf(2, 2)
        val result = IntersectionOfTwoArraysII.intersectSort(nums1, nums2)

        assertArrayEquals(expected, result)
    }

    @Test
    fun test2sort() {
        val nums1 = intArrayOf(4, 9, 5)
        val nums2 = intArrayOf(9, 4, 9, 8, 4)
        val expected = intArrayOf(4, 9)
        val result = IntersectionOfTwoArraysII.intersectSort(nums1, nums2)

        assertArrayEquals(expected, result)
    }

    @Test
    fun test1map() {
        val nums1 = intArrayOf(1, 2, 2, 1)
        val nums2 = intArrayOf(2, 2)
        val expected = intArrayOf(2, 2)
        val result = IntersectionOfTwoArraysII.intersectMap(nums1, nums2)

        assertArrayEquals(expected, result)
    }

    @Test
    fun test2map() {
        val nums1 = intArrayOf(4, 9, 5)
        val nums2 = intArrayOf(9, 4, 9, 8, 4)
        val expected = intArrayOf(9, 4)
        val result = IntersectionOfTwoArraysII.intersectMap(nums1, nums2)

        assertArrayEquals(expected, result)
    }
}
