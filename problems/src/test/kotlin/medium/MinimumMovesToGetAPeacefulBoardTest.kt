package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumMovesToGetAPeacefulBoardTest {
    @Test
    fun test1() {
        val board = arrayOf(
            intArrayOf(0, 0),
            intArrayOf(1, 0),
            intArrayOf(1, 1),
        )
        val expected = 3

        assertEquals(expected, MinimumMovesToGetAPeacefulBoard.minMoves(board))
    }

    @Test
    fun test2() {
        val board = arrayOf(
            intArrayOf(0, 0),
            intArrayOf(0, 1),
            intArrayOf(0, 2),
            intArrayOf(0, 3),
        )
        val expected = 6

        assertEquals(expected, MinimumMovesToGetAPeacefulBoard.minMoves(board))
    }
}