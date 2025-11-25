package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ShortestDistanceToTargetColorTest {
    @Test
    fun test1() {
        val colors = intArrayOf(1, 1, 2, 1, 3, 2, 2, 3, 3)
        val queries = arrayOf(intArrayOf(1, 3), intArrayOf(2, 2), intArrayOf(6, 1))
        val expected = listOf(3, 0, 3)

        assertEquals(expected, ShortestDistanceToTargetColor.shortestDistanceColor(colors, queries))
    }

    @Test
    fun test2() {
        val colors = intArrayOf(1, 2)
        val queries = arrayOf(intArrayOf(0, 3))
        val expected = listOf(-1)

        assertEquals(expected, ShortestDistanceToTargetColor.shortestDistanceColor(colors, queries))
    }
}