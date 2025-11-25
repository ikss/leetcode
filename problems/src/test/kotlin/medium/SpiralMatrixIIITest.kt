package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SpiralMatrixIIITest {
    @Test
    fun test1() {
        val rows = 1
        val cols = 4
        val rStart = 0
        val cStart = 0
        val expected = arrayOf(intArrayOf(0, 0), intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(0, 3))

        assertArrayEquals(expected, SpiralMatrixIII.spiralMatrixIII(rows, cols, rStart, cStart))
    }

    @Test
    fun test2() {
        val rows = 5
        val cols = 6
        val rStart = 1
        val cStart = 4
        val expected = arrayOf(
            intArrayOf(1, 4), intArrayOf(1, 5), intArrayOf(2, 5), intArrayOf(2, 4), intArrayOf(2, 3), intArrayOf(1, 3),
            intArrayOf(0, 3), intArrayOf(0, 4), intArrayOf(0, 5), intArrayOf(3, 5), intArrayOf(3, 4), intArrayOf(3, 3),
            intArrayOf(3, 2), intArrayOf(2, 2), intArrayOf(1, 2), intArrayOf(0, 2), intArrayOf(4, 5), intArrayOf(4, 4),
            intArrayOf(4, 3), intArrayOf(4, 2), intArrayOf(4, 1), intArrayOf(3, 1), intArrayOf(2, 1), intArrayOf(1, 1),
            intArrayOf(0, 1), intArrayOf(4, 0), intArrayOf(3, 0), intArrayOf(2, 0), intArrayOf(1, 0), intArrayOf(0, 0),
        )

        assertArrayEquals(expected, SpiralMatrixIII.spiralMatrixIII(rows, cols, rStart, cStart))
    }
}