package easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class TransposeMatrixTest {
    @Test
    fun test1() {
        val matrix = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9),
        )
        val expected = arrayOf(
            intArrayOf(1, 4, 7),
            intArrayOf(2, 5, 8),
            intArrayOf(3, 6, 9),
        )

        assertArrayEquals(expected, TransposeMatrix.transpose(matrix))
    }

    @Test
    fun test2() {
        val matrix = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
        )
        val expected = arrayOf(
            intArrayOf(1, 4),
            intArrayOf(2, 5),
            intArrayOf(3, 6),
        )

        assertArrayEquals(expected, TransposeMatrix.transpose(matrix))
    }
}