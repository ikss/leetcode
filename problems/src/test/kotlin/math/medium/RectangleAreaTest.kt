package math.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class RectangleAreaTest {

    @Test
    fun test1() {
        val ax1 = -3
        val ay1 = 0
        val ax2 = 3
        val ay2 = 4
        val bx1 = 0
        val by1 = -1
        val bx2 = 9
        val by2 = 2
        val expected = 45

        assertEquals(expected, RectangleArea.computeArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2))
    }

    @Test
    fun test2() {
        val ax1 = -2
        val ay1 = -2
        val ax2 = 2
        val ay2 = 2
        val bx1 = -2
        val by1 = -2
        val bx2 = 2
        val by2 = 2
        val expected = 16

        assertEquals(expected, RectangleArea.computeArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2))
    }

    @Test
    fun test3() {
        val ax1 = -2
        val ay1 = -2
        val ax2 = 2
        val ay2 = 2
        val bx1 = 3
        val by1 = 3
        val bx2 = 4
        val by2 = 4
        val expected = 17

        assertEquals(expected, RectangleArea.computeArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2))
    }

}