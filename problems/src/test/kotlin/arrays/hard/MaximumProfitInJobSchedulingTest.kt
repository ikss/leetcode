package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumProfitInJobSchedulingTest {

    @Test
    fun test1() {
        val startTime = intArrayOf(1, 2, 3, 3)
        val endTime = intArrayOf(3, 4, 5, 6)
        val profit = intArrayOf(50, 10, 40, 70)
        val expected = 120

        assertEquals(expected, MaximumProfitInJobScheduling.jobScheduling(startTime, endTime, profit))
    }

    @Test
    fun test2() {
        val startTime = intArrayOf(1, 2, 3, 4, 6)
        val endTime = intArrayOf(3, 5, 10, 6, 9)
        val profit = intArrayOf(20, 20, 100, 70, 60)
        val expected = 150

        assertEquals(expected, MaximumProfitInJobScheduling.jobScheduling(startTime, endTime, profit))
    }

    @Test
    fun test3() {
        val startTime = intArrayOf(1, 1, 1)
        val endTime = intArrayOf(2, 3, 4)
        val profit = intArrayOf(5, 6, 4)
        val expected = 6

        assertEquals(expected, MaximumProfitInJobScheduling.jobScheduling(startTime, endTime, profit))
    }
}