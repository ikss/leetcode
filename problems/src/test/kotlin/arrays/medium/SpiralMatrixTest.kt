package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SpiralMatrixTest {

    @Test
    fun test1() {
        val matrix = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9),
        )
        val expected = listOf(1, 2, 3, 6, 9, 8, 7, 4, 5)

        assertEquals(expected, SpiralMatrix.spiralOrder(matrix))
    }

    @Test
    fun test2() {
        val matrix = arrayOf(
            intArrayOf(1, 2, 3, 4),
            intArrayOf(5, 6, 7, 8),
            intArrayOf(9, 10, 11, 12),
        )
        val expected = listOf(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7)

        assertEquals(expected, SpiralMatrix.spiralOrder(matrix))
    }
}