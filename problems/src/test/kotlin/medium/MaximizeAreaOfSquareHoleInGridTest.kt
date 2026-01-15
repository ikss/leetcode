package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximizeAreaOfSquareHoleInGridTest {
    @Test
    fun test1() {
        val n = 2
        val m = 1
        val hBars = intArrayOf(2, 3)
        val vBars = intArrayOf(2)
        val expected = 4

        assertEquals(expected, MaximizeAreaOfSquareHoleInGrid.maximizeSquareHoleArea(n, m, hBars, vBars))
    }

    @Test
    fun test2() {
        val n = 1
        val m = 1
        val hBars = intArrayOf(2)
        val vBars = intArrayOf(2)
        val expected = 4

        assertEquals(expected, MaximizeAreaOfSquareHoleInGrid.maximizeSquareHoleArea(n, m, hBars, vBars))
    }

    @Test
    fun test3() {
        val n = 2
        val m = 3
        val hBars = intArrayOf(2, 3)
        val vBars = intArrayOf(2, 4)
        val expected = 4

        assertEquals(expected, MaximizeAreaOfSquareHoleInGrid.maximizeSquareHoleArea(n, m, hBars, vBars))
    }
}