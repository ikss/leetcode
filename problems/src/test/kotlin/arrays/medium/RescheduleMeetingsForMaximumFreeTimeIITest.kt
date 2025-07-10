package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RescheduleMeetingsForMaximumFreeTimeIITest {
    @Test
    fun test1() {
        val eventTime = 5
        val startTime = intArrayOf(1, 3)
        val endTime = intArrayOf(2, 5)
        val expected = 2

        assertEquals(expected, RescheduleMeetingsForMaximumFreeTimeII.maxFreeTime(eventTime, startTime, endTime))
    }

    @Test
    fun test2() {
        val eventTime = 10
        val startTime = intArrayOf(0, 7, 9)
        val endTime = intArrayOf(1, 8, 10)
        val expected = 7

        assertEquals(expected, RescheduleMeetingsForMaximumFreeTimeII.maxFreeTime(eventTime, startTime, endTime))
    }

    @Test
    fun test3() {
        val eventTime = 10
        val startTime = intArrayOf(0, 3, 7, 9)
        val endTime = intArrayOf(1, 4, 8, 10)
        val expected = 6

        assertEquals(expected, RescheduleMeetingsForMaximumFreeTimeII.maxFreeTime(eventTime, startTime, endTime))
    }

    @Test
    fun test4() {
        val eventTime = 5
        val startTime = intArrayOf(0, 1, 2, 3, 4)
        val endTime = intArrayOf(1, 2, 3, 4, 5)
        val expected = 0

        assertEquals(expected, RescheduleMeetingsForMaximumFreeTimeII.maxFreeTime(eventTime, startTime, endTime))
    }

    @Test
    fun test5() {
        val eventTime = 21
        val startTime = intArrayOf(7, 10, 16)
        val endTime = intArrayOf(10, 14, 18)
        val expected = 10

        assertEquals(expected, RescheduleMeetingsForMaximumFreeTimeII.maxFreeTime(eventTime, startTime, endTime))
    }

    @Test
    fun test6() {
        val eventTime = 18
        val startTime = intArrayOf(0, 2, 4, 5, 17)
        val endTime = intArrayOf(1, 4, 5, 6, 18)
        val expected = 12

        assertEquals(expected, RescheduleMeetingsForMaximumFreeTimeII.maxFreeTime(eventTime, startTime, endTime))
    }
}