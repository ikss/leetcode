package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PerfectSquaresTest {

    @Test
    fun test1() {
        val n = 12
        val expected = 3

        assertEquals(expected, PerfectSquares.numSquares(n))
    }

    @Test
    fun test2() {
        val n = 13
        val expected = 2

        assertEquals(expected, PerfectSquares.numSquares(n))
    }

}