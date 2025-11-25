package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class DailyTemperaturesTest {

    @Test
    fun test1twoCycles() {
        val temperatures = intArrayOf(73, 74, 75, 71, 69, 72, 76, 73)
        val expected = intArrayOf(1, 1, 4, 2, 1, 1, 0, 0)

        assertArrayEquals(expected, DailyTemperatures.dailyTemperaturesTwoCycles(temperatures))
    }

    @Test
    fun test2twoCycles() {
        val temperatures = intArrayOf(30, 40, 50, 60)
        val expected = intArrayOf(1, 1, 1, 0)

        assertArrayEquals(expected, DailyTemperatures.dailyTemperaturesTwoCycles(temperatures))
    }

    @Test
    fun test3twoCycles() {
        val temperatures = intArrayOf(30, 60, 90)
        val expected = intArrayOf(1, 1, 0)

        assertArrayEquals(expected, DailyTemperatures.dailyTemperaturesTwoCycles(temperatures))
    }

    @Test
    fun test1monotonicStack() {
        val temperatures = intArrayOf(73, 74, 75, 71, 69, 72, 76, 73)
        val expected = intArrayOf(1, 1, 4, 2, 1, 1, 0, 0)

        assertArrayEquals(expected, DailyTemperatures.dailyTemperaturesMonotonicStack(temperatures))
    }

    @Test
    fun test2monotonicStack() {
        val temperatures = intArrayOf(30, 40, 50, 60)
        val expected = intArrayOf(1, 1, 1, 0)

        assertArrayEquals(expected, DailyTemperatures.dailyTemperaturesMonotonicStack(temperatures))
    }

    @Test
    fun test3monotonicStack() {
        val temperatures = intArrayOf(30, 60, 90)
        val expected = intArrayOf(1, 1, 0)

        assertArrayEquals(expected, DailyTemperatures.dailyTemperaturesMonotonicStack(temperatures))
    }
}
