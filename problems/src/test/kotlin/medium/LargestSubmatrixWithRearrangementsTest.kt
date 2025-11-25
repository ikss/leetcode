package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LargestSubmatrixWithRearrangementsTest {
    @Test
    fun test1() {
        val matrix = arrayOf(
            intArrayOf(0, 0, 1),
            intArrayOf(1, 1, 1),
            intArrayOf(1, 0, 1),
        )
        val expected = 4

        assertEquals(expected, LargestSubmatrixWithRearrangements.largestSubmatrix(matrix))
    }

    @Test
    fun test2() {
        val matrix = arrayOf(
            intArrayOf(1, 0, 1, 0, 1),
        )
        val expected = 3

        assertEquals(expected, LargestSubmatrixWithRearrangements.largestSubmatrix(matrix))
    }

    @Test
    fun test3() {
        val matrix = arrayOf(
            intArrayOf(1, 1, 0),
            intArrayOf(1, 0, 1),
        )
        val expected = 2

        assertEquals(expected, LargestSubmatrixWithRearrangements.largestSubmatrix(matrix))
    }
}