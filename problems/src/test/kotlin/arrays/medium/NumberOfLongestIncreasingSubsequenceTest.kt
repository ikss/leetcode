package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfLongestIncreasingSubsequenceTest {
    @Test
    fun test1() {
        val input = intArrayOf(1, 3, 5, 4, 7)
        val expected = 2
        val actual = NumberOfLongestIncreasingSubsequence.findNumberOfLIS(input)
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        val input = intArrayOf(2, 2, 2, 2, 2)
        val expected = 5
        val actual = NumberOfLongestIncreasingSubsequence.findNumberOfLIS(input)
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        val input = intArrayOf(1, 2, 4, 3, 5, 4, 7, 2)
        val expected = 3
        val actual = NumberOfLongestIncreasingSubsequence.findNumberOfLIS(input)
        assertEquals(expected, actual)
    }
}