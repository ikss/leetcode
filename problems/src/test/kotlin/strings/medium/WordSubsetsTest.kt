package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class WordSubsetsTest {

    @Test
    fun test1Map() {
        val words1 = arrayOf("amazon", "apple", "facebook", "google", "leetcode")
        val words2 = arrayOf("e", "o")
        val expected = listOf("facebook", "google", "leetcode")

        assertEquals(expected, WordsSubset.wordSubsetsMap(words1, words2))
    }

    @Test
    fun test2Map() {
        val words1 = arrayOf("amazon", "apple", "facebook", "google", "leetcode")
        val words2 = arrayOf("e", "l")
        val expected = listOf("apple", "google", "leetcode")

        assertEquals(expected, WordsSubset.wordSubsetsMap(words1, words2))
    }

    @Test
    fun test1Array() {
        val words1 = arrayOf("amazon", "apple", "facebook", "google", "leetcode")
        val words2 = arrayOf("e", "o")
        val expected = listOf("facebook", "google", "leetcode")

        assertEquals(expected, WordsSubset.wordSubsetsArray(words1, words2))
    }

    @Test
    fun test2Array() {
        val words1 = arrayOf("amazon", "apple", "facebook", "google", "leetcode")
        val words2 = arrayOf("e", "l")
        val expected = listOf("apple", "google", "leetcode")

        assertEquals(expected, WordsSubset.wordSubsetsArray(words1, words2))
    }

}
