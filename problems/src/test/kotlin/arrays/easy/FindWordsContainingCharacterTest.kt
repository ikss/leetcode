package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindWordsContainingCharacterTest {
    @Test
    fun test1() {
        val words = arrayOf("leet", "code")
        val char = 'e'
        val expected = listOf(0, 1)

        assertEquals(expected, FindWordsContainingCharacter.findWordsContaining(words, char))
    }

    @Test
    fun test2() {
        val words = arrayOf("abc", "bcd", "aaaa", "cbc")
        val char = 'a'
        val expected = listOf(0, 2)

        assertEquals(expected, FindWordsContainingCharacter.findWordsContaining(words, char))
    }

    @Test
    fun test3() {
        val words = arrayOf("abc", "bcd", "aaaa", "cbc")
        val char = 'z'
        val expected = emptyList<Int>()

        assertEquals(expected, FindWordsContainingCharacter.findWordsContaining(words, char))
    }
}