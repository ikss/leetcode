package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ChooseNumbersFromTwoArraysInRangeTest {
    @Test
    fun test1() {
        val nums1 = intArrayOf(1, 2, 5)
        val nums2 = intArrayOf(2, 6, 3)
        val expected = 3

        assertEquals(expected, ChooseNumbersFromTwoArraysInRange.countSubranges(nums1, nums2))
    }

    @Test
    fun test2() {
        val nums1 = intArrayOf(0, 1)
        val nums2 = intArrayOf(1, 0)
        val expected = 4

        assertEquals(expected, ChooseNumbersFromTwoArraysInRange.countSubranges(nums1, nums2))
    }
}