package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SubstringConcatenationOfAllWordsTest {

    @Test
    fun test1() {
        val s = "barfoothefoobarman"
        val words = arrayOf("foo", "bar")
        val expected = listOf(0, 9)

        assertEquals(expected, SubstringConcatenationOfAllWords.findSubstring(s, words))
    }

    @Test
    fun test2() {
        val s = "wordgoodgoodgoodbestword"
        val words = arrayOf("word", "good", "best", "word")
        val expected = emptyList<Int>()

        assertEquals(expected, SubstringConcatenationOfAllWords.findSubstring(s, words))
    }

    @Test
    fun test3() {
        val s = "barfoofoobarthefoobarman"
        val words = arrayOf("bar", "foo", "the")
        val expected = listOf(6, 9, 12)

        assertEquals(expected, SubstringConcatenationOfAllWords.findSubstring(s, words))
    }
}
