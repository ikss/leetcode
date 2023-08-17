package arrays.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class `01MatrixTest` {
    @Test
    fun test1twoWaves() {
        val mat = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(0, 1, 0),
            intArrayOf(0, 0, 0),
        )
        val expected = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(0, 1, 0),
            intArrayOf(0, 0, 0),
        )

        assertArrayEquals(expected, `01Matrix`.updateMatrixTwoWaves(mat))
    }

    @Test
    fun test2twoWaves() {
        val mat = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(0, 1, 0),
            intArrayOf(1, 1, 1),
        )
        val expected = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(0, 1, 0),
            intArrayOf(1, 2, 1),
        )

        assertArrayEquals(expected, `01Matrix`.updateMatrixTwoWaves(mat))
    }

    @Test
    fun test1queue() {
        val mat = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(0, 1, 0),
            intArrayOf(0, 0, 0),
        )
        val expected = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(0, 1, 0),
            intArrayOf(0, 0, 0),
        )

        assertArrayEquals(expected, `01Matrix`.updateMatrixQueue(mat))
    }

    @Test
    fun test2queue() {
        val mat = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(0, 1, 0),
            intArrayOf(1, 1, 1),
        )
        val expected = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(0, 1, 0),
            intArrayOf(1, 2, 1),
        )

        assertArrayEquals(expected, `01Matrix`.updateMatrixQueue(mat))
    }
}
