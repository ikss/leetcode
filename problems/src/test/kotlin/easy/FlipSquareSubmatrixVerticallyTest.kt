package easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class FlipSquareSubmatrixVerticallyTest {
    @Test
    fun test1() {
        val grid = arrayOf(
            intArrayOf(1, 2, 3, 4),
            intArrayOf(5, 6, 7, 8),
            intArrayOf(9, 10, 11, 12),
            intArrayOf(13, 14, 15, 16),
        )
        val x = 1
        val y = 0
        val k = 3
        val expected = arrayOf(
            intArrayOf(1, 2, 3, 4),
            intArrayOf(13, 14, 15, 8),
            intArrayOf(9, 10, 11, 12),
            intArrayOf(5, 6, 7, 16),
        )

        assertArrayEquals(expected, FlipSquareSubmatrixVertically.reverseSubmatrix(grid, x, y, k))
    }

    @Test
    fun test2() {
        val grid = arrayOf(
            intArrayOf(3, 4, 2, 3),
            intArrayOf(2, 3, 4, 2),
        )
        val x = 0
        val y = 2
        val k = 2
        val expected = arrayOf(
            intArrayOf(3, 4, 4, 2),
            intArrayOf(2, 3, 2, 3),
        )

        assertArrayEquals(expected, FlipSquareSubmatrixVertically.reverseSubmatrix(grid, x, y, k))
    }
}