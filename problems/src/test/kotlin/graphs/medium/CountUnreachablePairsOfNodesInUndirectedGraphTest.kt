package graphs.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountUnreachablePairsOfNodesInUndirectedGraphTest {

    @Test
    fun test1() {
        val n = 3
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(1, 2))
        val expected = 0L

        assertEquals(expected, CountUnreachablePairsOfNodesInUndirectedGraph.countPairs(n, edges))
    }

    @Test
    fun test2() {
        val n = 7
        val edges = arrayOf(intArrayOf(0, 2), intArrayOf(0, 5), intArrayOf(2, 4), intArrayOf(1, 6), intArrayOf(5, 4))
        val expected = 14L

        assertEquals(expected, CountUnreachablePairsOfNodesInUndirectedGraph.countPairs(n, edges))
    }
}