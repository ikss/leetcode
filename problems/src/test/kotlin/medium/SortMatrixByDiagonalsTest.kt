package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SortMatrixByDiagonalsTest {
    @Test
    fun test1() {
        val grid = arrayOf(intArrayOf(1, 7, 3), intArrayOf(9, 8, 2), intArrayOf(4, 5, 6))
        val expected = arrayOf(intArrayOf(8, 2, 3), intArrayOf(9, 6, 7), intArrayOf(4, 5, 1))

        assertArrayEquals(expected, SortMatrixByDiagonals.sortMatrix(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(intArrayOf(0, 1), intArrayOf(1, 2))
        val expected = arrayOf(intArrayOf(2, 1), intArrayOf(1, 0))

        assertArrayEquals(expected, SortMatrixByDiagonals.sortMatrix(grid))
    }

    @Test
    fun test3() {
        val grid = arrayOf(intArrayOf(1))
        val expected = arrayOf(intArrayOf(1))

        assertArrayEquals(expected, SortMatrixByDiagonals.sortMatrix(grid))
    }
}