package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindCenterOfStarGraphTest {
    @Test
    fun test1() {
        val edges = arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(4, 2))
        val expected = 2

        assertEquals(expected, FindCenterOfStarGraph.findCenter(edges))
    }

    @Test
    fun test2() {
        val edges = arrayOf(intArrayOf(1, 2), intArrayOf(5, 1), intArrayOf(1, 3), intArrayOf(1, 4))
        val expected = 1

        assertEquals(expected, FindCenterOfStarGraph.findCenter(edges))
    }
}