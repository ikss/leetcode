package graphs.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfOperationsToMakeNetworkConnectedTest {
    @Test
    fun test1() {
        val n = 4
        val connections = arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(1, 2))
        val expected = 1

        assertEquals(expected, NumberOfOperationsToMakeNetworkConnected.makeConnected(n, connections))
    }

    @Test
    fun test2() {
        val n = 6
        val connections = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(0, 2),
            intArrayOf(0, 3),
            intArrayOf(1, 2),
            intArrayOf(1, 3),
        )
        val expected = 2

        assertEquals(expected, NumberOfOperationsToMakeNetworkConnected.makeConnected(n, connections))
    }

    @Test
    fun test3() {
        val n = 6
        val connections = arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(0, 3), intArrayOf(1, 2))
        val expected = -1

        assertEquals(expected, NumberOfOperationsToMakeNetworkConnected.makeConnected(n, connections))
    }
}