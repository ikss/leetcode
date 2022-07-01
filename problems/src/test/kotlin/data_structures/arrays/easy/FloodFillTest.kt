package data_structures.arrays.easy

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class FloodFillTest {
    @Test
    fun test1() {
        val image = arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 1, 0), intArrayOf(1, 0, 1))
        val sr = 1
        val sc = 1
        val color = 2
        val expected = arrayOf(intArrayOf(2, 2, 2), intArrayOf(2, 2, 0), intArrayOf(2, 0, 1))

        assertTrue(expected.contentDeepEquals(FloodFill.floodFill(image, sr, sc, color)))
    }

    @Test
    fun test2() {
        val image = arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 0, 0))
        val sr = 0
        val sc = 0
        val color = 0
        val expected = arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 0, 0))

        assertTrue(expected.contentDeepEquals(FloodFill.floodFill(image, sr, sc, color)))
    }
}
