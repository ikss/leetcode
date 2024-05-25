package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class WordBreakIITest {
    @Test
    fun test1() {
        val s = "catsanddog"
        val wordDict = listOf("cat", "cats", "and", "sand", "dog")
        val expected = listOf("cat sand dog", "cats and dog")

        assertEquals(expected, WordBreakII.wordBreak(s, wordDict))
    }

    @Test
    fun test2() {
        val s = "pineapplepenapple"
        val wordDict = listOf("apple", "pen", "applepen", "pine", "pineapple")
        val expected = listOf("pine apple pen apple", "pine applepen apple", "pineapple pen apple")

        assertEquals(expected, WordBreakII.wordBreak(s, wordDict))
    }

    @Test
    fun test3() {
        val s = "catsandog"
        val wordDict = listOf("cats", "dog", "sand", "and", "cat")
        val expected = emptyList<String>()

        assertEquals(expected, WordBreakII.wordBreak(s, wordDict))
    }
}