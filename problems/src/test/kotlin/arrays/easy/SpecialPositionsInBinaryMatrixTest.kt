package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SpecialPositionsInBinaryMatrixTest {
    @Test
    fun test1() {
        val input = arrayOf(
            intArrayOf(1, 0, 0),
            intArrayOf(0, 0, 1),
            intArrayOf(1, 0, 0),
        )
        val expected = 1

        assertEquals(expected, SpecialPositionsInBinaryMatrix.numSpecial(input))
    }

    @Test
    fun test2() {
        val input = arrayOf(
            intArrayOf(1, 0, 0),
            intArrayOf(0, 1, 0),
            intArrayOf(0, 0, 1),
        )
        val expected = 3

        assertEquals(expected, SpecialPositionsInBinaryMatrix.numSpecial(input))
    }
}