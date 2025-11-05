package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumAreaOfLongestDiagonalRectangleTest {
    @Test
    fun test1() {
        val points = arrayOf(
            intArrayOf(9, 3),
            intArrayOf(8, 6),
        )
        val expected = 48

        assertEquals(expected, MaximumAreaOfLongestDiagonalRectangle.areaOfMaxDiagonal(points))
    }

    @Test
    fun test2() {
        val points = arrayOf(
            intArrayOf(3, 4),
            intArrayOf(4, 3),
        )
        val expected = 12

        assertEquals(expected, MaximumAreaOfLongestDiagonalRectangle.areaOfMaxDiagonal(points))
    }
}