package arrays.medium

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class WhereWillTheBallFallTest {
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

        assertTrue(expected.contentEquals(WhereWillTheBallFall.findBall(board)))
    }

    @Test
    fun test2() {
        val board = arrayOf(
            intArrayOf(-1),
        )
        val expected = intArrayOf(-1)

        assertTrue(expected.contentEquals(WhereWillTheBallFall.findBall(board)))
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

        assertTrue(expected.contentEquals(WhereWillTheBallFall.findBall(board)))
    }
}