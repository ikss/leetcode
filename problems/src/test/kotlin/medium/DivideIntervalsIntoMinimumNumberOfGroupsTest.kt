package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DivideIntervalsIntoMinimumNumberOfGroupsTest {
    @Test
    fun test1() {
        val intervals = arrayOf(
            intArrayOf(5, 10),
            intArrayOf(6, 8),
            intArrayOf(1, 5),
            intArrayOf(2, 3),
            intArrayOf(1, 10),
        )
        val expected = 3

        assertEquals(expected, DivideIntervalsIntoMinimumNumberOfGroups.minGroups(intervals))
    }
    
    @Test
    fun test2() {
        val intervals = arrayOf(
            intArrayOf(1, 3),
            intArrayOf(5, 6),
            intArrayOf(8, 10),
            intArrayOf(11, 13),
        )
        val expected = 1

        assertEquals(expected, DivideIntervalsIntoMinimumNumberOfGroups.minGroups(intervals))
    }

    @Test
    fun test3() {
        val intervals = arrayOf(
            intArrayOf(441459, 446342),
            intArrayOf(801308, 840640),
            intArrayOf(871890, 963447),
            intArrayOf(228525, 336985),
            intArrayOf(807945, 946787),
            intArrayOf(479815, 507766),
            intArrayOf(693292, 944029),
            intArrayOf(751962, 821744),
        )
        val expected = 4

        assertEquals(expected, DivideIntervalsIntoMinimumNumberOfGroups.minGroups(intervals))
    }

}