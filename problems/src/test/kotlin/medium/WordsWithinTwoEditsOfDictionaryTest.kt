package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class WordsWithinTwoEditsOfDictionaryTest {
    @Test
    fun test1() {
        val queries = arrayOf("word", "note", "ants", "wood")
        val dictionary = arrayOf("wood", "joke", "moat")
        val expected = listOf("word", "note", "wood")

        assertEquals(expected, WordsWithinTwoEditsOfDictionary.twoEditWords(queries, dictionary))
    }

    @Test
    fun test2() {
        val queries = arrayOf("yes")
        val dictionary = arrayOf("not")
        val expected = listOf<String>()

        assertEquals(expected, WordsWithinTwoEditsOfDictionary.twoEditWords(queries, dictionary))
    }

}