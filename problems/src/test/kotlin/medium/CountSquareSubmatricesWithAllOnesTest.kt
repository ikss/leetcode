package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountSquareSubmatricesWithAllOnesTest {
    @Test
    fun test1() {
        val matrix = arrayOf(
            intArrayOf(0, 1, 1, 1),
            intArrayOf(1, 1, 1, 1),
            intArrayOf(0, 1, 1, 1),
        )
        val expected = 15

        assertEquals(expected, CountSquareSubmatricesWithAllOnes.countSquares(matrix))
    }
    
    @Test
    fun test2() {
        val matrix = arrayOf(
            intArrayOf(1, 0, 1),
            intArrayOf(1, 1, 0),
            intArrayOf(1, 1, 0),
        )
        val expected = 7

        assertEquals(expected, CountSquareSubmatricesWithAllOnes.countSquares(matrix))
    }
}