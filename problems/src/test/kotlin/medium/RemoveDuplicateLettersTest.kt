package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveDuplicateLettersTest {
    @Test
    fun test1() {
        val s = "bcabc"
        val expected = "abc"

        assertEquals(expected, RemoveDuplicateLetters.removeDuplicateLetters(s))
    }

    @Test
    fun test2() {
        val s = "cbacdcbc"
        val expected = "acdb"

        assertEquals(expected, RemoveDuplicateLetters.removeDuplicateLetters(s))
    }
}