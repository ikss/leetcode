package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumTimeToVisitCellInGridTest {
    @Test
    fun test1() {
        val grid = arrayOf(
            intArrayOf(0, 1, 3, 2),
            intArrayOf(5, 1, 2, 5),
            intArrayOf(4, 3, 8, 6),
        )
        val expected = 7

        assertEquals(expected, MinimumTimeToVisitCellInGrid.minimumTime(grid))
    }
    
    @Test
    fun test2() {
        val grid = arrayOf(
            intArrayOf(0, 2, 4),
            intArrayOf(3, 2, 1),
            intArrayOf(1, 0, 4),
        )
        val expected = -1

        assertEquals(expected, MinimumTimeToVisitCellInGrid.minimumTime(grid))
    }
}