package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TheMazeIITest {
    @Test
    fun test1() {
        val maze = arrayOf(
            intArrayOf(0, 0, 1, 0, 0),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 1, 0),
            intArrayOf(1, 1, 0, 1, 1),
            intArrayOf(0, 0, 0, 0, 0),
        )
        val start = intArrayOf(0, 4)
        val end = intArrayOf(4, 4)
        val expected = 12

        assertEquals(expected, TheMazeII.shortestDistance(maze, start, end))
    }

    @Test
    fun test2() {
        val maze = arrayOf(
            intArrayOf(0, 0, 1, 0, 0),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 1, 0),
            intArrayOf(1, 1, 0, 1, 1),
            intArrayOf(0, 0, 0, 0, 0),
        )
        val start = intArrayOf(0, 4)
        val end = intArrayOf(3, 2)
        val expected = -1

        assertEquals(expected, TheMazeII.shortestDistance(maze, start, end))
    }

    @Test
    fun test3() {
        val maze = arrayOf(
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(1, 1, 0, 0, 1),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 1, 0, 0, 1),
            intArrayOf(0, 1, 0, 0, 0),
        )
        val start = intArrayOf(4, 3)
        val end = intArrayOf(0, 1)
        val expected = -1

        assertEquals(expected, TheMazeII.shortestDistance(maze, start, end))
    }
}