package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class WordLadderTest {

    @Test
    fun test1() {
        val beginWord = "hit"
        val endWord = "cog"
        val wordList = listOf("hot", "dot", "dog", "lot", "log", "cog")
        val expected = 5

        assertEquals(expected, WordLadder.ladderLength(beginWord, endWord, wordList))
    }

    @Test
    fun test2() {
        val beginWord = "hit"
        val endWord = "cog"
        val wordList = listOf("hot", "dot", "dog", "lot", "log")
        val expected = 0

        assertEquals(expected, WordLadder.ladderLength(beginWord, endWord, wordList))
    }
}