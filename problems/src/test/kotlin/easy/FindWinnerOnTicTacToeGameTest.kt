package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindWinnerOnTicTacToeGameTest {
    @Test
    fun test1() {
        val moves = arrayOf(
            intArrayOf(0, 0),
            intArrayOf(2, 0),
            intArrayOf(1, 1),
            intArrayOf(2, 1),
            intArrayOf(2, 2),
        )
        val expected = "A"

        assertEquals(expected, FindWinnerOnTicTacToeGame.tictactoe(moves))
    }

    @Test
    fun test2() {
        val moves = arrayOf(
            intArrayOf(0, 0),
            intArrayOf(1, 1),
            intArrayOf(0, 1),
            intArrayOf(0, 2),
            intArrayOf(1, 0),
            intArrayOf(2, 0),
        )
        val expected = "B"

        assertEquals(expected, FindWinnerOnTicTacToeGame.tictactoe(moves))
    }

    @Test
    fun test3() {
        val moves = arrayOf(
            intArrayOf(0, 0),
            intArrayOf(1, 1),
            intArrayOf(2, 0),
            intArrayOf(1, 0),
            intArrayOf(1, 2),
            intArrayOf(2, 1),
            intArrayOf(0, 1),
            intArrayOf(0, 2),
            intArrayOf(2, 2),
        )
        val expected = "Draw"

        assertEquals(expected, FindWinnerOnTicTacToeGame.tictactoe(moves))
    }
}