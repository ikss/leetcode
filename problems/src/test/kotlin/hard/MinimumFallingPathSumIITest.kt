package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumFallingPathSumIITest {
    @Test
    fun test1() {
        val grid = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9),
        )
        val expected = 13

        assertEquals(expected, MinimumFallingPathSumII.minFallingPathSum(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(
            intArrayOf(7),
        )
        val expected = 7

        assertEquals(expected, MinimumFallingPathSumII.minFallingPathSum(grid))
    }

    @Test
    fun test3() {
        val grid = arrayOf(
            intArrayOf(-73, 61, 43, -48, -36),
            intArrayOf(3, 30, 27, 57, 10),
            intArrayOf(96, -76, 84, 59, -15),
            intArrayOf(5, -49, 76, 31, -7),
            intArrayOf(97, 91, 61, -46, 67),
        )
        val expected = -192

        assertEquals(expected, MinimumFallingPathSumII.minFallingPathSum(grid))
    }
}