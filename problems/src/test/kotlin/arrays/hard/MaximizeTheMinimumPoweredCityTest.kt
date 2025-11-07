package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximizeTheMinimumPoweredCityTest {
    @Test
    fun test1() {
        val stations = intArrayOf(1, 2, 4, 5, 0)
        val r = 1
        val k = 2
        val expected = 5L

        assertEquals(expected, MaximizeTheMinimumPoweredCity.maxPower(stations, r, k))
    }

    @Test
    fun test2() {
        val stations = intArrayOf(4, 4, 4, 4)
        val r = 0
        val k = 3
        val expected = 4L

        assertEquals(expected, MaximizeTheMinimumPoweredCity.maxPower(stations, r, k))
    }
}