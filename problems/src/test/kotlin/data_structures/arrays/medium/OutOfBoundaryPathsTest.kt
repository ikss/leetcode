package data_structures.arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class OutOfBoundaryPathsTest {
    @Test
    fun test1recursive() {
        val m = 2
        val n = 2
        val maxMove = 2
        val startRow = 0
        val startColumn = 0
        val expected = 6

        assertEquals(expected, OutOfBoundaryPaths.findPathsRecursive(m, n, maxMove, startRow, startColumn))
    }

    @Test
    fun test2recursive() {
        val m = 1
        val n = 3
        val maxMove = 3
        val startRow = 0
        val startColumn = 1
        val expected = 12

        assertEquals(expected, OutOfBoundaryPaths.findPathsRecursive(m, n, maxMove, startRow, startColumn))
    }

    @Test
    fun test1dp() {
        val m = 2
        val n = 2
        val maxMove = 2
        val startRow = 0
        val startColumn = 0
        val expected = 6

        assertEquals(expected, OutOfBoundaryPaths.findPathsDP(m, n, maxMove, startRow, startColumn))
    }

    @Test
    fun test2dp() {
        val m = 1
        val n = 3
        val maxMove = 3
        val startRow = 0
        val startColumn = 1
        val expected = 12

        assertEquals(expected, OutOfBoundaryPaths.findPathsDP(m, n, maxMove, startRow, startColumn))
    }
}
