package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ContinuousSubarraySumTest {
    @Test
    fun test1() {
        val nums = intArrayOf(23, 2, 4, 6, 7)
        val k = 6
        val expected = true

        assertEquals(expected, ContinuousSubarraySum.checkSubarraySum(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(23, 2, 6, 4, 7)
        val k = 6
        val expected = true

        assertEquals(expected, ContinuousSubarraySum.checkSubarraySum(nums, k))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(23, 2, 6, 4, 7)
        val k = 13
        val expected = false

        assertEquals(expected, ContinuousSubarraySum.checkSubarraySum(nums, k))
    }
}