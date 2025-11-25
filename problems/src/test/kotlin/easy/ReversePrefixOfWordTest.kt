package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReversePrefixOfWordTest {
    @Test
    fun test1() {
        val word = "abcdefd"
        val ch = 'd'
        val expected = "dcbaefd"

        assertEquals(expected, ReversePrefixOfWord.reversePrefix(word, ch))
    }

    @Test
    fun test2() {
        val word = "xyxzxe"
        val ch = 'z'
        val expected = "zxyxxe"

        assertEquals(expected, ReversePrefixOfWord.reversePrefix(word, ch))
    }

    @Test
    fun test3() {
        val word = "abcd"
        val ch = 'z'
        val expected = "abcd"

        assertEquals(expected, ReversePrefixOfWord.reversePrefix(word, ch))
    }
}