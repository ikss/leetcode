package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SeparateSquaresITest {
    @Test
    fun test1() {
        val squares = arrayOf(intArrayOf(0, 0, 1), intArrayOf(2, 2, 1))
        val expected = 1.00000

        assertEquals(expected, SeparateSquaresI.separateSquares(squares), 0.00001)
    }

    @Test
    fun test2() {
        val squares = arrayOf(intArrayOf(0, 0, 2), intArrayOf(1, 1, 1))
        val expected = 1.16667

        assertEquals(expected, SeparateSquaresI.separateSquares(squares), 0.00001)
    }

    @Test
    fun test3() {
        val squares = arrayOf(intArrayOf(7, 16, 4), intArrayOf(3, 13, 4))
        val expected = 16.50000

        assertEquals(expected, SeparateSquaresI.separateSquares(squares), 0.00001)
    }
}