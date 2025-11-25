package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindClosestNodeToGivenTwoNodesTest {

    @Test
    fun test1() {
        val edges = intArrayOf(2, 2, 3, -1)
        val node1 = 0
        val node2 = 1
        val expected = 2

        assertEquals(expected, FindClosestNodeToGivenTwoNodes.closestMeetingNode(edges, node1, node2))
    }

    @Test
    fun test2() {
        val edges = intArrayOf(1, 2, -1)
        val node1 = 0
        val node2 = 2
        val expected = 2

        assertEquals(expected, FindClosestNodeToGivenTwoNodes.closestMeetingNode(edges, node1, node2))
    }

    @Test
    fun test3() {
        val edges = intArrayOf(5, 4, 5, 4, 3, 6, -1)
        val node1 = 0
        val node2 = 1
        val expected = -1

        assertEquals(expected, FindClosestNodeToGivenTwoNodes.closestMeetingNode(edges, node1, node2))
    }
}