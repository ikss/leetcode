package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfStringsThatAppearAsSubstringsInWordTest {
    @Test
    fun test1Naive() {
        val patterns = arrayOf("a", "abc", "bc", "d")
        val word = "abc"
        val expected = 3

        assertEquals(expected, NumberOfStringsThatAppearAsSubstringsInWord.numOfStringsNaive(patterns, word))
    }

    @Test
    fun test2Naive() {
        val patterns = arrayOf("a", "b", "c")
        val word = "aaaaabbbbb"
        val expected = 2

        assertEquals(expected, NumberOfStringsThatAppearAsSubstringsInWord.numOfStringsNaive(patterns, word))
    }

    @Test
    fun test3Naive() {
        val patterns = arrayOf("a", "a", "a")
        val word = "ab"
        val expected = 3

        assertEquals(expected, NumberOfStringsThatAppearAsSubstringsInWord.numOfStringsNaive(patterns, word))
    }

    @Test
    fun test1KMP() {
        val patterns = arrayOf("a", "abc", "bc", "d")
        val word = "abc"
        val expected = 3

        assertEquals(expected, NumberOfStringsThatAppearAsSubstringsInWord.numOfStringsKMP(patterns, word))
    }

    @Test
    fun test2KMP() {
        val patterns = arrayOf("a", "b", "c")
        val word = "aaaaabbbbb"
        val expected = 2

        assertEquals(expected, NumberOfStringsThatAppearAsSubstringsInWord.numOfStringsKMP(patterns, word))
    }

    @Test
    fun test3KMP() {
        val patterns = arrayOf("a", "a", "a")
        val word = "ab"
        val expected = 3

        assertEquals(expected, NumberOfStringsThatAppearAsSubstringsInWord.numOfStringsKMP(patterns, word))
    }
}