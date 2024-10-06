package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SentenceSimilarityTest {
    @Test
    fun test1() {
        val words1 = arrayOf("great", "acting", "skills")
        val words2 = arrayOf("fine", "drama", "talent")
        val pairs = listOf(
            listOf("great", "fine"),
            listOf("acting", "drama"),
            listOf("skills", "talent")
        )
        val expected = true

        assertEquals(expected, SentenceSimilarity.areSentencesSimilar(words1, words2, pairs))
    }

    @Test
    fun test2() {
        val words1 = arrayOf("great")
        val words2 = arrayOf("great")
        val pairs = emptyList<List<String>>()
        val expected = true

        assertEquals(expected, SentenceSimilarity.areSentencesSimilar(words1, words2, pairs))
    }

    @Test
    fun test3() {
        val words1 = arrayOf("great")
        val words2 = arrayOf("doubleplus", "good")
        val pairs = listOf(
            listOf("great", "doubleplus"),
        )
        val expected = false

        assertEquals(expected, SentenceSimilarity.areSentencesSimilar(words1, words2, pairs))
    }
}