package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfSubArraysWithOddSumTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 3, 5)
        val expected = 4

        assertEquals(expected, NumberOfSubArraysWithOddSum.numOfSubarrays(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 4, 6)
        val expected = 0

        assertEquals(expected, NumberOfSubArraysWithOddSum.numOfSubarrays(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        val expected = 16

        assertEquals(expected, NumberOfSubArraysWithOddSum.numOfSubarrays(nums))
    }
}