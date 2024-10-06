package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SentenceSimilarityIIITest {
    @Test
    fun test1() {
        val sentence1 = "My name is Haley"
        val sentence2 = "My Haley"
        val expected = true

        assertEquals(expected, SentenceSimilarityIII.areSentencesSimilar(sentence1, sentence2))
    }

    @Test
    fun test2() {
        val sentence1 = "of"
        val sentence2 = "A lot of words"
        val expected = false

        assertEquals(expected, SentenceSimilarityIII.areSentencesSimilar(sentence1, sentence2))
    }

    @Test
    fun test3() {
        val sentence1 = "Eating right now"
        val sentence2 = "Eating"
        val expected = true

        assertEquals(expected, SentenceSimilarityIII.areSentencesSimilar(sentence1, sentence2))
    }
}