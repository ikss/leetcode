package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GasStationTest {
    @Test
    fun test1() {
        val gas = intArrayOf(1, 2, 3, 4, 5)
        val cost = intArrayOf(3, 4, 5, 1, 2)
        val expected = 3

        assertEquals(expected, GasStation.canCompleteCircuit(gas, cost))
    }

    @Test
    fun test2() {
        val gas = intArrayOf(2, 3, 4)
        val cost = intArrayOf(3, 4, 3)
        val expected = -1

        assertEquals(expected, GasStation.canCompleteCircuit(gas, cost))
    }
}