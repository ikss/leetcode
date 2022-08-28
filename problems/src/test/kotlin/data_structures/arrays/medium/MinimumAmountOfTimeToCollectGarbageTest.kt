package data_structures.arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumAmountOfTimeToCollectGarbageTest {
    @Test
    fun test1() {
        val garbage = arrayOf("G", "P", "GP", "GG")
        val travel = intArrayOf(2, 4, 3)
        val expected = 21

        assertEquals(expected, MinimumAmountOfTimeToCollectGarbage.garbageCollection(garbage, travel))
    }

    @Test
    fun test2() {
        val garbage = arrayOf("MMM", "PGM", "GP")
        val travel = intArrayOf(3, 10)
        val expected = 37

        assertEquals(expected, MinimumAmountOfTimeToCollectGarbage.garbageCollection(garbage, travel))
    }
}
