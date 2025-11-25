package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ConcatenatedWordsTest {

    @Test
    fun test1naive() {
        val words = arrayOf("cat", "cats", "catsdogcats", "dog", "dogcatsdog", "hippopotamuses", "rat", "ratcatdogcat")
        val expected = listOf("catsdogcats", "dogcatsdog", "ratcatdogcat")

        assertEquals(expected, ConcatenatedWords.findAllConcatenatedWordsInADictNaive(words))
    }

    @Test
    fun test2naive() {
        val words = arrayOf("cat", "dog", "catdog")
        val expected = listOf("catdog")

        assertEquals(expected, ConcatenatedWords.findAllConcatenatedWordsInADictNaive(words))
    }

    @Test
    fun test1dp() {
        val words = arrayOf("cat", "cats", "catsdogcats", "dog", "dogcatsdog", "hippopotamuses", "rat", "ratcatdogcat")
        val expected = listOf("catsdogcats", "dogcatsdog", "ratcatdogcat")

        assertEquals(expected, ConcatenatedWords.findAllConcatenatedWordsInADictDp(words))
    }

    @Test
    fun test2dp() {
        val words = arrayOf("cat", "dog", "catdog")
        val expected = listOf("catdog")

        assertEquals(expected, ConcatenatedWords.findAllConcatenatedWordsInADictDp(words))
    }
}