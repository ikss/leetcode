package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CapacityToShipPackagesWithinDDaysTest {

    @Test
    fun test1() {
        val weights = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val days = 5
        val expected = 15

        assertEquals(expected, CapacityToShipPackagesWithinDDays.shipWithinDays(weights, days))
    }

    @Test
    fun test2() {
        val weights = intArrayOf(3, 2, 2, 4, 1, 4)
        val days = 3
        val expected = 6

        assertEquals(expected, CapacityToShipPackagesWithinDDays.shipWithinDays(weights, days))
    }
}