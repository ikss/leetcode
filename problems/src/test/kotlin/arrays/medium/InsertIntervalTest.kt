package arrays.medium

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class InsertIntervalTest {
    @Test
    fun test1() {
        val intervals = arrayOf(intArrayOf(1, 3), intArrayOf(6, 9))
        val newInterval = intArrayOf(2, 5)
        val expected = arrayOf(intArrayOf(1, 5), intArrayOf(6, 9))

        assertTrue(expected.contentDeepEquals(InsertInterval.insertInterval(intervals, newInterval)))
    }

    @Test
    fun test2() {
        val intervals =
            arrayOf(intArrayOf(1, 2), intArrayOf(3, 5), intArrayOf(6, 7), intArrayOf(8, 10), intArrayOf(12, 16))
        val newInterval = intArrayOf(4, 8)
        val expected = arrayOf(intArrayOf(1, 2), intArrayOf(3, 10), intArrayOf(12, 16))

        assertTrue(expected.contentDeepEquals(InsertInterval.insertInterval(intervals, newInterval)))
    }
}