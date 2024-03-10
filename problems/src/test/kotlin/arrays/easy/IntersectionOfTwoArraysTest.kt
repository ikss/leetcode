package arrays.easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class IntersectionOfTwoArraysTest {
    @Test
    fun test1() {
        val nums1 = intArrayOf(1, 2, 2, 1)
        val nums2 = intArrayOf(2, 2)
        val expected = intArrayOf(2)

        assertArrayEquals(expected, IntersectionOfTwoArrays.intersection(nums1, nums2))
    }

    @Test
    fun test2() {
        val nums1 = intArrayOf(4, 9, 5)
        val nums2 = intArrayOf(9, 4, 9, 8, 4)
        val expected = intArrayOf(4, 9)

        assertArrayEquals(expected, IntersectionOfTwoArrays.intersection(nums1, nums2))
    }
}