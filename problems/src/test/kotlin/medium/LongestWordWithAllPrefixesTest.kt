package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestWordWithAllPrefixesTest {
    @Test
    fun test1() {
        val words = arrayOf("k", "ki", "kir", "kira", "kiran")
        val expected = "kiran"

        assertEquals(expected, LongestWordWithAllPrefixes.longestWord(words))
    }

    @Test
    fun test2() {
        val words = arrayOf("a", "banana", "app", "appl", "ap", "apply", "apple")
        val expected = "apple"

        assertEquals(expected, LongestWordWithAllPrefixes.longestWord(words))
    }
}