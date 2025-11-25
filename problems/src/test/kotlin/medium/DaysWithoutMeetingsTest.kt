package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DaysWithoutMeetingsTest {
    @Test
    fun test1() {
        val days = 10
        val meetings = arrayOf(
            intArrayOf(5, 7),
            intArrayOf(1, 3),
            intArrayOf(9, 10),
        )
        val expected = 2

        assertEquals(expected, DaysWithoutMeetings.countDays(days, meetings))
    }

    @Test
    fun test2() {
        val days = 5
        val meetings = arrayOf(
            intArrayOf(2, 4),
            intArrayOf(1, 3),
        )
        val expected = 1

        assertEquals(expected, DaysWithoutMeetings.countDays(days, meetings))
    }

    @Test
    fun test3() {
        val days = 6
        val meetings = arrayOf(
            intArrayOf(1, 6),
        )
        val expected = 0

        assertEquals(expected, DaysWithoutMeetings.countDays(days, meetings))
    }
}