package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AverageWaitingTimeTest {
    @Test
    fun test1() {
        val customers = arrayOf(intArrayOf(1, 2), intArrayOf(2, 5), intArrayOf(4, 3))
        val expected = 5.0

        assertEquals(expected, AverageWaitingTime.averageWaitingTime(customers), 0.0001)
    }

    @Test
    fun test2() {
        val customers = arrayOf(intArrayOf(5, 2), intArrayOf(5, 4), intArrayOf(10, 3), intArrayOf(20, 1))
        val expected = 3.25

        assertEquals(expected, AverageWaitingTime.averageWaitingTime(customers), 0.0001)
    }
}