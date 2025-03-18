package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestNiceSubarrayTest {
    @Test
    fun test1BitCount() {
        val nums = intArrayOf(1, 3, 8, 48, 10)
        val expected = 3

        assertEquals(expected, LongestNiceSubarray.longestNiceSubarrayBitCount(nums))
    }

    @Test
    fun test2BitCount() {
        val nums = intArrayOf(3, 1, 5, 11, 13)
        val expected = 8

        assertEquals(expected, LongestNiceSubarray.longestNiceSubarrayBitCount(nums))
    }

    @Test
    fun test1Xor() {
        val nums = intArrayOf(1, 3, 8, 48, 10)
        val expected = 3

        assertEquals(expected, LongestNiceSubarray.longestNiceSubarrayXor(nums))
    }

    @Test
    fun test2Xor() {
        val nums = intArrayOf(3, 1, 5, 11, 13)
        val expected = 8

        assertEquals(expected, LongestNiceSubarray.longestNiceSubarrayXor(nums))
    }
}