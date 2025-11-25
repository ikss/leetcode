package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PalindromePairsTest {

    @Test
    fun test1() {
        val words = arrayOf("abcd", "dcba", "lls", "s", "sssll")
        val expected = listOf(listOf(1, 0), listOf(0, 1), listOf(3, 2), listOf(2, 4))

        assertEquals(expected, PalindromePairs.palindromePairs(words))
    }

    @Test
    fun test2() {
        val words = arrayOf("bat", "tab", "cat")
        val expected = listOf(listOf(1, 0), listOf(0, 1))

        assertEquals(expected, PalindromePairs.palindromePairs(words))
    }

    @Test
    fun test3() {
        val words = arrayOf("a", "")
        val expected = listOf(listOf(1, 0), listOf(0, 1))

        assertEquals(expected, PalindromePairs.palindromePairs(words))
    }
}