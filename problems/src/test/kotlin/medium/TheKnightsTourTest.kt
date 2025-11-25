package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class TheKnightsTourTest {
    @Test
    fun test1() {
        val m = 1
        val n = 1
        val r = 0
        val c = 0
        val expected = arrayOf(intArrayOf(0))

        assertArrayEquals(expected, TheKnightsTour.tourOfKnight(m, n, r, c))
    }

    @Test
    fun test2() {
        val m = 3
        val n = 4
        val r = 0
        val c = 0
        val expected = arrayOf(
            intArrayOf(0, 3, 6, 9),
            intArrayOf(7, 10, 1, 4),
            intArrayOf(2, 5, 8, 11),
        )

        assertArrayEquals(expected, TheKnightsTour.tourOfKnight(m, n, r, c))
    }
}