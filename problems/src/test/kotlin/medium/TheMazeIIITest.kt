package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TheMazeIIITest {
    @Test
    fun test1() {
        val maze = arrayOf(
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(1, 1, 0, 0, 1),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 1, 0, 0, 1),
            intArrayOf(0, 1, 0, 0, 0),
        )
        val start = intArrayOf(4, 3)
        val end = intArrayOf(0, 1)
        val expected = "lul"

        assertEquals(expected, TheMazeIII.findShortestWay(maze, start, end))
    }

    @Test
    fun test2() {
        val maze = arrayOf(
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(1, 1, 0, 0, 1),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 1, 0, 0, 1),
            intArrayOf(0, 1, 0, 0, 0),
        )
        val start = intArrayOf(4, 3)
        val end = intArrayOf(3, 0)
        val expected = "impossible"

        assertEquals(expected, TheMazeIII.findShortestWay(maze, start, end))
    }

    @Test
    fun test3() {
        val maze = arrayOf(
            intArrayOf(0, 1, 0, 0, 1, 0, 0, 1, 0, 0),
            intArrayOf(0, 0, 1, 0, 0, 1, 0, 0, 1, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 1, 0, 0, 1),
            intArrayOf(0, 0, 0, 0, 0, 0, 1, 0, 0, 1),
            intArrayOf(0, 1, 0, 0, 1, 0, 0, 1, 0, 0),
            intArrayOf(0, 0, 1, 0, 0, 1, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 1, 0, 0, 0),
            intArrayOf(1, 0, 0, 1, 0, 0, 0, 0, 0, 1),
            intArrayOf(0, 1, 0, 0, 1, 0, 0, 1, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 1, 0, 0, 1, 0),
        )
        val start = intArrayOf(2, 4)
        val end = intArrayOf(7, 6)
        val expected = "drdrdrdldl"

        assertEquals(expected, TheMazeIII.findShortestWay(maze, start, end))
    }
}