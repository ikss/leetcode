package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AllAncestorsOfNodeInDirectedAcyclicGraphTest {
    @Test
    fun test1() {
        val n = 8
        val edges = arrayOf(
            intArrayOf(0, 3),
            intArrayOf(0, 4),
            intArrayOf(1, 3),
            intArrayOf(2, 4),
            intArrayOf(2, 7),
            intArrayOf(3, 5),
            intArrayOf(3, 6),
            intArrayOf(3, 7),
            intArrayOf(4, 6),
        )
        val expected = listOf(
            listOf(),
            listOf(),
            listOf(),
            listOf(0, 1),
            listOf(0, 2),
            listOf(0, 1, 3),
            listOf(0, 1, 2, 3, 4),
            listOf(0, 1, 2, 3),
        )

        assertEquals(expected, AllAncestorsOfNodeInDirectedAcyclicGraph.getAncestors(n, edges))
    }

    @Test
    fun test2() {
        val n = 5
        val edges = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(0, 2),
            intArrayOf(0, 3),
            intArrayOf(0, 4),
            intArrayOf(1, 2),
            intArrayOf(1, 3),
            intArrayOf(1, 4),
            intArrayOf(2, 3),
            intArrayOf(2, 4),
            intArrayOf(3, 4),
        )
        val expected = listOf(
            listOf(),
            listOf(0),
            listOf(0, 1),
            listOf(0, 1, 2),
            listOf(0, 1, 2, 3),
        )

        assertEquals(expected, AllAncestorsOfNodeInDirectedAcyclicGraph.getAncestors(n, edges))
    }
}