package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TwoBestNonOverlappingEventsTest {
    @Test
    fun test1() {
        val events = arrayOf(intArrayOf(1, 3, 2), intArrayOf(4, 5, 2), intArrayOf(2, 4, 3))
        val expected = 4

        assertEquals(expected, TwoBestNonOverlappingEvents.maxTwoEvents(events))
    }

    @Test
    fun test2() {
        val events = arrayOf(intArrayOf(1, 3, 2), intArrayOf(4, 5, 2), intArrayOf(1, 5, 5))
        val expected = 5

        assertEquals(expected, TwoBestNonOverlappingEvents.maxTwoEvents(events))
    }

    @Test
    fun test3() {
        val events = arrayOf(intArrayOf(1, 5, 3), intArrayOf(1, 5, 1), intArrayOf(6, 6, 5))
        val expected = 8

        assertEquals(expected, TwoBestNonOverlappingEvents.maxTwoEvents(events))
    }
}