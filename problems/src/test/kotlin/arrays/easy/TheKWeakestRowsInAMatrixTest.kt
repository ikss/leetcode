package arrays.easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class TheKWeakestRowsInAMatrixTest {
    @Test
    fun test1() {
        val mat = arrayOf(
            intArrayOf(1, 1, 0, 0, 0),
            intArrayOf(1, 1, 1, 1, 0),
            intArrayOf(1, 0, 0, 0, 0),
            intArrayOf(1, 1, 0, 0, 0),
            intArrayOf(1, 1, 1, 1, 1),
        )
        val k = 3
        val expected = intArrayOf(2, 0, 3)

        assertArrayEquals(expected, TheKWeakestRowsInAMatrix.kWeakestRows(mat, k))
    }

    @Test
    fun test2() {
        val mat = arrayOf(
            intArrayOf(1, 0, 0, 0),
            intArrayOf(1, 1, 1, 1),
            intArrayOf(1, 0, 0, 0),
            intArrayOf(1, 0, 0, 0),
        )
        val k = 2
        val expected = intArrayOf(0, 2)

        assertArrayEquals(expected, TheKWeakestRowsInAMatrix.kWeakestRows(mat, k))
    }
}