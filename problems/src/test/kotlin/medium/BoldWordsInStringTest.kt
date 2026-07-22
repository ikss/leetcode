package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BoldWordsInStringTest {
    @Test
    fun test1() {
        val words = arrayOf("ab", "bc")
        val s = "aabcd"
        val expected = "a<b>abc</b>d"

        assertEquals(expected, BoldWordsInString.boldWords(words, s))
    }

    @Test
    fun test2() {
        val words = arrayOf("ab", "cb")
        val s = "aabcd"
        val expected = "a<b>ab</b>cd"

        assertEquals(expected, BoldWordsInString.boldWords(words, s))
    }

}