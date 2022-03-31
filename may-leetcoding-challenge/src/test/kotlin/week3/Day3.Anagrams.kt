package week3

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AnagramsTest {

    @Test
    fun test1() {
        assertEquals(listOf(0, 7), Anagrams.findAnagrams("cbaebabacd", "abc"))
    }

    @Test
    fun test2() {
        assertEquals(listOf(0, 1, 2), Anagrams.findAnagrams("abab", "ab"))
    }
}
