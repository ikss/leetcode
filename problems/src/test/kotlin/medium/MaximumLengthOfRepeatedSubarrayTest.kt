package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumLengthOfRepeatedSubarrayTest {
    @Test
    fun test1dp() {
        val nums1 = intArrayOf(1, 2, 3, 2, 1)
        val nums2 = intArrayOf(3, 2, 1, 4, 7)
        val expected = 3

        assertEquals(expected, MaximumLengthOfRepeatedSubarray.findLengthDp(nums1, nums2))
    }

    @Test
    fun test2dp() {
        val nums1 = intArrayOf(0, 0, 0, 0, 0)
        val nums2 = intArrayOf(0, 0, 0, 0, 0)
        val expected = 5

        assertEquals(expected, MaximumLengthOfRepeatedSubarray.findLengthDp(nums1, nums2))
    }

    @Test
    fun test1dp1d() {
        val nums1 = intArrayOf(1, 2, 3, 2, 1)
        val nums2 = intArrayOf(3, 2, 1, 4, 7)
        val expected = 3

        assertEquals(expected, MaximumLengthOfRepeatedSubarray.findLengthDp1d(nums1, nums2))
    }

    @Test
    fun test2dp1d() {
        val nums1 = intArrayOf(0, 0, 0, 0, 0)
        val nums2 = intArrayOf(0, 0, 0, 0, 0)
        val expected = 5

        assertEquals(expected, MaximumLengthOfRepeatedSubarray.findLengthDp1d(nums1, nums2))
    }
}