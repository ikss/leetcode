package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumPathScoreInGridTest {
    @Test
    fun test1() {
        val grid = arrayOf(intArrayOf(0, 1), intArrayOf(2, 0))
        val k = 1
        val expected = 2

        assertEquals(expected, MaximumPathScoreInGrid.maxPathScore(grid, k))
    }

    @Test
    fun test2() {
        val grid = arrayOf(intArrayOf(0, 1), intArrayOf(1, 2))
        val k = 1
        val expected = -1

        assertEquals(expected, MaximumPathScoreInGrid.maxPathScore(grid, k))
    }
}