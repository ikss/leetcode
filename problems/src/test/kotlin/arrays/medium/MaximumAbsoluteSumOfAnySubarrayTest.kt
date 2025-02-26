package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumAbsoluteSumOfAnySubarrayTest {
    @Test
    fun test1() {
        val input = intArrayOf(1, -3, 2, 3, -4)
        val expected = 5

        assertEquals(expected, MaximumAbsoluteSumOfAnySubarray.maxAbsoluteSum(input))
    }

    @Test
    fun test2() {
        val input = intArrayOf(2, -5, 1, -4, 3, -2)
        val expected = 8

        assertEquals(expected, MaximumAbsoluteSumOfAnySubarray.maxAbsoluteSum(input))
    }

}