package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumCostToConnectSticksTest {
    @Test
    fun test1() {
        val sticks = intArrayOf(2, 4, 3)
        val expected = 14

        assertEquals(expected, MinimumCostToConnectSticks.connectSticks(sticks))
    }

    @Test
    fun test2() {
        val sticks = intArrayOf(1, 8, 3, 5)
        val expected = 30

        assertEquals(expected, MinimumCostToConnectSticks.connectSticks(sticks))
    }

    @Test
    fun test3() {
        val sticks = intArrayOf(5)
        val expected = 0

        assertEquals(expected, MinimumCostToConnectSticks.connectSticks(sticks))
    }
}