package strings.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class WordLadderIITest {

    @Test
    fun test1() {
        val beginWord = "hit"
        val endWord = "cog"
        val wordList = listOf("hot", "dot", "dog", "lot", "log", "cog")
        val expected = listOf(listOf("hit", "hot", "dot", "dog", "cog"), listOf("hit", "hot", "lot", "log", "cog"))

        assertEquals(expected, WordLadderII.findLadders(beginWord, endWord, wordList))
    }

    @Test
    fun test2() {
        val beginWord = "hit"
        val endWord = "cog"
        val wordList = listOf("hot", "dot", "dog", "lot", "log")
        val expected = emptyList<List<String>>()

        assertEquals(expected, WordLadderII.findLadders(beginWord, endWord, wordList))
    }
}
