package arrays.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class FindValidMatrixGivenRowAndColumnSumsTest {
    @Test
    fun test1() {
        val rowSum = intArrayOf(3, 8)
        val colSum = intArrayOf(4, 7)
        val expected = arrayOf(intArrayOf(3, 0), intArrayOf(1, 7))

        assertArrayEquals(expected, FindValidMatrixGivenRowAndColumnSums.restoreMatrix(rowSum, colSum))
    }
    
    @Test
    fun test2() {
        val rowSum = intArrayOf(5, 7, 10)
        val colSum = intArrayOf(8, 6, 8)
        val expected = arrayOf(intArrayOf(5, 0, 0), intArrayOf(3, 4, 0), intArrayOf(0, 2, 8))

        assertArrayEquals(expected, FindValidMatrixGivenRowAndColumnSums.restoreMatrix(rowSum, colSum))
    }
}