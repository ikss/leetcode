package graphs.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheCelebrityTest {
    @Test
    fun test1() {
        val n = 3
        val graph = arrayOf(
            intArrayOf(1, 1, 0),
            intArrayOf(0, 1, 0),
            intArrayOf(1, 1, 1)
        )
        val expected = 1

        val solution = FindTheCelebrity.Solution(graph)
        assertEquals(expected, solution.findCelebrity(n))
    }

    @Test
    fun test2() {
        val n = 3
        val graph = arrayOf(
            intArrayOf(1, 0, 1),
            intArrayOf(1, 1, 0),
            intArrayOf(0, 1, 1)
        )
        val expected = -1

        val solution = FindTheCelebrity.Solution(graph)
        assertEquals(expected, solution.findCelebrity(n))
    }
}