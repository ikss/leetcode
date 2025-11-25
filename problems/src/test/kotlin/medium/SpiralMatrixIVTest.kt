package medium

import data_structures.ListBuilder
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SpiralMatrixIVTest {
    @Test
    fun test1() {
        val m = 3
        val n = 5
        val head = ListBuilder.build(3, 0, 2, 6, 8, 1, 7, 9, 4, 2, 5, 5, 0)
        val expected = arrayOf(
            intArrayOf(3, 0, 2, 6, 8),
            intArrayOf(5, 0, -1, -1, 1),
            intArrayOf(5, 2, 4, 9, 7)
        )

        assertArrayEquals(expected, SpiralMatrixIV.spiralMatrix(m, n, head))
    }

    @Test
    fun test2() {
        val m = 1
        val n = 4
        val head = ListBuilder.build(0, 1, 2)
        val expected = arrayOf(
            intArrayOf(0, 1, 2, -1)
        )

        assertArrayEquals(expected, SpiralMatrixIV.spiralMatrix(m, n, head))
    }

}