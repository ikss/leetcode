package graphs.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfConnectedComponentsInUndirectedGraphTest {
    @Test
    fun test1() {
        val n = 5
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(3, 4))
        val expected = 2

        assertEquals(expected, NumberOfConnectedComponentsInUndirectedGraph.countComponents(n, edges))
    }

    @Test
    fun test2() {
        val n = 5
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4))
        val expected = 1

        assertEquals(expected, NumberOfConnectedComponentsInUndirectedGraph.countComponents(n, edges))
    }

    @Test
    fun test3() {
        val n = 10
        val edges = arrayOf(
            intArrayOf(5, 6),
            intArrayOf(0, 2),
            intArrayOf(1, 7),
            intArrayOf(5, 9),
            intArrayOf(1, 8),
            intArrayOf(3, 4),
            intArrayOf(0, 6),
            intArrayOf(0, 7),
            intArrayOf(0, 3),
            intArrayOf(8, 9),
        )
        val expected = 1

        assertEquals(expected, NumberOfConnectedComponentsInUndirectedGraph.countComponents(n, edges))
    }
}