package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumSumCircularSubarrayTest {

    @Test
    fun test1() {
        val nums = intArrayOf(1, -2, 3, -2)
        val expected = 3

        assertEquals(expected, MaximumSumCircularSubarray.maxSubarraySumCircular(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(5, -3, 5)
        val expected = 10

        assertEquals(expected, MaximumSumCircularSubarray.maxSubarraySumCircular(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(-3, -2, -3)
        val expected = -2

        assertEquals(expected, MaximumSumCircularSubarray.maxSubarraySumCircular(nums))
    }
}