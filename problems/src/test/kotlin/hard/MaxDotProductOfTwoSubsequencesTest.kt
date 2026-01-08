package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaxDotProductOfTwoSubsequencesTest {
    @Test
    fun test1DpTopDown() {
        val nums1 = intArrayOf(2, 1, -2, 5)
        val nums2 = intArrayOf(3, 0, -6)
        val expected = 18

        assertEquals(expected, MaxDotProductOfTwoSubsequences.maxDotProductDpTopDown(nums1, nums2))
    }

    @Test
    fun test2DpTopDown() {
        val nums1 = intArrayOf(3, -2)
        val nums2 = intArrayOf(2, -6, 7)
        val expected = 21

        assertEquals(expected, MaxDotProductOfTwoSubsequences.maxDotProductDpTopDown(nums1, nums2))
    }

    @Test
    fun test3DpTopDown() {
        val nums1 = intArrayOf(-1, -1)
        val nums2 = intArrayOf(1, 1)
        val expected = -1

        assertEquals(expected, MaxDotProductOfTwoSubsequences.maxDotProductDpTopDown(nums1, nums2))
    }
    @Test
    fun test1DpBottomUp() {
        val nums1 = intArrayOf(2, 1, -2, 5)
        val nums2 = intArrayOf(3, 0, -6)
        val expected = 18

        assertEquals(expected, MaxDotProductOfTwoSubsequences.maxDotProductDpBottomUp(nums1, nums2))
    }

    @Test
    fun test2DpBottomUp() {
        val nums1 = intArrayOf(3, -2)
        val nums2 = intArrayOf(2, -6, 7)
        val expected = 21

        assertEquals(expected, MaxDotProductOfTwoSubsequences.maxDotProductDpBottomUp(nums1, nums2))
    }

    @Test
    fun test3DpBottomUp() {
        val nums1 = intArrayOf(-1, -1)
        val nums2 = intArrayOf(1, 1)
        val expected = -1

        assertEquals(expected, MaxDotProductOfTwoSubsequences.maxDotProductDpBottomUp(nums1, nums2))
    }
}