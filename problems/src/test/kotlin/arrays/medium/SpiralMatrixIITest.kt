package arrays.medium

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SpiralMatrixIITest {
    @Test
    fun test1() {
        val n = 3
        val expected = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(8, 9, 4),
            intArrayOf(7, 6, 5),
        )

        assertTrue(expected.contentDeepEquals(SpiralMatrixII.generateMatrixNaive(n)))
    }

    @Test
    fun test2() {
        val n = 1
        val expected = arrayOf(
            intArrayOf(1),
        )

        assertTrue(expected.contentDeepEquals(SpiralMatrixII.generateMatrixNaive(n)))
    }

    @Test
    fun test3() {
        val n = 2
        val expected = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(4, 3),
        )

        assertTrue(expected.contentDeepEquals(SpiralMatrixII.generateMatrixNaive(n)))
    }
}