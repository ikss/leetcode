package graphs.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NodeWithHighestEdgeScoreTest {
    @Test
    fun test1() {
        val edges = intArrayOf(1, 0, 0, 0, 0, 7, 7, 5)
        val expected = 4

        assertEquals(expected, NodeWithHighestEdgeScore.edgeScore(edges))
    }

    @Test
    fun test2() {
        val edges = intArrayOf(2, 0, 0, 2)
        val expected = 0

        assertEquals(expected, NodeWithHighestEdgeScore.edgeScore(edges))
    }

    @Test
    fun test3() {
        val edges = intArrayOf(1, 4, 1, 4, 2)
        val expected = 2

        assertEquals(expected, NodeWithHighestEdgeScore.edgeScore(edges))
    }
}