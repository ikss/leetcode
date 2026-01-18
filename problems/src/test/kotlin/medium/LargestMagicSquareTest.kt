package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LargestMagicSquareTest {
    @Test
    fun test1() {
        val grid = arrayOf(
            intArrayOf(7, 1, 4, 5, 6),
            intArrayOf(2, 5, 1, 6, 4),
            intArrayOf(1, 5, 4, 3, 2),
            intArrayOf(1, 2, 7, 3, 4),
        )
        val expected = 3

        assertEquals(expected, LargestMagicSquare.largestMagicSquare(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(
            intArrayOf(5, 1, 3, 1),
            intArrayOf(9, 3, 3, 1),
            intArrayOf(1, 3, 3, 8),
        )
        val expected = 2

        assertEquals(expected, LargestMagicSquare.largestMagicSquare(grid))
    }
}