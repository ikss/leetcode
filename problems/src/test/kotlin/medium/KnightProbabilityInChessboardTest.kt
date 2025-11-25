package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class KnightProbabilityInChessboardTest {
    @Test
    fun test1() {
        val n = 3
        val k = 2
        val row = 0
        val column = 0
        val expected = 0.0625

        assertEquals(expected, KnightProbabilityInChessboard.knightProbability(n, k, row, column), 0.00001)
    }

    @Test
    fun test2() {
        val n = 1
        val k = 0
        val row = 0
        val column = 0
        val expected = 1.0

        assertEquals(expected, KnightProbabilityInChessboard.knightProbability(n, k, row, column), 0.00001)
    }
}