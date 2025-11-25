package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumSizeSubarraySumTest {

    @Test
    fun test1() {
        val target = 7
        val nums = intArrayOf(2, 3, 1, 2, 4, 3)
        val expected = 2

        assertEquals(expected, MinimumSizeSubarraySum.minSubArrayLen(target, nums))
    }

    @Test
    fun test2() {
        val target = 4
        val nums = intArrayOf(1, 4, 4)
        val expected = 1

        assertEquals(expected, MinimumSizeSubarraySum.minSubArrayLen(target, nums))
    }

    @Test
    fun test3() {
        val target = 11
        val nums = intArrayOf(1, 1, 1, 1, 1, 1, 1, 1)
        val expected = 0

        assertEquals(expected, MinimumSizeSubarraySum.minSubArrayLen(target, nums))
    }
}