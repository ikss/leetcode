package arrays.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class DifferenceBetweenOnesAndZerosInRowAndColumnTest {
    @Test
    fun test1() {
        val grid = arrayOf(
            intArrayOf(0, 1, 1),
            intArrayOf(1, 0, 1),
            intArrayOf(0, 0, 1),
        )
        val expected = arrayOf(
            intArrayOf(0, 0, 4),
            intArrayOf(0, 0, 4),
            intArrayOf(-2, -2, 2),
        )

        assertArrayEquals(expected, DifferenceBetweenOnesAndZerosInRowAndColumn.onesMinusZeros(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(
            intArrayOf(1, 1, 1),
            intArrayOf(1, 1, 1),
        )
        val expected = arrayOf(
            intArrayOf(5, 5, 5),
            intArrayOf(5, 5, 5),
        )

        assertArrayEquals(expected, DifferenceBetweenOnesAndZerosInRowAndColumn.onesMinusZeros(grid))
    }

}