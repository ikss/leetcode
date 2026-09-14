package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RectangleOverlapTest {
    @Test
    fun test1() {
        val rec1 = intArrayOf(0, 0, 2, 2)
        val rec2 = intArrayOf(1, 1, 3, 3)
        val expected = true

        assertEquals(expected, RectangleOverlap.isRectangleOverlap(rec1, rec2))
    }

    @Test
    fun test2() {
        val rec1 = intArrayOf(0, 0, 1, 1)
        val rec2 = intArrayOf(1, 0, 2, 1)
        val expected = false

        assertEquals(expected, RectangleOverlap.isRectangleOverlap(rec1, rec2))
    }

    @Test
    fun test3() {
        val rec1 = intArrayOf(0, 0, 1, 1)
        val rec2 = intArrayOf(2, 2, 3, 3)
        val expected = false

        assertEquals(expected, RectangleOverlap.isRectangleOverlap(rec1, rec2))
    }
}