package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountNegativeNumbersInSortedMatrixTest {
    @Test
    fun test1() {
        val grid = arrayOf(
            intArrayOf(4, 3, 2, -1),
            intArrayOf(3, 2, 1, -1),
            intArrayOf(1, 1, -1, -2),
            intArrayOf(-1, -1, -2, -3),
        )
        val expected = 8

        assertEquals(expected, CountNegativeNumbersInSortedMatrix.countNegatives(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(intArrayOf(3, 2), intArrayOf(1, 0))
        val expected = 0

        assertEquals(expected, CountNegativeNumbersInSortedMatrix.countNegatives(grid))
    }
}