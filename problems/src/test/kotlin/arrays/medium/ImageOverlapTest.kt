package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ImageOverlapTest {
    @Test
    fun test1() {
        val img1 = arrayOf(
            intArrayOf(1, 1, 0),
            intArrayOf(0, 1, 0),
            intArrayOf(0, 1, 0),
        )
        val img2 = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(0, 1, 1),
            intArrayOf(0, 0, 1),
        )
        val expected = 3

        assertEquals(expected, ImageOverlap.largestOverlap(img1, img2))
    }

    @Test
    fun test2() {
        val img1 = arrayOf(intArrayOf(1))
        val img2 = arrayOf(intArrayOf(1))
        val expected = 1

        assertEquals(expected, ImageOverlap.largestOverlap(img1, img2))
    }

    @Test
    fun test3() {
        val img1 = arrayOf(intArrayOf(0))
        val img2 = arrayOf(intArrayOf(0))
        val expected = 0

        assertEquals(expected, ImageOverlap.largestOverlap(img1, img2))
    }
}