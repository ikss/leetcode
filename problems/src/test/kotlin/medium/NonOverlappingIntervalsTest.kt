package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NonOverlappingIntervalsTest {
    @Test
    fun test1() {
        val intervals = arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4), intArrayOf(1, 3))
        val expected = 1

        assertEquals(expected, NonOverlappingIntervals.eraseOverlapIntervals(intervals))
    }

    @Test
    fun test2() {
        val intervals = arrayOf(intArrayOf(1, 2), intArrayOf(1, 2), intArrayOf(1, 2))
        val expected = 2

        assertEquals(expected, NonOverlappingIntervals.eraseOverlapIntervals(intervals))
    }

    @Test
    fun test3() {
        val intervals = arrayOf(intArrayOf(1, 2), intArrayOf(2, 3))
        val expected = 0

        assertEquals(expected, NonOverlappingIntervals.eraseOverlapIntervals(intervals))
    }

    @Test
    fun test4() {
        val intervals = arrayOf(intArrayOf(1, 100), intArrayOf(11, 22), intArrayOf(1, 11), intArrayOf(2, 12))
        val expected = 2

        assertEquals(expected, NonOverlappingIntervals.eraseOverlapIntervals(intervals))
    }
}