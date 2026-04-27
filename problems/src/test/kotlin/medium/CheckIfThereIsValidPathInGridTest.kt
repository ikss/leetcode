package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CheckIfThereIsValidPathInGridTest {
    @Test
    fun test1() {
        val grid = arrayOf(intArrayOf(2, 4, 3), intArrayOf(6, 5, 2))
        val expected = true

        assertEquals(expected, CheckIfThereIsValidPathInGrid.hasValidPath(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(intArrayOf(1, 2, 1), intArrayOf(1, 2, 1))
        val expected = false

        assertEquals(expected, CheckIfThereIsValidPathInGrid.hasValidPath(grid))
    }

    @Test
    fun test3() {
        val grid = arrayOf(intArrayOf(1, 1, 1, 1, 1, 1, 3))
        val expected = true

        assertEquals(expected, CheckIfThereIsValidPathInGrid.hasValidPath(grid))
    }
}