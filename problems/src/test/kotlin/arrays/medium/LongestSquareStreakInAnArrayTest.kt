package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestSquareStreakInAnArrayTest {
    @Test
    fun test1() {
        val input = intArrayOf(4, 3, 6, 16, 8, 2)
        val expected = 3

        assertEquals(expected, LongestSquareStreakInAnArray.longestSquareStreak(input))
    }

    @Test
    fun test2() {
        val input = intArrayOf(2, 3, 5, 6, 7)
        val expected = -1

        assertEquals(expected, LongestSquareStreakInAnArray.longestSquareStreak(input))
    }
}