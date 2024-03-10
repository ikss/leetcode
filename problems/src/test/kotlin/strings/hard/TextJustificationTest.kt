package strings.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TextJustificationTest {
    @Test
    fun test1() {
        val words = arrayOf("This", "is", "an", "example", "of", "text", "justification.")
        val maxWidth = 16
        val expected = listOf(
            "This    is    an",
            "example  of text",
            "justification.  "
        )

        assertEquals(expected, TextJustification.fullJustify(words, maxWidth))
    }

    @Test
    fun test2() {
        val words = arrayOf("What", "must", "be", "acknowledgment", "shall", "be")
        val maxWidth = 16
        val expected = listOf(
            "What   must   be",
            "acknowledgment  ",
            "shall be        "
        )

        assertEquals(expected, TextJustification.fullJustify(words, maxWidth))
    }

    @Test
    fun test3() {
        val words = arrayOf(
            "Science", "is", "what", "we", "understand", "well", "enough", "to", "explain", "to", "a", "computer.",
            "Art", "is", "everything", "else", "we", "do"
        )
        val maxWidth = 20
        val expected = listOf(
            "Science  is  what we",
            "understand      well",
            "enough to explain to",
            "a  computer.  Art is",
            "everything  else  we",
            "do                  "
        )

        assertEquals(expected, TextJustification.fullJustify(words, maxWidth))
    }
}