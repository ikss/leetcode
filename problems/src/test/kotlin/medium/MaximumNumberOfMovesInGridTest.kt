package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumNumberOfMovesInGridTest {
    @Test
    fun test1() {
        val grid = arrayOf(
            intArrayOf(2, 4, 3, 5),
            intArrayOf(5, 4, 9, 3),
            intArrayOf(3, 4, 2, 11),
            intArrayOf(10, 9, 13, 15),
        )
        val expected = 3

        assertEquals(expected, MaximumNumberOfMovesInGrid.maxMoves(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(
            intArrayOf(3, 2, 4),
            intArrayOf(2, 1, 9),
            intArrayOf(1, 1, 7),
        )
        val expected = 0

        assertEquals(expected, MaximumNumberOfMovesInGrid.maxMoves(grid))
    }
}