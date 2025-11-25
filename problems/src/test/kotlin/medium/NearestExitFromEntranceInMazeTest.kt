package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NearestExitFromEntranceInMazeTest {
    @Test
    fun test1() {
        val maze = arrayOf(
            charArrayOf('+', '+', '.', '+'),
            charArrayOf('.', '.', '.', '+'),
            charArrayOf('+', '+', '+', '.'),
        )
        val entrance = intArrayOf(1, 2)
        val expected = 1

        assertEquals(expected, NearestExitFromEntranceInMaze.nearestExit(maze, entrance))
    }

    @Test
    fun test2() {
        val maze = arrayOf(
            charArrayOf('+', '+', '+'),
            charArrayOf('.', '.', '.'),
            charArrayOf('+', '+', '+'),
        )
        val entrance = intArrayOf(1, 0)
        val expected = 2

        assertEquals(expected, NearestExitFromEntranceInMaze.nearestExit(maze, entrance))
    }

    @Test
    fun test3() {
        val maze = arrayOf(
            charArrayOf('.', '+'),
        )
        val entrance = intArrayOf(0, 0)
        val expected = -1

        assertEquals(expected, NearestExitFromEntranceInMaze.nearestExit(maze, entrance))
    }
}