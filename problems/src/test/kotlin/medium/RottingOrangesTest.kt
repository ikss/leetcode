package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RottingOrangesTest {
    @Test
    fun test1() {
        val matrix = arrayOf(
            intArrayOf(2, 1, 1),
            intArrayOf(1, 1, 0),
            intArrayOf(0, 1, 1),
        )
        val expected = 4

        assertEquals(expected, RottingOranges.orangesRotting(matrix))
    }

    @Test
    fun test2() {
        val matrix = arrayOf(
            intArrayOf(2, 1, 1),
            intArrayOf(0, 1, 1),
            intArrayOf(1, 0, 1),
        )
        val expected = -1

        assertEquals(expected, RottingOranges.orangesRotting(matrix))
    }

    @Test
    fun test3() {
        val matrix = arrayOf(
            intArrayOf(0, 2),
        )
        val expected = 0

        assertEquals(expected, RottingOranges.orangesRotting(matrix))
    }

}
