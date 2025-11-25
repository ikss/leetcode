package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfIncreasingPathsInGridTest {
    @Test
    fun test1() {
        val grid = arrayOf(intArrayOf(1, 1), intArrayOf(3, 4))
        val expected = 8

        assertEquals(expected, NumberOfIncreasingPathsInGrid.countPaths(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(intArrayOf(1), intArrayOf(2))
        val expected = 3

        assertEquals(expected, NumberOfIncreasingPathsInGrid.countPaths(grid))
    }
}