package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumNumberOfFishInGridTest {

    @Test
    fun test1() {
        val grid = arrayOf(
            intArrayOf(0, 2, 1, 0),
            intArrayOf(4, 0, 0, 3),
            intArrayOf(1, 0, 0, 4),
            intArrayOf(0, 3, 2, 0),
        )
        val expected = 7

        assertEquals(expected, MaximumNumberOfFishInGrid.findMaxFish(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(
            intArrayOf(1, 0, 0, 0),
            intArrayOf(0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0),
            intArrayOf(0, 0, 0, 1),
        )
        val expected = 1

        assertEquals(expected, MaximumNumberOfFishInGrid.findMaxFish(grid))
    }
}