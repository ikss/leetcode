package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SentenceSimilarityIITest {
    @Test
    fun test1() {
        val words1 = arrayOf("great", "acting", "skills")
        val words2 = arrayOf("fine", "drama", "talent")
        val pairs = listOf(
            listOf("great", "fine"),
            listOf("acting", "drama"),
            listOf("skills", "talent"),
        )
        val expected = true

        assertEquals(expected, SentenceSimilarityII.areSentencesSimilarTwo(words1, words2, pairs))
    }

    @Test
    fun test2() {
        val words1 = arrayOf("I", "love", "leetcode")
        val words2 = arrayOf("I", "love", "onepiece")
        val pairs = listOf(
            listOf("manga", "onepiece"),
            listOf("platform", "anime"),
            listOf("leetcode", "platform"),
            listOf("anime", "manga"),
        )
        val expected = true

        assertEquals(expected, SentenceSimilarityII.areSentencesSimilarTwo(words1, words2, pairs))
    }

    @Test
    fun test3() {
        val words1 = arrayOf("I", "love", "leetcode")
        val words2 = arrayOf("I", "love", "onepiece")
        val pairs = listOf(
            listOf("manga", "onepiece"),
            listOf("leetcode", "code"),
            listOf("anime", "manga"),
        )
        val expected = false

        assertEquals(expected, SentenceSimilarityII.areSentencesSimilarTwo(words1, words2, pairs))
    }
}