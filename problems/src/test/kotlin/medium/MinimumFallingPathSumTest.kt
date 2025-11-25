package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumFallingPathSumTest {
    @Test
    fun test1() {
        val matrix = arrayOf(
            intArrayOf(2, 1, 3),
            intArrayOf(6, 5, 4),
            intArrayOf(7, 8, 9),
        )
        val expected = 13

        assertEquals(expected, MinimumFallingPathSum.minFallingPathSum(matrix))
    }

    @Test
    fun test2() {
        val matrix = arrayOf(
            intArrayOf(-19, 57),
            intArrayOf(-40, -5),
        )
        val expected = -59

        assertEquals(expected, MinimumFallingPathSum.minFallingPathSum(matrix))
    }
}