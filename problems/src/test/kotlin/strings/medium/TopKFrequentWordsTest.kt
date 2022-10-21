package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TopKFrequentWordsTest {

    @Test
    fun test1() {
        val words = arrayOf("i", "love", "leetcode", "i", "love", "coding")
        val k = 2
        val expected = listOf("i", "love")

        assertEquals(expected, TopKFrequentWords.topKFrequent(words, k))
    }

    @Test
    fun test2() {
        val words = arrayOf("the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is")
        val k = 4
        val expected = listOf("the", "is", "sunny", "day")

        assertEquals(expected, TopKFrequentWords.topKFrequent(words, k))
    }
}