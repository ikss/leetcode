package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NQueensTest {

    @Test
    fun test1() {
        val n = 4
        val expected = listOf(listOf("..Q.", "Q...", "...Q", ".Q.."), listOf(".Q..", "...Q", "Q...", "..Q."))

        assertEquals(expected, NQueens.solveNQueens(n))
    }

    @Test
    fun test2() {
        val n = 1
        val expected = listOf(listOf("Q"))

        assertEquals(expected, NQueens.solveNQueens(n))
    }
}