package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class ReverseWordsInStringIITest {
    @Test
    fun test1() {
        val s = charArrayOf('t', 'h', 'e', ' ', 's', 'k', 'y', ' ', 'i', 's', ' ', 'b', 'l', 'u', 'e')
        ReverseWordsInStringII.reverseWords(s)
        val expected = charArrayOf('b', 'l', 'u', 'e', ' ', 'i', 's', ' ', 's', 'k', 'y', ' ', 't', 'h', 'e')

        assertArrayEquals(expected, s)
    }

    @Test
    fun test2() {
        val s = charArrayOf('a')
        ReverseWordsInStringII.reverseWords(s)
        val expected = charArrayOf('a')

        assertArrayEquals(expected, s)
    }
}