package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ShortestDistanceFromAllBuildingsTest {
    @Test
    fun test1() {
        val grid = arrayOf(
            intArrayOf(1, 0, 2, 0, 1),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 1, 0, 0),
        )
        val expected = 7

        assertEquals(expected, ShortestDistanceFromAllBuildings.shortestDistance(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(
            intArrayOf(1, 0),
        )
        val expected = 1

        assertEquals(expected, ShortestDistanceFromAllBuildings.shortestDistance(grid))
    }

    @Test
    fun test3() {
        val grid = arrayOf(
            intArrayOf(1),
        )
        val expected = -1

        assertEquals(expected, ShortestDistanceFromAllBuildings.shortestDistance(grid))
    }

    @Test
    fun test4() {
        val grid = arrayOf(
            intArrayOf(1, 1),
            intArrayOf(0, 1),
        )
        val expected = -1

        assertEquals(expected, ShortestDistanceFromAllBuildings.shortestDistance(grid))
    }
}