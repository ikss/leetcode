package arrays.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class WhereWillTheBallFallTest {
    @Test
    fun test1() {
        val board = arrayOf(
            intArrayOf(1, 1, 1, -1, -1),
            intArrayOf(1, 1, 1, -1, -1),
            intArrayOf(-1, -1, -1, 1, 1),
            intArrayOf(1, 1, 1, 1, -1),
            intArrayOf(-1, -1, -1, -1, -1),
        )
        val expected = intArrayOf(1, -1, -1, -1, -1)

        assertArrayEquals(expected, WhereWillTheBallFall.findBall(board))
    }

    @Test
    fun test2() {
        val board = arrayOf(
            intArrayOf(-1),
        )
        val expected = intArrayOf(-1)

        assertArrayEquals(expected, WhereWillTheBallFall.findBall(board))
    }

    @Test
    fun test3() {
        val board = arrayOf(
            intArrayOf(1, 1, 1, 1, 1, 1),
            intArrayOf(-1, -1, -1, -1, -1, -1),
            intArrayOf(1, 1, 1, 1, 1, 1),
            intArrayOf(-1, -1, -1, -1, -1, -1),
        )
        val expected = intArrayOf(0, 1, 2, 3, 4, -1)

        assertArrayEquals(expected, WhereWillTheBallFall.findBall(board))
    }
}