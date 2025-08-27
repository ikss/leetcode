package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LengthOfLongestVShapedDiagonalSegmentTest {
    @Test
    fun test1() {
        val grid = arrayOf(
            intArrayOf(2, 2, 1, 2, 2),
            intArrayOf(2, 0, 2, 2, 0),
            intArrayOf(2, 0, 1, 1, 0),
            intArrayOf(1, 0, 2, 2, 2),
            intArrayOf(2, 0, 0, 2, 2),
        )
        val expected = 5

        assertEquals(expected, LengthOfLongestVShapedDiagonalSegment.lenOfVDiagonal(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(
            intArrayOf(1, 2, 2, 2, 2),
            intArrayOf(2, 2, 2, 2, 0),
            intArrayOf(2, 0, 0, 0, 0),
            intArrayOf(0, 0, 2, 2, 2),
            intArrayOf(2, 0, 0, 2, 0),
        )
        val expected = 5

        assertEquals(expected, LengthOfLongestVShapedDiagonalSegment.lenOfVDiagonal(grid))
    }

    @Test
    fun test3() {
        val grid = arrayOf(intArrayOf(1))
        val expected = 1

        assertEquals(expected, LengthOfLongestVShapedDiagonalSegment.lenOfVDiagonal(grid))
    }
}