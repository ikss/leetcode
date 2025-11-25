package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReverseWordsInStringTest {

    @Test
    fun test1oneLiner() {
        val s = "the sky is blue"
        val expected = "blue is sky the"

        assertEquals(expected, ReverseWordsInString.reverseWordsOneLiner(s))
    }

    @Test
    fun test2OneLiner() {
        val s = "  hello world  "
        val expected = "world hello"

        assertEquals(expected, ReverseWordsInString.reverseWordsOneLiner(s))
    }

    @Test
    fun test3OneLiner() {
        val s = "a good   example"
        val expected = "example good a"

        assertEquals(expected, ReverseWordsInString.reverseWordsOneLiner(s))
    }

    @Test
    fun test1simple() {
        val s = "the sky is blue"
        val expected = "blue is sky the"

        assertEquals(expected, ReverseWordsInString.reverseWordsSimple(s))
    }

    @Test
    fun test2simple() {
        val s = "  hello world  "
        val expected = "world hello"

        assertEquals(expected, ReverseWordsInString.reverseWordsSimple(s))
    }

    @Test
    fun test3simple() {
        val s = "a good   example"
        val expected = "example good a"

        assertEquals(expected, ReverseWordsInString.reverseWordsSimple(s))
    }
}