package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class UniquePathsIITest {

    @Test
    fun test1() {
        val obstacleGrid = arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(0, 0, 0))
        val expected = 2

        assertEquals(expected, UniquePathsII.uniquePathsWithObstacles(obstacleGrid))
    }

    @Test
    fun test2() {
        val obstacleGrid = arrayOf(intArrayOf(0, 1), intArrayOf(0, 0))
        val expected = 1

        assertEquals(expected, UniquePathsII.uniquePathsWithObstacles(obstacleGrid))
    }
}