package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumTimeToCompleteTripsTest {

    @Test
    fun test1() {
        val time = intArrayOf(1, 2, 3)
        val totalTrips = 5
        val expected = 3L

        assertEquals(expected, MinimumTimeToCompleteTrips.minimumTime(time, totalTrips))
    }

    @Test
    fun test2() {
        val time = intArrayOf(2)
        val totalTrips = 1
        val expected = 2L

        assertEquals(expected, MinimumTimeToCompleteTrips.minimumTime(time, totalTrips))
    }
}