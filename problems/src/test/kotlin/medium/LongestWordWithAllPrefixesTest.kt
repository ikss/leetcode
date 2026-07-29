package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestWordWithAllPrefixesTest {
    @Test
    fun test1Set() {
        val words = arrayOf("k", "ki", "kir", "kira", "kiran")
        val expected = "kiran"

        assertEquals(expected, LongestWordWithAllPrefixes.longestWordSet(words))
    }

    @Test
    fun test2Set() {
        val words = arrayOf("a", "banana", "app", "appl", "ap", "apply", "apple")
        val expected = "apple"

        assertEquals(expected, LongestWordWithAllPrefixes.longestWordSet(words))
    }

    @Test
    fun test1Trie() {
        val words = arrayOf("k", "ki", "kir", "kira", "kiran")
        val expected = "kiran"

        assertEquals(expected, LongestWordWithAllPrefixes.longestWordTrie(words))
    }

    @Test
    fun test2Trie() {
        val words = arrayOf("a", "banana", "app", "appl", "ap", "apply", "apple")
        val expected = "apple"

        assertEquals(expected, LongestWordWithAllPrefixes.longestWordTrie(words))
    }
}