package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ShortEncodingOfWordsTest {

    @Test
    fun test1() {
        val words = arrayOf("time", "me", "bell")
        val expected = 10

        assertEquals(expected, ShortEncodingOfWords.minimumLengthEncoding(words))
    }

    @Test
    fun test2() {
        val words = arrayOf("t")
        val expected = 2

        assertEquals(expected, ShortEncodingOfWords.minimumLengthEncoding(words))
    }

    @Test
    fun test3() {
        val words = arrayOf("time", "me", "time", "ime", "ttime")
        val expected = 6

        assertEquals(expected, ShortEncodingOfWords.minimumLengthEncoding(words))
    }
}
