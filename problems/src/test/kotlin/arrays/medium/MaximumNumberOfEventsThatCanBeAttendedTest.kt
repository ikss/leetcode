package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumNumberOfEventsThatCanBeAttendedTest {
    @Test
    fun test1() {
        val events = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(2, 3),
            intArrayOf(3, 4),
        )
        assertEquals(3, MaximumNumberOfEventsThatCanBeAttended.maxEvents(events))
    }

    @Test
    fun test2() {
        val events = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(2, 3),
            intArrayOf(3, 4),
            intArrayOf(1, 2),
        )
        assertEquals(4, MaximumNumberOfEventsThatCanBeAttended.maxEvents(events))
    }

    @Test
    fun test3() {
        val events = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(1, 2),
            intArrayOf(1, 2),
            intArrayOf(1, 2),
        )
        assertEquals(2, MaximumNumberOfEventsThatCanBeAttended.maxEvents(events))
    }
}