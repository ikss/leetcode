package arrays.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class PowerGridMaintenanceTest {
    @Test
    fun test1() {
        val c = 5
        val connections = arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4), intArrayOf(4, 5))
        val queries = arrayOf(intArrayOf(1, 3), intArrayOf(2, 1), intArrayOf(1, 1), intArrayOf(2, 2), intArrayOf(1, 2))
        val expected = intArrayOf(3, 2, 3)

        assertArrayEquals(expected, PowerGridMaintenance.processQueries(c, connections, queries))
    }

    @Test
    fun test2() {
        val c = 3
        val connections = emptyArray<IntArray>()
        val queries = arrayOf(intArrayOf(1, 1), intArrayOf(2, 1), intArrayOf(1, 1))
        val expected = intArrayOf(1, -1)

        assertArrayEquals(expected, PowerGridMaintenance.processQueries(c, connections, queries))
    }
}