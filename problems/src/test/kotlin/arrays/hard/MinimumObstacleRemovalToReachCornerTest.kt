package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumObstacleRemovalToReachCornerTest {
    @Test
    fun test1() {
        val grid = arrayOf(intArrayOf(0, 1, 1), intArrayOf(1, 1, 0), intArrayOf(1, 1, 0))
        val expected = 2

        assertEquals(expected, MinimumObstacleRemovalToReachCorner.minimumObstacles(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(intArrayOf(0, 1, 0, 0, 0), intArrayOf(0, 1, 0, 1, 0), intArrayOf(0, 0, 0, 1, 0))
        val expected = 0

        assertEquals(expected, MinimumObstacleRemovalToReachCorner.minimumObstacles(grid))
    }
}