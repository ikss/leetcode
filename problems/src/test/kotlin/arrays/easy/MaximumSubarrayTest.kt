package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MaximumSubarrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)
        val expected = 6

        assertEquals(expected, MaximumSubarray.maxSubArray(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(-1)
        val expected = -1

        assertEquals(expected, MaximumSubarray.maxSubArray(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(5, 4, -1, 7, 8)
        val expected = 23

        assertEquals(expected, MaximumSubarray.maxSubArray(nums))
    }
}
