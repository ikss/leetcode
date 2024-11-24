package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumMatrixSumTest {
    @Test
    fun test1() {
        val matrix = arrayOf(
            intArrayOf(1, -1),
            intArrayOf(-1, 1),
        )
        val expected = 4L

        assertEquals(expected, MaximumMatrixSum.maxMatrixSum(matrix))
    }

    @Test
    fun test2() {
        val matrix = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(-1, -2, -3),
            intArrayOf(1, 2, 3),
        )
        val expected = 16L

        assertEquals(expected, MaximumMatrixSum.maxMatrixSum(matrix))
    }

    @Test
    fun test3() {
        val matrix = arrayOf(
            intArrayOf(-1, 0, -1),
            intArrayOf(-2, 1, 3),
            intArrayOf(3, 2, 2),
        )
        val expected = 15L

        assertEquals(expected, MaximumMatrixSum.maxMatrixSum(matrix))
    }
}