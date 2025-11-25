package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumTimeToRepairCarsTest {
    @Test
    fun test1() {
        val ranks = intArrayOf(4, 2, 3, 1)
        val cars = 10
        val expected = 16L

        assertEquals(expected, MinimumTimeToRepairCars.repairCars(ranks, cars))
    }

    @Test
    fun test2() {
        val ranks = intArrayOf(5, 1, 8)
        val cars = 6
        val expected = 16L

        assertEquals(expected, MinimumTimeToRepairCars.repairCars(ranks, cars))
    }
}