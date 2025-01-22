package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GridGameTest {
    @Test
    fun test1() {
        val grid = arrayOf(
            intArrayOf(2, 5, 4),
            intArrayOf(1, 5, 1),
        )
        val expected = 4L

        assertEquals(expected, GridGame.gridGame(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(
            intArrayOf(3, 3, 1),
            intArrayOf(8, 5, 2),
        )
        val expected = 4L

        assertEquals(expected, GridGame.gridGame(grid))
    }

    @Test
    fun test3() {
        val grid = arrayOf(
            intArrayOf(1, 3, 1, 15),
            intArrayOf(1, 3, 3, 1),
        )
        val expected = 7L

        assertEquals(expected, GridGame.gridGame(grid))
    }
}