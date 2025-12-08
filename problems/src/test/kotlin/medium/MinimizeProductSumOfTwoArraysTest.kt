package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimizeProductSumOfTwoArraysTest {
    @Test
    fun test1() {
        val nums1 = intArrayOf(5, 3, 4, 2)
        val nums2 = intArrayOf(4, 2, 2, 5)
        val expected = 40

        assertEquals(expected, MinimizeProductSumOfTwoArrays.minProductSum(nums1, nums2))
    }

    @Test
    fun test2() {
        val nums1 = intArrayOf(2, 1, 4, 5, 7)
        val nums2 = intArrayOf(3, 2, 4, 8, 6)
        val expected = 65

        assertEquals(expected, MinimizeProductSumOfTwoArrays.minProductSum(nums1, nums2))
    }
}