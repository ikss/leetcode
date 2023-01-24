package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SnakesAndLaddersTest {
    @Test
    fun test1() {
        val board = arrayOf(
            intArrayOf(-1, -1, -1, -1, -1, -1),
            intArrayOf(-1, -1, -1, -1, -1, -1),
            intArrayOf(-1, -1, -1, -1, -1, -1),
            intArrayOf(-1, 35, -1, -1, 13, -1),
            intArrayOf(-1, -1, -1, -1, -1, -1),
            intArrayOf(-1, 15, -1, -1, -1, -1)
        )
        val expected = 4

        assertEquals(expected, SnakesAndLadders.snakesAndLadders(board))
    }

    @Test
    fun test2() {
        val board = arrayOf(
            intArrayOf(-1, -1),
            intArrayOf(-1, 3),
        )
        val expected = 1

        assertEquals(expected, SnakesAndLadders.snakesAndLadders(board))
    }

    @Test
    fun test3() {
        val board = arrayOf(
            intArrayOf(-1, -1, -1),
            intArrayOf(-1, 9, 8),
            intArrayOf(-1, 8, 9),
        )
        val expected = 1

        assertEquals(expected, SnakesAndLadders.snakesAndLadders(board))
    }
}