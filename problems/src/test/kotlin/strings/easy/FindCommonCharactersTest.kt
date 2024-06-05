package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindCommonCharactersTest {
    @Test
    fun test1() {
        val words = arrayOf("bella", "label", "roller")
        val expected = listOf("e", "l", "l")

        assertEquals(expected, FindCommonCharacters.commonChars(words))
    }

    @Test
    fun test2() {
        val words = arrayOf("cool", "lock", "cook")
        val expected = listOf("c", "o")

        assertEquals(expected, FindCommonCharacters.commonChars(words))
    }
}