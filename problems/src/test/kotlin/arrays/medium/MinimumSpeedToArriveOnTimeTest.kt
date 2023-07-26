package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumSpeedToArriveOnTimeTest {
    @Test
    fun test1() {
        val hour = 6.0
        val dist = intArrayOf(1, 3, 2)
        val expected = 1

        assertEquals(expected, MinimumSpeedToArriveOnTime.minSpeedOnTime(dist, hour))
    }

    @Test
    fun test2() {
        val hour = 2.7
        val dist = intArrayOf(1, 3, 2)
        val expected = 3

        assertEquals(expected, MinimumSpeedToArriveOnTime.minSpeedOnTime(dist, hour))
    }

    @Test
    fun test3() {
        val hour = 1.9
        val dist = intArrayOf(1, 3, 2)
        val expected = -1

        assertEquals(expected, MinimumSpeedToArriveOnTime.minSpeedOnTime(dist, hour))
    }
}