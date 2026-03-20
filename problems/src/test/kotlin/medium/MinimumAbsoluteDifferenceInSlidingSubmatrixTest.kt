package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MinimumAbsoluteDifferenceInSlidingSubmatrixTest {
    @Test
    fun test1() {
        val grid = arrayOf(intArrayOf(1, 8), intArrayOf(3, -2))
        val k = 2
        val expected = arrayOf(intArrayOf(2))

        assertArrayEquals(expected, MinimumAbsoluteDifferenceInSlidingSubmatrix.minAbsDiff(grid, k))
    }

    @Test
    fun test2() {
        val grid = arrayOf(intArrayOf(3, -1))
        val k = 1
        val expected = arrayOf(intArrayOf(0, 0))

        assertArrayEquals(expected, MinimumAbsoluteDifferenceInSlidingSubmatrix.minAbsDiff(grid, k))
    }

    @Test
    fun test3() {
        val grid = arrayOf(intArrayOf(1, -2, 3), intArrayOf(2, 3, 5))
        val k = 2
        val expected = arrayOf(intArrayOf(1, 2))

        assertArrayEquals(expected, MinimumAbsoluteDifferenceInSlidingSubmatrix.minAbsDiff(grid, k))
    }
}