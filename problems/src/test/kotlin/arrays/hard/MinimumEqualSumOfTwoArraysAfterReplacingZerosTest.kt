package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumEqualSumOfTwoArraysAfterReplacingZerosTest {
    @Test
    fun test1() {
        val nums1 = intArrayOf(3, 2, 0, 1, 0)
        val nums2 = intArrayOf(6, 5, 0)
        val expected = 12

        assertEquals(expected, MinimumEqualSumOfTwoArraysAfterReplacingZeros.minSum(nums1, nums2))
    }

    @Test
    fun test2() {
        val nums1 = intArrayOf(2, 0, 2, 0)
        val nums2 = intArrayOf(1, 2)
        val expected = -1

        assertEquals(expected, MinimumEqualSumOfTwoArraysAfterReplacingZeros.minSum(nums1, nums2))
    }
}