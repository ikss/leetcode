package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class EqualRowAndColumnPairsTest {
    @Test
    fun test1() {
        val grid = arrayOf(
            intArrayOf(3, 2, 1),
            intArrayOf(1, 7, 6),
            intArrayOf(2, 7, 7),
        )
        val expected = 1

        assertEquals(expected, EqualRowAndColumnPairs.equalPairs(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(
            intArrayOf(3, 1, 2, 2),
            intArrayOf(1, 4, 4, 5),
            intArrayOf(2, 4, 2, 2),
            intArrayOf(2, 4, 2, 2),
        )
        val expected = 3

        assertEquals(expected, EqualRowAndColumnPairs.equalPairs(grid))
    }
}