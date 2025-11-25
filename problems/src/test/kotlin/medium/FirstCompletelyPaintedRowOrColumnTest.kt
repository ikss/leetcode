package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FirstCompletelyPaintedRowOrColumnTest {
    @Test
    fun test1() {
        val arr = intArrayOf(1, 3, 4, 2)
        val mat = arrayOf(
            intArrayOf(1, 4),
            intArrayOf(2, 3),
        )
        val expected = 2

        assertEquals(expected, FirstCompletelyPaintedRowOrColumn.firstCompleteIndex(arr, mat))
    }

    @Test
    fun test2() {
        val arr = intArrayOf(2, 8, 7, 4, 1, 3, 5, 6, 9)
        val mat = arrayOf(
            intArrayOf(3, 2, 5),
            intArrayOf(1, 4, 6),
            intArrayOf(8, 7, 9),
        )
        val expected = 3

        assertEquals(expected, FirstCompletelyPaintedRowOrColumn.firstCompleteIndex(arr, mat))
    }
}