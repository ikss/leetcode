package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumPathSumTest {

    @Test
    fun test1() {
        val grid = arrayOf(
            intArrayOf(1, 3, 1),
            intArrayOf(1, 5, 1),
            intArrayOf(4, 2, 1),
        )
        val expected = 7

        assertEquals(expected, MinimumPathSum.minPathSum(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
        )
        val expected = 12

        assertEquals(expected, MinimumPathSum.minPathSum(grid))
    }
}
