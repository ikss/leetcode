package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NQueensIITest {
    @Test
    fun test1() {
        val n = 4
        val expected = 2

        assertEquals(expected, NQueensII.totalNQueens(n))
    }

    @Test
    fun test2() {
        val n = 1
        val expected = 1

        assertEquals(expected, NQueensII.totalNQueens(n))
    }
}