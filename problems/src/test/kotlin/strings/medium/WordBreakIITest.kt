package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class WordBreakIITest {
    @Test
    fun test1backtrack() {
        val s = "catsanddog"
        val wordDict = listOf("cat", "cats", "and", "sand", "dog")
        val expected = listOf("cat sand dog", "cats and dog")

        assertEquals(expected, WordBreakII.wordBreakBacktrack(s, wordDict))
    }

    @Test
    fun test2backtrack() {
        val s = "pineapplepenapple"
        val wordDict = listOf("apple", "pen", "applepen", "pine", "pineapple")
        val expected = listOf("pine apple pen apple", "pine applepen apple", "pineapple pen apple")

        assertEquals(expected, WordBreakII.wordBreakBacktrack(s, wordDict))
    }

    @Test
    fun test3backtrack() {
        val s = "catsandog"
        val wordDict = listOf("cats", "dog", "sand", "and", "cat")
        val expected = emptyList<String>()

        assertEquals(expected, WordBreakII.wordBreakBacktrack(s, wordDict))
    }

    @Test
    fun test1dp() {
        val s = "catsanddog"
        val wordDict = listOf("cat", "cats", "and", "sand", "dog")
        val expected = listOf("cats and dog", "cat sand dog")

        assertEquals(expected, WordBreakII.wordBreakDp(s, wordDict))
    }

    @Test
    fun test2dp() {
        val s = "pineapplepenapple"
        val wordDict = listOf("apple", "pen", "applepen", "pine", "pineapple")
        val expected = listOf("pine apple pen apple", "pineapple pen apple", "pine applepen apple")

        assertEquals(expected, WordBreakII.wordBreakDp(s, wordDict))
    }

    @Test
    fun test3dp() {
        val s = "catsandog"
        val wordDict = listOf("cats", "dog", "sand", "and", "cat")
        val expected = emptyList<String>()

        assertEquals(expected, WordBreakII.wordBreakDp(s, wordDict))
    }
}