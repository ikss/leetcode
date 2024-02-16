package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveIntervalTest {
    @Test
    fun test1() {
        val intervals = arrayOf(
            intArrayOf(0, 2),
            intArrayOf(3, 4),
            intArrayOf(5, 7),
        )
        val toBeRemoved = intArrayOf(1, 6)
        val expected = listOf(
            listOf(0, 1),
            listOf(6, 7),
        )

        assertEquals(expected, RemoveInterval.removeInterval(intervals, toBeRemoved))
    }

    @Test
    fun test2() {
        val intervals = arrayOf(
            intArrayOf(0, 5),
        )
        val toBeRemoved = intArrayOf(2, 3)
        val expected = listOf(
            listOf(0, 2),
            listOf(3, 5),
        )

        assertEquals(expected, RemoveInterval.removeInterval(intervals, toBeRemoved))
    }

    @Test
    fun test3() {
        val intervals = arrayOf(
            intArrayOf(-5, -4),
            intArrayOf(-3, -2),
            intArrayOf(1, 2),
            intArrayOf(3, 5),
            intArrayOf(8, 9),
        )
        val toBeRemoved = intArrayOf(-1, 4)
        val expected = listOf(
            listOf(-5, -4),
            listOf(-3, -2),
            listOf(4, 5),
            listOf(8, 9),
        )

        assertEquals(expected, RemoveInterval.removeInterval(intervals, toBeRemoved))
    }
}