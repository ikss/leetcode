package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumSubsequenceScoreTest {

    @Test
    fun test1() {
        val nums1 = intArrayOf(1, 3, 3, 2)
        val nums2 = intArrayOf(2, 1, 3, 4)
        val k = 3
        val expected = 12L

        assertEquals(expected, MaximumSubsequenceScore.maxScore(nums1, nums2, k))
    }

    @Test
    fun test2() {
        val nums1 = intArrayOf(4, 2, 3, 1, 1)
        val nums2 = intArrayOf(7, 5, 10, 9, 6)
        val k = 1
        val expected = 30L

        assertEquals(expected, MaximumSubsequenceScore.maxScore(nums1, nums2, k))
    }

    @Test
    fun test3() {
        val nums1 = intArrayOf(2, 1, 14, 12)
        val nums2 = intArrayOf(11, 7, 13, 6)
        val k = 3
        val expected = 168L

        assertEquals(expected, MaximumSubsequenceScore.maxScore(nums1, nums2, k))
    }
}