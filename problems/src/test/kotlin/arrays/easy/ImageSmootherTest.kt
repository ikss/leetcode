package arrays.easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class ImageSmootherTest {
    @Test
    fun test1() {
        val matrix = arrayOf(
            intArrayOf(1, 1, 1),
            intArrayOf(1, 0, 1),
            intArrayOf(1, 1, 1),
        )
        val expected = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(0, 0, 0),
            intArrayOf(0, 0, 0),
        )

        assertArrayEquals(expected, ImageSmoother.imageSmoother(matrix))
    }

    @Test
    fun test2() {
        val matrix = arrayOf(
            intArrayOf(100, 200, 100),
            intArrayOf(200, 50, 200),
            intArrayOf(100, 200, 100),
        )
        val expected = arrayOf(
            intArrayOf(137, 141, 137),
            intArrayOf(141, 138, 141),
            intArrayOf(137, 141, 137),
        )

        assertArrayEquals(expected, ImageSmoother.imageSmoother(matrix))
    }
}