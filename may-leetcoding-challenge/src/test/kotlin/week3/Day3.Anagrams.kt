package week3

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AnagramsTest {

    @Test
    fun test1() {
        assertEquals(Anagrams.findAnagrams("cbaebabacd", "abc"), listOf(0, 6))
    }

    @Test
    fun test2() {
        assertEquals(Anagrams.findAnagrams("abab", "ab"), listOf(0, 1, 2))
    }
}
