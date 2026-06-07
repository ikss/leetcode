package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ImplementTrieIIPrefixTreeTest {
    @Test
    fun test1() {
        val trie = ImplementTrieIIPrefixTree.Trie()
        trie.insert("apple")
        trie.insert("apple")
        assertEquals(2, trie.countWordsEqualTo("apple"))
        assertEquals(2, trie.countWordsStartingWith("app"))

        trie.erase("apple")
        assertEquals(1, trie.countWordsEqualTo("apple"))
        assertEquals(1, trie.countWordsStartingWith("app"))

        trie.erase("apple")
        assertEquals(0, trie.countWordsStartingWith("app"))
    }
}