package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestNiceSubarrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 3, 8, 48, 10)
        val expected = 3

        assertEquals(expected, LongestNiceSubarray.longestNiceSubarray(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(3, 1, 5, 11, 13)
        val expected = 8

        assertEquals(expected, LongestNiceSubarray.longestNiceSubarray(nums))
    }
}