package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SubarrayProductLessThanKTest {
    @Test
    fun test1bruteForce() {
        val nums = intArrayOf(10, 5, 2, 6)
        val k = 100
        val expected = 8

        assertEquals(expected, SubarrayProductLessThanK.numSubarrayProductLessThanKBruteForce(nums, k))
    }

    @Test
    fun test2bruteForce() {
        val nums = intArrayOf(1, 2, 3)
        val k = 0
        val expected = 0

        assertEquals(expected, SubarrayProductLessThanK.numSubarrayProductLessThanKBruteForce(nums, k))
    }

    @Test
    fun test1slidingWindow() {
        val nums = intArrayOf(10, 5, 2, 6)
        val k = 100
        val expected = 8

        assertEquals(expected, SubarrayProductLessThanK.numSubarrayProductLessThanKSlidingWindow(nums, k))
    }

    @Test
    fun test2slidingWindow() {
        val nums = intArrayOf(1, 2, 3)
        val k = 0
        val expected = 0

        assertEquals(expected, SubarrayProductLessThanK.numSubarrayProductLessThanKSlidingWindow(nums, k))
    }
}