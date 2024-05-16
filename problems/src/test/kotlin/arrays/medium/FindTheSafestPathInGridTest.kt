package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheSafestPathInGridTest {
    @Test
    fun test1() {
        val grid = listOf(
            listOf(1, 0, 0),
            listOf(0, 0, 0),
            listOf(0, 0, 1),
        )
        val expected = 0

        assertEquals(expected, FindTheSafestPathInGrid.maximumSafenessFactor(grid))
    }

    @Test
    fun test2() {
        val grid = listOf(
            listOf(0, 0, 1),
            listOf(0, 0, 0),
            listOf(0, 0, 0),
        )
        val expected = 2

        assertEquals(expected, FindTheSafestPathInGrid.maximumSafenessFactor(grid))
    }

    @Test
    fun test3() {
        val grid = listOf(
            listOf(0, 0, 0, 1),
            listOf(0, 0, 0, 0),
            listOf(0, 0, 0, 0),
            listOf(1, 0, 0, 0),
        )
        val expected = 2

        assertEquals(expected, FindTheSafestPathInGrid.maximumSafenessFactor(grid))
    }
}