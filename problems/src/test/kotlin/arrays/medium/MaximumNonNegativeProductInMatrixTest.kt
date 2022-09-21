package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumNonNegativeProductInMatrixTest {
    @Test
    fun test1dfs() {
        val grid = arrayOf(
                intArrayOf(-1, -2, -3),
                intArrayOf(-2, -3, -3),
                intArrayOf(-3, -3, -2),
        )
        val expected = -1

        assertEquals(expected, MaximumNonNegativeProductInMatrix.maxProductPathDfs(grid))
    }

    @Test
    fun test2dfs() {
        val grid = arrayOf(
                intArrayOf(1, -2, 1),
                intArrayOf(1, -2, 1),
                intArrayOf(3, -4, 1),
        )
        val expected = 8

        assertEquals(expected, MaximumNonNegativeProductInMatrix.maxProductPathDfs(grid))
    }

    @Test
    fun test3dfs() {
        val grid = arrayOf(
                intArrayOf(1, 3),
                intArrayOf(0, -4),
        )
        val expected = 0

        assertEquals(expected, MaximumNonNegativeProductInMatrix.maxProductPathDfs(grid))
    }

    @Test
    fun test1dp() {
        val grid = arrayOf(
                intArrayOf(-1, -2, -3),
                intArrayOf(-2, -3, -3),
                intArrayOf(-3, -3, -2),
        )
        val expected = -1

        assertEquals(expected, MaximumNonNegativeProductInMatrix.maxProductPathDp(grid))
    }

    @Test
    fun test2dp() {
        val grid = arrayOf(
                intArrayOf(1, -2, 1),
                intArrayOf(1, -2, 1),
                intArrayOf(3, -4, 1),
        )
        val expected = 8

        assertEquals(expected, MaximumNonNegativeProductInMatrix.maxProductPathDp(grid))
    }

    @Test
    fun test3dp() {
        val grid = arrayOf(
                intArrayOf(1, 3),
                intArrayOf(0, -4),
        )
        val expected = 0

        assertEquals(expected, MaximumNonNegativeProductInMatrix.maxProductPathDp(grid))
    }
}
