package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimitTest {
    @Test
    fun test1() {
        val nums = intArrayOf(8, 2, 4, 7)
        val limit = 4
        val expected = 2
        val actual = LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit.longestSubarray(nums, limit)

        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        val nums = intArrayOf(8, 2, 4, 7)
        val limit = 4
        val expected = 2
        val actual = LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit.longestSubarray(nums, limit)

        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        val nums = intArrayOf(4, 2, 2, 2, 4, 4, 2, 2)
        val limit = 0
        val expected = 3
        val actual = LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit.longestSubarray(nums, limit)

        assertEquals(expected, actual)
    }
}