package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ConnectingCitiesWithMinimumCostTest {
    @Test
    fun test1() {
        val n = 3
        val connections = arrayOf(intArrayOf(1, 2, 5), intArrayOf(1, 3, 6), intArrayOf(2, 3, 1))
        val expected = 6

        assertEquals(expected, ConnectingCitiesWithMinimumCost.minimumCost(n, connections))
    }

    @Test
    fun test2() {
        val n = 4
        val connections = arrayOf(intArrayOf(1, 2, 1), intArrayOf(3, 4, 2))
        val expected = -1

        assertEquals(expected, ConnectingCitiesWithMinimumCost.minimumCost(n, connections))
    }
}