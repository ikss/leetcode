package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumNumberOfKConsecutiveBitFlipsTest {
    @Test
    fun test1() {
        val nums = intArrayOf(0, 1, 0)
        val k = 1
        val expected = 2

        assertEquals(expected, MinimumNumberOfKConsecutiveBitFlips.minKBitFlips(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 1, 0)
        val k = 2
        val expected = -1

        assertEquals(expected, MinimumNumberOfKConsecutiveBitFlips.minKBitFlips(nums, k))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(0, 0, 0, 1, 0, 1, 1, 0)
        val k = 3
        val expected = 3

        assertEquals(expected, MinimumNumberOfKConsecutiveBitFlips.minKBitFlips(nums, k))
    }
}