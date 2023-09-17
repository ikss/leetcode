package graphs.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ShortestPathVisitingAllNodesTest {
    @Test
    fun test1() {
        val grid = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(0),
            intArrayOf(0),
            intArrayOf(0),
        )
        val expected = 4

        assertEquals(expected, ShortestPathVisitingAllNodes.shortestPathLength(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(
            intArrayOf(1),
            intArrayOf(0, 2, 4),
            intArrayOf(1, 3, 4),
            intArrayOf(2),
            intArrayOf(1, 2),
        )
        val expected = 4

        assertEquals(expected, ShortestPathVisitingAllNodes.shortestPathLength(grid))
    }
}