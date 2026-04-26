package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DetectCyclesIn2DGridTest {
    @Test
    fun test1() {
        val grid = arrayOf(
            charArrayOf('a', 'a', 'a', 'a'),
            charArrayOf('a', 'b', 'b', 'a'),
            charArrayOf('a', 'b', 'b', 'a'),
            charArrayOf('a', 'a', 'a', 'a')
        )
        val expected = true

        assertEquals(expected, DetectCyclesIn2DGrid.containsCycle(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(
            charArrayOf('c', 'c', 'c', 'a'),
            charArrayOf('c', 'd', 'c', 'c'),
            charArrayOf('c', 'c', 'd', 'c'),
            charArrayOf('f', 'c', 'c', 'c'),
        )
        val expected = true

        assertEquals(expected, DetectCyclesIn2DGrid.containsCycle(grid))
    }

    @Test
    fun test3() {
        val grid = arrayOf(
            charArrayOf('a', 'b', 'b'),
            charArrayOf('b', 'z', 'b'),
            charArrayOf('b', 'b', 'a'),
        )
        val expected = false

        assertEquals(expected, DetectCyclesIn2DGrid.containsCycle(grid))
    }
}