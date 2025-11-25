package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountPairsInTwoArraysTest {
    @Test
    fun test1() {
        val nums1 = intArrayOf(2, 1, 2, 1)
        val nums2 = intArrayOf(1, 2, 1, 2)
        val expected = 1L

        assertEquals(expected, CountPairsInTwoArrays.countPairs(nums1, nums2))
    }

    @Test
    fun test2() {
        val nums1 = intArrayOf(1, 10, 6, 2)
        val nums2 = intArrayOf(1, 4, 1, 5)
        val expected = 5L

        assertEquals(expected, CountPairsInTwoArrays.countPairs(nums1, nums2))
    }
}