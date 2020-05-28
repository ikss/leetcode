package week3

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

object CountSubmatricesTest {

    @Test
    fun test1() {
        val matrix =
            arrayOf(
                arrayOf(0, 1, 1, 1).toIntArray(),
                arrayOf(1, 1, 1, 1).toIntArray(),
                arrayOf(0, 1, 1, 1).toIntArray()
            )
        assertEquals(15, CountSubmatrices.countSquares(matrix))
    }

    @Test
    fun test2() {
        val matrix =
            arrayOf(
                intArrayOf(1, 0, 1),
                intArrayOf(1, 1, 0),
                intArrayOf(1, 1, 0)
            )
        assertEquals(7, CountSubmatrices.countSquares2(matrix))
    }

    @Test
    fun test3() {
        val matrix =
            arrayOf(
                intArrayOf(1)
            )
        assertEquals(1, CountSubmatrices.countSquares(matrix))
    }
}
