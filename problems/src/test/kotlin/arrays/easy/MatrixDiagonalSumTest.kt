package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MatrixDiagonalSumTest {
    @Test
    fun test1() {
        val mat = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9),
        )
        val expected = 25

        assertEquals(expected, MatrixDiagonalSum.diagonalSum(mat))
    }

    @Test
    fun test2() {
        val mat = arrayOf(
            intArrayOf(1, 1, 1, 1),
            intArrayOf(1, 1, 1, 1),
            intArrayOf(1, 1, 1, 1),
            intArrayOf(1, 1, 1, 1),
        )
        val expected = 8

        assertEquals(expected, MatrixDiagonalSum.diagonalSum(mat))
    }

    @Test
    fun test1BoyerMoore() {
        val mat = arrayOf(intArrayOf(5))
        val expected = 5

        assertEquals(expected, MatrixDiagonalSum.diagonalSum(mat))
    }
}