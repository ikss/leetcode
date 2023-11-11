package graphs.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DesignGraphWithShortestPathCalculatorTest {
    @Test
    fun test1() {
        val edges = arrayOf(intArrayOf(0, 2, 5), intArrayOf(0, 1, 2), intArrayOf(1, 2, 1), intArrayOf(3, 0, 3))
        val graph = DesignGraphWithShortestPathCalculator.Graph(4, edges)
        // return 6. The shortest path from 3 to 2 in the first diagram above is 3 -> 0 -> 1 -> 2 with a total cost of 3 + 2 + 1 = 6.
        assertEquals(6, graph.shortestPath(3, 2))
        // return -1. There is no path from 0 to 3.
        assertEquals(-1, graph.shortestPath(0, 3))
        // We add an edge from node 1 to node 3, and we get the second diagram above.
        graph.addEdge(intArrayOf(1, 3, 4))
        // return 6. The shortest path from 0 to 3 now is 0 -> 1 -> 3 with a total cost of 2 + 4 = 6.
        assertEquals(6, graph.shortestPath(0, 3))
    }
}