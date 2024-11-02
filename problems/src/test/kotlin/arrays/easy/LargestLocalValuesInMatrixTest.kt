package arrays.easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class LargestLocalValuesInMatrixTest {
    @Test
    fun test1() {
        val matrix = arrayOf(
            intArrayOf(9, 9, 8, 1),
            intArrayOf(5, 6, 2, 6),
            intArrayOf(8, 2, 6, 4),
            intArrayOf(6, 2, 2, 2),
        )
        val expected = arrayOf(
            intArrayOf(9, 9),
            intArrayOf(8, 6),
        )

        assertArrayEquals(expected, LargestLocalValuesInMatrix.largestLocal(matrix))
    }
    
    @Test
    fun test2() {
        val matrix = arrayOf(
            intArrayOf(1, 1, 1, 1, 1),
            intArrayOf(1, 1, 1, 1, 1),
            intArrayOf(1, 1, 2, 1, 1),
            intArrayOf(1, 1, 1, 1, 1),
            intArrayOf(1, 1, 1, 1, 1),
        )
        val expected = arrayOf(
            intArrayOf(2, 2, 2),
            intArrayOf(2, 2, 2),
            intArrayOf(2, 2, 2),
        )

        assertArrayEquals(expected, LargestLocalValuesInMatrix.largestLocal(matrix))
    }
}