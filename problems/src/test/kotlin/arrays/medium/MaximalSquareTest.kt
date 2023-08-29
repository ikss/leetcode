package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximalSquareTest {
    @Test
    fun test1dp() {
        val matrix = arrayOf(
            charArrayOf('1', '0', '1', '0', '0'),
            charArrayOf('1', '0', '1', '1', '1'),
            charArrayOf('1', '1', '1', '1', '1'),
            charArrayOf('1', '0', '0', '1', '0'),
        )
        val expected = 4

        assertEquals(expected, MaximalSquare.maximalSquareDp(matrix))
    }

    @Test
    fun test2dp() {
        val matrix = arrayOf(
            charArrayOf('0', '1'),
            charArrayOf('1', '0'),
        )
        val expected = 1

        assertEquals(expected, MaximalSquare.maximalSquareDp(matrix))
    }

    @Test
    fun test3dp() {
        val matrix = arrayOf(
            charArrayOf('0'),
        )
        val expected = 0

        assertEquals(expected, MaximalSquare.maximalSquareDp(matrix))
    }

    @Test
    fun test1optimizedDp() {
        val matrix = arrayOf(
            charArrayOf('1', '0', '1', '0', '0'),
            charArrayOf('1', '0', '1', '1', '1'),
            charArrayOf('1', '1', '1', '1', '1'),
            charArrayOf('1', '0', '0', '1', '0'),
        )
        val expected = 4

        assertEquals(expected, MaximalSquare.maximalSquareOptimizedDp(matrix))
    }

    @Test
    fun test2optimizedDp() {
        val matrix = arrayOf(
            charArrayOf('0', '1'),
            charArrayOf('1', '0'),
        )
        val expected = 1

        assertEquals(expected, MaximalSquare.maximalSquareOptimizedDp(matrix))
    }

    @Test
    fun test3optimizedDp() {
        val matrix = arrayOf(
            charArrayOf('0'),
        )
        val expected = 0

        assertEquals(expected, MaximalSquare.maximalSquareOptimizedDp(matrix))
    }
}