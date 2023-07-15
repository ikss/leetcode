package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumNumberOfEventsThatCanBeAttendedIITest {
    @Test
    fun test1() {
        val events = arrayOf(intArrayOf(1, 2, 4), intArrayOf(3, 4, 3), intArrayOf(2, 3, 1))
        val k = 2
        val expected = 7

        assertEquals(expected, MaximumNumberOfEventsThatCanBeAttendedII.maxValue(events, k))
    }

    @Test
    fun test2() {
        val events = arrayOf(intArrayOf(1, 2, 4), intArrayOf(3, 4, 3), intArrayOf(2, 3, 10))
        val k = 2
        val expected = 10

        assertEquals(expected, MaximumNumberOfEventsThatCanBeAttendedII.maxValue(events, k))
    }

    @Test
    fun test3() {
        val events = arrayOf(intArrayOf(1, 1, 1), intArrayOf(2, 2, 2), intArrayOf(3, 3, 3), intArrayOf(4, 4, 4))
        val k = 3
        val expected = 9

        assertEquals(expected, MaximumNumberOfEventsThatCanBeAttendedII.maxValue(events, k))
    }
}