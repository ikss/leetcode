package week3

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AnagramsTest {

    @Test
    fun test1() {
        assertEquals(listOf(0, 6), Anagrams.findAnagrams("cbaebabacd", "abc"))
    }

    @Test
    fun test2() {
        assertEquals(listOf(0, 1, 2), Anagrams.findAnagrams("abab", "ab"))
    }
}
