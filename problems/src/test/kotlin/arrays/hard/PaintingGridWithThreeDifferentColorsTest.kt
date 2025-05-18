package arrays.hard

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PaintingGridWithThreeDifferentColorsTest {
    @Test
    fun test1() {
        val m = 1
        val n = 1
        val expected = 3

        assertEquals(expected, PaintingGridWithThreeDifferentColors.colorTheGrid(m, n))
    }


    @Test
    fun test2() {
        val m = 1
        val n = 2
        val expected = 6

        assertEquals(expected, PaintingGridWithThreeDifferentColors.colorTheGrid(m, n))
    }

    @Test
    fun test3() {
        val m = 5
        val n = 5
        val expected = 580986

        assertEquals(expected, PaintingGridWithThreeDifferentColors.colorTheGrid(m, n))
    }
}