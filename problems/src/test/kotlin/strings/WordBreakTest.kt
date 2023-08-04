package strings

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class WordBreakTest {
    @Test
    fun test1backtrack() {
        val s = "leetcode"
        val wordDict = listOf("leet", "code")
        val expected = true

        assertEquals(expected, WordBreak.wordBreakBacktrack(s, wordDict))
    }

    @Test
    fun test2backtrack() {
        val s = "applepenapple"
        val wordDict = listOf("apple", "pen")
        val expected = true

        assertEquals(expected, WordBreak.wordBreakBacktrack(s, wordDict))
    }

    @Test
    fun test3backtrack() {
        val s = "catsandog"
        val wordDict = listOf("cats", "dog", "sand", "and", "cat")
        val expected = false

        assertEquals(expected, WordBreak.wordBreakBacktrack(s, wordDict))
    }

    @Test
    fun test1dp() {
        val s = "leetcode"
        val wordDict = listOf("leet", "code")
        val expected = true

        assertEquals(expected, WordBreak.wordBreakDp(s, wordDict))
    }

    @Test
    fun test2dp() {
        val s = "applepenapple"
        val wordDict = listOf("apple", "pen")
        val expected = true

        assertEquals(expected, WordBreak.wordBreakDp(s, wordDict))
    }

    @Test
    fun test3dp() {
        val s = "catsandog"
        val wordDict = listOf("cats", "dog", "sand", "and", "cat")
        val expected = false

        assertEquals(expected, WordBreak.wordBreakDp(s, wordDict))
    }
}