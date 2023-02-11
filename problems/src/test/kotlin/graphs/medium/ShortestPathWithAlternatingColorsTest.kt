package graphs.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ShortestPathWithAlternatingColorsTest {

    @Test
    fun test1() {
        val n = 3
        val redEdges = arrayOf(intArrayOf(0, 1), intArrayOf(1, 2))
        val blueEdges = emptyArray<IntArray>()
        val expected = intArrayOf(0, 1, -1)

        val actual = ShortestPathWithAlternatingColors.shortestAlternatingPaths(n, redEdges, blueEdges)
        assertTrue(expected.contentEquals(actual))
    }

    @Test
    fun test2() {
        val n = 3
        val redEdges = arrayOf(intArrayOf(0, 1))
        val blueEdges = arrayOf(intArrayOf(2, 1))
        val expected = intArrayOf(0, 1, -1)

        val actual = ShortestPathWithAlternatingColors.shortestAlternatingPaths(n, redEdges, blueEdges)
        assertTrue(expected.contentEquals(actual))
    }
}