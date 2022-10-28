package arrays.medium

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class `01MatrixTest` {
    @Test
    fun test1() {
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

        assertTrue(expected.contentDeepEquals(`01Matrix`.updateMatrix(mat)))
    }

    @Test
    fun test2() {
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

        assertTrue(expected.contentDeepEquals(`01Matrix`.updateMatrix(mat)))
    }

}
