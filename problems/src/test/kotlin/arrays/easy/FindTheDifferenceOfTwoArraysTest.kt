package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheDifferenceOfTwoArraysTest {
    @Test
    fun test1() {
        val nums1 = intArrayOf(1, 2, 3)
        val nums2 = intArrayOf(2, 4, 6)
        val expected = listOf(listOf(1, 3), listOf(4, 6))

        assertEquals(expected, FindTheDifferenceOfTwoArrays.findDifference(nums1, nums2))
    }

    @Test
    fun test2() {
        val nums1 = intArrayOf(1, 2, 3, 3)
        val nums2 = intArrayOf(1, 1, 2, 2)
        val expected = listOf(listOf(3), listOf())

        assertEquals(expected, FindTheDifferenceOfTwoArrays.findDifference(nums1, nums2))
    }
}