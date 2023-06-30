package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LastDayWhereYouCanStillCrossTest {

    @Test
    fun test1() {
        val row = 2
        val col = 2
        val cells = arrayOf(intArrayOf(1, 1), intArrayOf(2, 1), intArrayOf(1, 2), intArrayOf(2, 2))
        val expected = 2

        assertEquals(expected, LastDayWhereYouCanStillCross.latestDayToCross(row, col, cells))
    }

    @Test
    fun test2() {
        val row = 2
        val col = 2
        val cells = arrayOf(intArrayOf(1, 1), intArrayOf(1, 2), intArrayOf(2, 1), intArrayOf(2, 2))
        val expected = 1

        assertEquals(expected, LastDayWhereYouCanStillCross.latestDayToCross(row, col, cells))
    }

    @Test
    fun test3() {
        val row = 3
        val col = 3
        val cells = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(2, 1),
            intArrayOf(3, 3),
            intArrayOf(2, 2),
            intArrayOf(1, 1),
            intArrayOf(1, 3),
            intArrayOf(2, 3),
            intArrayOf(3, 2),
            intArrayOf(3, 1),
        )
        val expected = 3

        assertEquals(expected, LastDayWhereYouCanStillCross.latestDayToCross(row, col, cells))
    }
}