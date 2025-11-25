package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumTotalDistanceTraveledTest {
    @Test
    fun test1() {
        val robot = listOf(0, 4, 6)
        val factory = arrayOf(intArrayOf(2, 2), intArrayOf(6, 2))
        val expected = 4L

        assertEquals(expected, MinimumTotalDistanceTraveled.minimumTotalDistance(robot, factory))
    }

    @Test
    fun test2() {
        val robot = listOf(1, -1)
        val factory = arrayOf(intArrayOf(-2, 1), intArrayOf(2, 1))
        val expected = 2L

        assertEquals(expected, MinimumTotalDistanceTraveled.minimumTotalDistance(robot, factory))
    }
}