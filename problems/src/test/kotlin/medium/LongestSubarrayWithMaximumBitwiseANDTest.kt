package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestSubarrayWithMaximumBitwiseANDTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3, 3, 2, 2)
        val expected = 2

        assertEquals(expected, LongestSubarrayWithMaximumBitwiseAND.longestSubarray(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 3, 4)
        val expected = 1

        assertEquals(expected, LongestSubarrayWithMaximumBitwiseAND.longestSubarray(nums))
    }
}