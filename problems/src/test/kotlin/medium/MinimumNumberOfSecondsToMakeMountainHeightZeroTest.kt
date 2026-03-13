package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumNumberOfSecondsToMakeMountainHeightZeroTest {
    @Test
    fun test1() {
        val mountainHeight = 4
        val workerTimes = intArrayOf(2, 1, 1)
        val expected = 3L

        assertEquals(expected, MinimumNumberOfSecondsToMakeMountainHeightZero.minNumberOfSeconds(mountainHeight, workerTimes))
    }

    @Test
    fun test2() {
        val mountainHeight = 10
        val workerTimes = intArrayOf(3, 2, 2, 4)
        val expected = 12L

        assertEquals(expected, MinimumNumberOfSecondsToMakeMountainHeightZero.minNumberOfSeconds(mountainHeight, workerTimes))
    }

    @Test
    fun test3() {
        val mountainHeight = 5
        val workerTimes = intArrayOf(1)
        val expected = 15L

        assertEquals(expected, MinimumNumberOfSecondsToMakeMountainHeightZero.minNumberOfSeconds(mountainHeight, workerTimes))
    }
}