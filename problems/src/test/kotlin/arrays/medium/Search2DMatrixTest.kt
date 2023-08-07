package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Search2DMatrixTest {
    @Test
    fun test1() {
        val matrix = arrayOf(
            intArrayOf(1, 3, 5, 7),
            intArrayOf(10, 11, 16, 20),
            intArrayOf(23, 30, 34, 60)
        )
        val target = 3
        val expected = true

        assertEquals(expected, Search2DMatrix.searchMatrix(matrix, target))
    }

    @Test
    fun test2() {
        val matrix = arrayOf(
            intArrayOf(1, 3, 5, 7),
            intArrayOf(10, 11, 16, 20),
            intArrayOf(23, 30, 34, 60)
        )
        val target = 13
        val expected = false

        assertEquals(expected, Search2DMatrix.searchMatrix(matrix, target))
    }

    @Test
    fun test3() {
        val matrix = arrayOf(
            intArrayOf(1)
        )
        val target = 1
        val expected = true

        assertEquals(expected, Search2DMatrix.searchMatrix(matrix, target))
    }
}