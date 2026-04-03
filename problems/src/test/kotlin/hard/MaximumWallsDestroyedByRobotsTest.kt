package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumWallsDestroyedByRobotsTest {
    @Test
    fun test1() {
        val robots = intArrayOf(4)
        val distance = intArrayOf(3)
        val walls = intArrayOf(1, 10)
        val expected = 1

        assertEquals(expected, MaximumWallsDestroyedByRobots.maxWalls(robots, distance, walls))
    }

    @Test
    fun test2() {
        val robots = intArrayOf(10, 2)
        val distance = intArrayOf(5, 1)
        val walls = intArrayOf(5, 2, 7)
        val expected = 3

        assertEquals(expected, MaximumWallsDestroyedByRobots.maxWalls(robots, distance, walls))
    }

    @Test
    fun test3() {
        val robots = intArrayOf(1, 2)
        val distance = intArrayOf(100, 1)
        val walls = intArrayOf(10)
        val expected = 0

        assertEquals(expected, MaximumWallsDestroyedByRobots.maxWalls(robots, distance, walls))
    }
}