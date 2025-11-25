package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class WordSearchTest {
    @Test
    fun test1() {
        val board = arrayOf(
            charArrayOf('A', 'B', 'C', 'E'),
            charArrayOf('S', 'F', 'C', 'S'),
            charArrayOf('A', 'D', 'E', 'E'),
        )
        val word = "ABCCED"
        val expected = true

        assertEquals(expected, WordSearch.exist(board, word))
    }

    @Test
    fun test2() {
        val board = arrayOf(
            charArrayOf('A', 'B', 'C', 'E'),
            charArrayOf('S', 'F', 'C', 'S'),
            charArrayOf('A', 'D', 'E', 'E'),
        )
        val word = "SEE"
        val expected = true

        assertEquals(expected, WordSearch.exist(board, word))
    }

    @Test
    fun test3() {
        val board = arrayOf(
            charArrayOf('A', 'B', 'C', 'E'),
            charArrayOf('S', 'F', 'C', 'S'),
            charArrayOf('A', 'D', 'E', 'E'),
        )
        val word = "ABCB"
        val expected = false

        assertEquals(expected, WordSearch.exist(board, word))
    }
}