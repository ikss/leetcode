package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ShortestPathInGridWithObstaclesEliminationTest {

    @Test
    fun test1() {
        val grid = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(1, 1, 0),
            intArrayOf(0, 0, 0),
            intArrayOf(0, 1, 1),
            intArrayOf(0, 0, 0),
        )
        val k = 1
        val expected = 6

        assertEquals(expected, ShortestPathInGridWithObstaclesElimination.shortestPath(grid, k))
    }

    @Test
    fun test2() {
        val grid = arrayOf(
            intArrayOf(0, 1, 1),
            intArrayOf(1, 1, 1),
            intArrayOf(1, 0, 0),
        )
        val k = 1
        val expected = -1

        assertEquals(expected, ShortestPathInGridWithObstaclesElimination.shortestPath(grid, k))
    }
}