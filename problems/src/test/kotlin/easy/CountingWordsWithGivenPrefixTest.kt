package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountingWordsWithGivenPrefixTest {
    @Test
    fun test1BuildIn() {
        val words = arrayOf("pay", "attention", "practice", "attend")
        val pref = "at"
        val expected = 2

        assertEquals(expected, CountingWordsWithGivenPrefix.prefixCountBuildIn(words, pref))
    }

    @Test
    fun test2BuildIn() {
        val words = arrayOf("leetcode", "win", "loops", "success")
        val pref = "code"
        val expected = 0

        assertEquals(expected, CountingWordsWithGivenPrefix.prefixCountBuildIn(words, pref))
    }

    @Test
    fun test1Trie() {
        val words = arrayOf("pay", "attention", "practice", "attend")
        val pref = "at"
        val expected = 2

        assertEquals(expected, CountingWordsWithGivenPrefix.prefixCountTrie(words, pref))
    }

    @Test
    fun test2Trie() {
        val words = arrayOf("leetcode", "win", "loops", "success")
        val pref = "code"
        val expected = 0

        assertEquals(expected, CountingWordsWithGivenPrefix.prefixCountTrie(words, pref))
    }
}