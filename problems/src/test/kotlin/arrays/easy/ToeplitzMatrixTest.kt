package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ToeplitzMatrixTest {
    @Test
    fun test1() {
        val matrix = arrayOf(
            intArrayOf(1, 2, 3, 4),
            intArrayOf(5, 1, 2, 3),
            intArrayOf(9, 5, 1, 2),
        )
        val expected = true

        assertEquals(expected, ToeplitzMatrix.isToeplitzMatrix(matrix))
    }

    @Test
    fun test2() {
        val matrix = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(2, 2),
        )
        val expected = false
        assertEquals(expected, ToeplitzMatrix.isToeplitzMatrix(matrix))
    }

    @Test
    fun test3() {
        val matrix = arrayOf(
            intArrayOf(1),
        )
        val expected = true
        assertEquals(expected, ToeplitzMatrix.isToeplitzMatrix(matrix))
    }
}