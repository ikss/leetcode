package graphs.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestCycleInGraphTest {

    @Test
    fun test1() {
        val edges = intArrayOf(3, 3, 4, 2, 3)
        val expected = 3

        assertEquals(expected, LongestCycleInGraph.longestCycle(edges))
    }

    @Test
    fun test2() {
        val edges = intArrayOf(2, -1, 3, 1)
        val expected = -1

        assertEquals(expected, LongestCycleInGraph.longestCycle(edges))
    }
}