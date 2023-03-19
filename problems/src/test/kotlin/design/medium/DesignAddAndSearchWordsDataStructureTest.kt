package design.medium

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test


class DesignAddAndSearchWordsDataStructureTest {
    @Test
    fun test1() {
        val wordDictionary = DesignAddAndSearchWordsDataStructure.WordDictionary()
        wordDictionary.addWord("bad")
        wordDictionary.addWord("dad")
        wordDictionary.addWord("mad")

        // return False
        assertFalse(wordDictionary.search("pad"))

        // return True
        assertTrue(wordDictionary.search("bad"))

        // return True
        assertTrue(wordDictionary.search(".ad"))

        // return True
        assertTrue(wordDictionary.search("b.."))
    }
}