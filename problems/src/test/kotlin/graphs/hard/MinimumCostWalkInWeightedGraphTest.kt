package graphs.hard

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MinimumCostWalkInWeightedGraphTest {
    @Test
    fun test1() {
        val n = 5
        val edges = arrayOf(intArrayOf(0, 1, 7), intArrayOf(1, 3, 7), intArrayOf(1, 2, 1))
        val query = arrayOf(intArrayOf(0, 3), intArrayOf(3, 4))
        val expected = intArrayOf(1, -1)

        assertArrayEquals(expected, MinimumCostWalkInWeightedGraph.minimumCost(n, edges, query))
    }

    @Test
    fun test2() {
        val n = 3
        val edges = arrayOf(
            intArrayOf(0, 2, 7),
            intArrayOf(0, 1, 15),
            intArrayOf(1, 2, 6),
            intArrayOf(1, 2, 1),
        )
        val query = arrayOf(intArrayOf(1, 2))
        val expected = intArrayOf(0)

        assertArrayEquals(expected, MinimumCostWalkInWeightedGraph.minimumCost(n, edges, query))
    }
}