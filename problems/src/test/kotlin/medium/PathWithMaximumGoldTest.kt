package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PathWithMaximumGoldTest {
    @Test
    fun test1() {
        val grid = arrayOf(
            intArrayOf(0, 6, 0),
            intArrayOf(5, 8, 7),
            intArrayOf(0, 9, 0),
        )
        val expected = 24

        assertEquals(expected, PathWithMaximumGold.getMaximumGold(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(
            intArrayOf(1, 0, 7),
            intArrayOf(2, 0, 6),
            intArrayOf(3, 4, 5),
            intArrayOf(0, 3, 0),
            intArrayOf(9, 0, 20),
        )
        val expected = 28

        assertEquals(expected, PathWithMaximumGold.getMaximumGold(grid))
    }
}