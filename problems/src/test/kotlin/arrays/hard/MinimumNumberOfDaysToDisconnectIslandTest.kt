package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumNumberOfDaysToDisconnectIslandTest {
    @Test
    fun test1() {
        val grid = arrayOf(
            intArrayOf(0, 1, 1, 0),
            intArrayOf(0, 1, 1, 0),
            intArrayOf(0, 0, 0, 0),
        )
        val expected = 2

        assertEquals(expected, MinimumNumberOfDaysToDisconnectIsland.minDays(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(
            intArrayOf(1, 1),
        )
        val expected = 2

        assertEquals(expected, MinimumNumberOfDaysToDisconnectIsland.minDays(grid))
    }
}