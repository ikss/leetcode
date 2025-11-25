package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumNumberOfVerticesToReachAllNodesTest {

    @Test
    fun test1() {
        val n = 6
        val edges = listOf(listOf(0, 1), listOf(0, 2), listOf(2, 5), listOf(3, 4), listOf(4, 2))
        val expected = listOf(0, 3)

        assertEquals(expected, MinimumNumberOfVerticesToReachAllNodes.findSmallestSetOfVertices(n, edges))
    }

    @Test
    fun test2() {
        val n = 5
        val edges = listOf(listOf(0, 1), listOf(2, 1), listOf(3, 1), listOf(1, 4), listOf(2, 4))
        val expected = listOf(0, 2, 3)

        assertEquals(expected, MinimumNumberOfVerticesToReachAllNodes.findSmallestSetOfVertices(n, edges))
    }
}