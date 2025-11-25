package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class WidestVerticalAreaBetweenTwoPointsContainingNoPointsTest {
    @Test
    fun test1() {
        val input = arrayOf(
            intArrayOf(8, 7),
            intArrayOf(9, 9),
            intArrayOf(7, 4),
            intArrayOf(9, 7),
        )
        val expected = 1

        assertEquals(expected, WidestVerticalAreaBetweenTwoPointsContainingNoPoints.maxWidthOfVerticalArea(input))
    }

    @Test
    fun test2() {
        val input = arrayOf(
            intArrayOf(3, 1),
            intArrayOf(9, 0),
            intArrayOf(1, 0),
            intArrayOf(1, 4),
            intArrayOf(5, 3),
            intArrayOf(8, 8),
        )
        val expected = 3

        assertEquals(expected, WidestVerticalAreaBetweenTwoPointsContainingNoPoints.maxWidthOfVerticalArea(input))
    }
}