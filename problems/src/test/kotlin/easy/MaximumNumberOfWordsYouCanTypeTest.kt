package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumNumberOfWordsYouCanTypeTest {
    @Test
    fun test1() {
        val text = "hello world"
        val brokenLetters = "ad"
        val expected = 1

        assertEquals(expected, MaximumNumberOfWordsYouCanType.canBeTypedWords(text, brokenLetters))
    }

    @Test
    fun test2() {
        val text = "leet code"
        val brokenLetters = "lt"
        val expected = 1

        assertEquals(expected, MaximumNumberOfWordsYouCanType.canBeTypedWords(text, brokenLetters))
    }

    @Test
    fun test3() {
        val text = "leet code"
        val brokenLetters = "e"
        val expected = 0

        assertEquals(expected, MaximumNumberOfWordsYouCanType.canBeTypedWords(text, brokenLetters))
    }
}