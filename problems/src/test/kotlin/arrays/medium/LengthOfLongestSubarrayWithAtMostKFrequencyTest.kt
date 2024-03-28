package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LengthOfLongestSubarrayWithAtMostKFrequencyTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3, 1, 2, 3, 1, 2)
        val k = 2
        val expected = 6

        assertEquals(expected, LengthOfLongestSubarrayWithAtMostKFrequency.maxSubarrayLength(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 1, 2, 1, 2, 1, 2)
        val k = 1
        val expected = 2

        assertEquals(expected, LengthOfLongestSubarrayWithAtMostKFrequency.maxSubarrayLength(nums, k))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(5, 5, 5, 5, 5, 5, 5)
        val k = 4
        val expected = 4

        assertEquals(expected, LengthOfLongestSubarrayWithAtMostKFrequency.maxSubarrayLength(nums, k))
    }
}