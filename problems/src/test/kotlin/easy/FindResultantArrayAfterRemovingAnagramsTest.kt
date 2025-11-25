package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindResultantArrayAfterRemovingAnagramsTest {
    @Test
    fun test1() {
        val words = arrayOf("abba", "baba", "bbaa", "cd", "cd")
        val expected = listOf("abba", "cd")

        assertEquals(expected, FindResultantArrayAfterRemovingAnagrams.removeAnagrams(words))
    }

    @Test
    fun test2() {
        val words = arrayOf("a", "b", "c", "d", "e")
        val expected = listOf("a", "b", "c", "d", "e")

        assertEquals(expected, FindResultantArrayAfterRemovingAnagrams.removeAnagrams(words))
    }
}