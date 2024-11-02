package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ScoreAfterFlippingMatrixTest {
    @Test
    fun test1() {
        val matrix = arrayOf(
            intArrayOf(0, 0, 1, 1),
            intArrayOf(1, 0, 1, 0),
            intArrayOf(1, 1, 0, 0),
        )
        val expected = 39

        assertEquals(expected, ScoreAfterFlippingMatrix.matrixScore(matrix))
    }
    
    @Test
    fun test2() {
        val matrix = arrayOf(
            intArrayOf(0),
        )
        val expected = 1

        assertEquals(expected, ScoreAfterFlippingMatrix.matrixScore(matrix))
    }
}