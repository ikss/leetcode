package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class WordAbbreviationTest {
    @Test
    fun test1() {
        val words = listOf("like", "god", "internal", "me", "internet", "interval", "intension", "face", "intrusion")
        val expected = listOf("l2e", "god", "internal", "me", "i6t", "interval", "inte4n", "f2e", "intr4n")

        assertEquals(expected, WordAbbreviation.wordsAbbreviation(words))
    }

    @Test
    fun test2() {
        val words = listOf("aa", "aaa")
        val expected = listOf("aa", "aaa")

        assertEquals(expected, WordAbbreviation.wordsAbbreviation(words))
    }
}