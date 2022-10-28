package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Search2DMatrixIITest {
    @Test
    fun test1() {
        val matrix = arrayOf(
            intArrayOf(1, 4, 7, 11, 15),
            intArrayOf(2, 5, 8, 12, 19),
            intArrayOf(3, 6, 9, 16, 22),
            intArrayOf(10, 13, 14, 17, 24),
            intArrayOf(18, 21, 23, 26, 30)
        )
        val target = 5
        val expected = true

        assertEquals(expected, Search2DMatrixII.searchMatrix(matrix, target))
    }

    @Test
    fun test2() {
        val matrix = arrayOf(
            intArrayOf(1, 4, 7, 11, 15),
            intArrayOf(2, 5, 8, 12, 19),
            intArrayOf(3, 6, 9, 16, 22),
            intArrayOf(10, 13, 14, 17, 24),
            intArrayOf(18, 21, 23, 26, 30)
        )
        val target = 20
        val expected = false

        assertEquals(expected, Search2DMatrixII.searchMatrix(matrix, target))
    }

    @Test
    fun test3() {
        val matrix = arrayOf(
            intArrayOf(-3)
        )
        val target = -3
        val expected = true

        assertEquals(expected, Search2DMatrixII.searchMatrix(matrix, target))
    }

}
