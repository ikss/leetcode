package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StringCompressionIIITest {
    @Test
    fun test1() {
        val word = "abcde"
        val expected = "1a1b1c1d1e"

        assertEquals(expected, StringCompressionIII.compressedString(word))
    }

    @Test
    fun test2() {
        val word = "aaaaaaaaaaaaaabb"
        val expected = "9a5a2b"

        assertEquals(expected, StringCompressionIII.compressedString(word))
    }
}