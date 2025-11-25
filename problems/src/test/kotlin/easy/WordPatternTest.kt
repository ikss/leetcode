package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class WordPatternTest {
    @Test
    fun test1() {
        val pattern = "abba"
        val s = "dog cat cat dog"
        val expected = true

        assertEquals(expected, WordPattern.wordPattern(pattern, s))
    }

    @Test
    fun test2() {
        val pattern = "abba"
        val s = "dog cat cat fish"
        val expected = false

        assertEquals(expected, WordPattern.wordPattern(pattern, s))
    }

    @Test
    fun test3() {
        val pattern = "aaaa"
        val s = "dog cat cat dog"
        val expected = false

        assertEquals(expected, WordPattern.wordPattern(pattern, s))
    }
}