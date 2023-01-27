package strings.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ConcatenatedWordsTest {

    @Test
    fun test1() {
        val words = arrayOf("cat", "cats", "catsdogcats", "dog", "dogcatsdog", "hippopotamuses", "rat", "ratcatdogcat")
        val expected = listOf("dogcatsdog", "catsdogcats", "ratcatdogcat")

        assertEquals(expected, ConcatenatedWords.findAllConcatenatedWordsInADict(words))
    }

    @Test
    fun test2() {
        val words = arrayOf("cat", "dog", "catdog")
        val expected = listOf("catdog")

        assertEquals(expected, ConcatenatedWords.findAllConcatenatedWordsInADict(words))
    }
}