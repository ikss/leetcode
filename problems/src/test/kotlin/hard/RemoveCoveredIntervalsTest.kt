package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveCoveredIntervalsTest {
    @Test
    fun test1() {
        val intervals = arrayOf(intArrayOf(1, 4), intArrayOf(3, 6), intArrayOf(2, 8))
        val expected = 2

        assertEquals(expected, RemoveCoveredIntervals.removeCoveredIntervals(intervals))
    }

    @Test
    fun test2() {
        val intervals = arrayOf(intArrayOf(1, 4), intArrayOf(2, 3))
        val expected = 1

        assertEquals(expected, RemoveCoveredIntervals.removeCoveredIntervals(intervals))
    }

    @Test
    fun test3() {
        val intervals = arrayOf(intArrayOf(1, 2), intArrayOf(1, 4), intArrayOf(3, 4))
        val expected = 1

        assertEquals(expected, RemoveCoveredIntervals.removeCoveredIntervals(intervals))
    }
}