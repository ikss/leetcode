package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LargestRectangleInHistogramTest {
    @Test
    fun test1() {
        val heights = intArrayOf(2, 1, 5, 6, 2, 3)
        val expected = 10

        assertEquals(expected, LargestRectangleInHistogram.largestRectangleArea(heights))
    }

    @Test
    fun test2() {
        val heights = intArrayOf(2, 4)
        val expected = 4

        assertEquals(expected, LargestRectangleInHistogram.largestRectangleArea(heights))
    }
}