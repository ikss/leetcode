package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumCostToMakeAtLeastOneValidPathInGridTest {
    @Test
    fun test1() {
        val grid = arrayOf(
            intArrayOf(1, 1, 1, 1),
            intArrayOf(2, 2, 2, 2),
            intArrayOf(1, 1, 1, 1),
            intArrayOf(2, 2, 2, 2),
        )
        val expected = 3

        assertEquals(expected, MinimumCostToMakeAtLeastOneValidPathInGrid.minCost(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(
            intArrayOf(1, 1, 3),
            intArrayOf(3, 2, 2),
            intArrayOf(1, 1, 4),
        )
        val expected = 0

        assertEquals(expected, MinimumCostToMakeAtLeastOneValidPathInGrid.minCost(grid))
    }
}