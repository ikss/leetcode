package collections.arrays.easy

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class IntersectionOfTwoArraysIITest {
    @Test
    fun test1() {
        val nums1 = intArrayOf(1, 2, 2, 1)
        val nums2 = intArrayOf(2, 2)
        val expected = intArrayOf(2, 2)
        val result = IntersectionOfTwoArraysII.intersect(nums1, nums2)
        assertTrue(expected.contentEquals(result))
    }

    @Test
    fun test2() {
        val nums1 = intArrayOf(4, 9, 5)
        val nums2 = intArrayOf(9, 4, 9, 8, 4)
        val expected = intArrayOf(4, 9)
        val result = IntersectionOfTwoArraysII.intersect(nums1, nums2)
        assertTrue(expected.contentEquals(result))
    }
}
