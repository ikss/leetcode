package strings.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class WordSearchIITest {

    @Test
    fun test1() {
        val board = arrayOf(
            charArrayOf('o', 'a', 'a', 'n'),
            charArrayOf('e', 't', 'a', 'e'),
            charArrayOf('i', 'h', 'k', 'r'),
            charArrayOf('i', 'f', 'l', 'v'),
        )
        val words = arrayOf("oath", "pea", "eat", "rain")
        val expected = listOf("oath", "eat")

        assertEquals(expected, WordSearchII.findWords(board, words))
    }

    @Test
    fun test2() {
        val board = arrayOf(
            charArrayOf('a', 'b'),
            charArrayOf('c', 'd'),
        )
        val words = arrayOf("abcb")
        val expected = emptyList<String>()

        assertEquals(expected, WordSearchII.findWords(board, words))
    }

    @Test
    fun test3() {
        val board = arrayOf(
            charArrayOf('o', 'a', 'a', 'n'),
            charArrayOf('e', 't', 'a', 'e'),
            charArrayOf('i', 'h', 'k', 'r'),
            charArrayOf('i', 'f', 'l', 'v'),
        )
        val words =
            arrayOf("oath", "pea", "eat", "rain", "oathi", "oathk", "oathf", "oate", "oathii", "oathfi", "oathfii")
        val expected = listOf("oate", "oath", "oathk", "oathi", "oathii", "oathf", "oathfi", "oathfii", "eat")

        assertEquals(expected, WordSearchII.findWords(board, words))
    }
}