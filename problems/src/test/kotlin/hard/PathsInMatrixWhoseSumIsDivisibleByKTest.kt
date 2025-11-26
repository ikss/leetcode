package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PathsInMatrixWhoseSumIsDivisibleByKTest {
    @Test
    fun test1() {
        val grid = arrayOf(intArrayOf(5, 2, 4), intArrayOf(3, 0, 5), intArrayOf(0, 7, 2))
        val k = 3
        val expected = 2

        assertEquals(expected, PathsInMatrixWhoseSumIsDivisibleByK.numberOfPaths(grid, k))
    }

    @Test
    fun test2() {
        val grid = arrayOf(intArrayOf(0, 0))
        val k = 5
        val expected = 1

        assertEquals(expected, PathsInMatrixWhoseSumIsDivisibleByK.numberOfPaths(grid, k))
    }

    @Test
    fun test3() {
        val grid = arrayOf(intArrayOf(7, 3, 4, 9), intArrayOf(2, 3, 6, 2), intArrayOf(2, 3, 7, 0))
        val k = 1
        val expected = 10

        assertEquals(expected, PathsInMatrixWhoseSumIsDivisibleByK.numberOfPaths(grid, k))
    }
}