package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumSwapsToArrangeBinaryGridTest {
    @Test
    fun test1() {
        val grid = arrayOf(
            intArrayOf(0, 0, 1),
            intArrayOf(1, 1, 0),
            intArrayOf(1, 0, 0),
        )
        val expected = 3

        assertEquals(expected, MinimumSwapsToArrangeBinaryGrid.minSwaps(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(
            intArrayOf(0, 1, 1, 0),
            intArrayOf(0, 1, 1, 0),
            intArrayOf(0, 1, 1, 0),
            intArrayOf(0, 1, 1, 0),
        )
        val expected = -1

        assertEquals(expected, MinimumSwapsToArrangeBinaryGrid.minSwaps(grid))
    }

    @Test
    fun test3() {
        val grid = arrayOf(
            intArrayOf(1, 0, 0),
            intArrayOf(1, 1, 0),
            intArrayOf(1, 1, 1),
        )
        val expected = 0

        assertEquals(expected, MinimumSwapsToArrangeBinaryGrid.minSwaps(grid))
    }
}