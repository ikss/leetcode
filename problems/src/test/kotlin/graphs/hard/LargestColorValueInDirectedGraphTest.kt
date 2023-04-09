package graphs.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LargestColorValueInDirectedGraphTest {

    @Test
    fun test1() {
        val colors = "abaca"
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(2, 3), intArrayOf(3, 4))
        val expected = 3

        assertEquals(expected, LargestColorValueInDirectedGraph.largestPathValue(colors, edges))
    }

    @Test
    fun test2() {
        val colors = "a"
        val edges = arrayOf(intArrayOf(0, 0))
        val expected = -1

        assertEquals(expected, LargestColorValueInDirectedGraph.largestPathValue(colors, edges))
    }
}