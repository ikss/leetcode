package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class WordSubsetsTest {

    @Test
    fun test1() {
        val words1 = arrayOf("amazon", "apple", "facebook", "google", "leetcode")
        val words2 = arrayOf("e", "o")
        val expected = listOf("facebook", "google", "leetcode")

        assertEquals(expected, WordsSubset.wordSubsets(words1, words2))
    }

    @Test
    fun test2() {
        val words1 = arrayOf("amazon", "apple", "facebook", "google", "leetcode")
        val words2 = arrayOf("e", "l")
        val expected = listOf("apple", "google", "leetcode")

        assertEquals(expected, WordsSubset.wordSubsets(words1, words2))
    }

}
