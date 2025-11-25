package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SmallestRectangleEnclosingBlackPixelsTest {
    @Test
    fun test1() {
        val image = arrayOf(
            charArrayOf('0', '0', '1', '0'),
            charArrayOf('0', '1', '1', '0'),
            charArrayOf('0', '1', '0', '0'),
        )
        val x = 0
        val y = 2
        val expected = 6

        assertEquals(expected, SmallestRectangleEnclosingBlackPixels.minArea(image, x, y))
    }

    @Test
    fun test2() {
        val image = arrayOf(
            charArrayOf('1'),
        )
        val x = 0
        val y = 0
        val expected = 1

        assertEquals(expected, SmallestRectangleEnclosingBlackPixels.minArea(image, x, y))
    }
}