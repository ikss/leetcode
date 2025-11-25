package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MagicSquaresInGridTest {
    @Test
    fun test1() {
        val grid = arrayOf(
            intArrayOf(4, 3, 8, 4),
            intArrayOf(9, 5, 1, 9),
            intArrayOf(2, 7, 6, 2),
        )
        val expected = 1

        assertEquals(expected, MagicSquaresInGrid.numMagicSquaresInside(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(
            intArrayOf(8),
        )
        val expected = 0

        assertEquals(expected, MagicSquaresInGrid.numMagicSquaresInside(grid))
    }

    @Test
    fun test3() {
        val grid = arrayOf(
            intArrayOf(5, 5, 5),
            intArrayOf(5, 5, 5),
            intArrayOf(5, 5, 5),
        )
        val expected = 0

        assertEquals(expected, MagicSquaresInGrid.numMagicSquaresInside(grid))
    }
}