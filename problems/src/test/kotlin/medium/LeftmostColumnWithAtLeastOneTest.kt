package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LeftmostColumnWithAtLeastOneTest {
    @Test
    fun test1() {
        val mat = LeftmostColumnWithAtLeastOne.BinaryMatrix(
            arrayOf(
                intArrayOf(0, 0),
                intArrayOf(1, 1),
            )
        )
        val expected = 0

        assertEquals(expected, LeftmostColumnWithAtLeastOne.leftMostColumnWithOne(mat))
    }

    @Test
    fun test2() {
        val mat = LeftmostColumnWithAtLeastOne.BinaryMatrix(
            arrayOf(
                intArrayOf(0, 0),
                intArrayOf(0, 1),
            )
        )
        val expected = 1

        assertEquals(expected, LeftmostColumnWithAtLeastOne.leftMostColumnWithOne(mat))
    }

    @Test
    fun test3() {
        val mat = LeftmostColumnWithAtLeastOne.BinaryMatrix(
            arrayOf(
                intArrayOf(0, 0),
                intArrayOf(0, 0),
            )
        )
        val expected = -1

        assertEquals(expected, LeftmostColumnWithAtLeastOne.leftMostColumnWithOne(mat))
    }
}