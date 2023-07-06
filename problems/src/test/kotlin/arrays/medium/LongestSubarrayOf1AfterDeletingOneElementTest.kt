package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestSubarrayOf1AfterDeletingOneElementTest {

    @Test
    fun test1() {
        val arr = intArrayOf(1, 1, 0, 1)
        val expected = 3

        assertEquals(expected, LongestSubarrayOf1AfterDeletingOneElement.longestSubarray(arr))
    }

    @Test
    fun test2() {
        val arr = intArrayOf(0, 1, 1, 1, 0, 1, 1, 0, 1)
        val expected = 5

        assertEquals(expected, LongestSubarrayOf1AfterDeletingOneElement.longestSubarray(arr))
    }

    @Test
    fun test3() {
        val arr = intArrayOf(1, 1, 1)
        val expected = 2

        assertEquals(expected, LongestSubarrayOf1AfterDeletingOneElement.longestSubarray(arr))
    }
}