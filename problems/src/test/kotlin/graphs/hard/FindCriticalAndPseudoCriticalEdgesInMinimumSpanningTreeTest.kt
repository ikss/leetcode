package graphs.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindCriticalAndPseudoCriticalEdgesInMinimumSpanningTreeTest {
    @Test
    fun test1() {
        val n = 5
        val edges = arrayOf(
            intArrayOf(0, 1, 1),
            intArrayOf(1, 2, 1),
            intArrayOf(2, 3, 2),
            intArrayOf(0, 3, 2),
            intArrayOf(0, 4, 3),
            intArrayOf(3, 4, 3),
            intArrayOf(1, 4, 6)
        )
        val expected = listOf(listOf(0, 1), listOf(2, 3, 4, 5))

        assertEquals(
            expected,
            FindCriticalAndPseudoCriticalEdgesInMinimumSpanningTree.findCriticalAndPseudoCriticalEdges(n, edges)
        )
    }

    @Test
    fun test2() {
        val n = 4
        val edges = arrayOf(
            intArrayOf(0, 1, 1),
            intArrayOf(1, 2, 1),
            intArrayOf(2, 3, 1),
            intArrayOf(0, 3, 1)
        )
        val expected = listOf(listOf(), listOf(0, 1, 2, 3))

        assertEquals(
            expected,
            FindCriticalAndPseudoCriticalEdgesInMinimumSpanningTree.findCriticalAndPseudoCriticalEdges(n, edges)
        )
    }
}