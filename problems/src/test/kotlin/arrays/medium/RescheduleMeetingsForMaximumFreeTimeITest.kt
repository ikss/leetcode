package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RescheduleMeetingsForMaximumFreeTimeITest {
    @Test
    fun test1() {
        val eventTime = 5
        val k = 1
        val startTime = intArrayOf(1, 3)
        val endTime = intArrayOf(2, 5)
        val expected = 2

        assertEquals(expected, RescheduleMeetingsForMaximumFreeTimeI.maxFreeTime(eventTime, k, startTime, endTime))
    }

    @Test
    fun test2() {
        val eventTime = 10
        val k = 1
        val startTime = intArrayOf(0, 2, 9)
        val endTime = intArrayOf(1, 4, 10)
        val expected = 6

        assertEquals(expected, RescheduleMeetingsForMaximumFreeTimeI.maxFreeTime(eventTime, k, startTime, endTime))
    }
}