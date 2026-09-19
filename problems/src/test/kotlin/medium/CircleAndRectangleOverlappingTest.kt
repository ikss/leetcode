package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CircleAndRectangleOverlappingTest {
    @Test
    fun test1() {
        val radius = 1
        val xCenter = 0
        val yCenter = 0
        val x1 = 1
        val y1 = -1
        val x2 = 3
        val y2 = 1
        val expected = true

        assertEquals(expected, CircleAndRectangleOverlapping.checkOverlap(radius, xCenter, yCenter, x1, y1, x2, y2))
    }

    @Test
    fun test2() {
        val radius = 1
        val xCenter = 1
        val yCenter = 1
        val x1 = 1
        val y1 = -3
        val x2 = 2
        val y2 = -1
        val expected = true

        assertEquals(expected, CircleAndRectangleOverlapping.checkOverlap(radius, xCenter, yCenter, x1, y1, x2, y2))
    }
}