package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RobotCollisionsTest {
    @Test
    fun test1() {
        val positions = intArrayOf(5, 4, 3, 2, 1)
        val healths = intArrayOf(2, 17, 9, 15, 10)
        val directions = "RRRRR"
        val expected = listOf(2, 17, 9, 15, 10)

        assertEquals(expected, RobotCollisions.survivedRobotsHealths(positions, healths, directions))
    }

    @Test
    fun test2() {
        val positions = intArrayOf(3, 5, 2, 6)
        val healths = intArrayOf(10, 10, 15, 12)
        val directions = "RLRL"
        val expected = listOf(14)

        assertEquals(expected, RobotCollisions.survivedRobotsHealths(positions, healths, directions))
    }

    @Test
    fun test3() {
        val positions = intArrayOf(1, 2, 5, 6)
        val healths = intArrayOf(10, 10, 11, 11)
        val directions = "RLRL"
        val expected = emptyList<Int>()

        assertEquals(expected, RobotCollisions.survivedRobotsHealths(positions, healths, directions))
    }
}