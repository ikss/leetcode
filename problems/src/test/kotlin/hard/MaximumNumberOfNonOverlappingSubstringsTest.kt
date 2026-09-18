package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumNumberOfNonOverlappingSubstringsTest {
    @Test
    fun test1() {
        val s = "adefaddaccc"
        val expected = listOf("e", "f", "ccc")

        assertEquals(expected, MaximumNumberOfNonOverlappingSubstrings.maxNumOfSubstrings(s))
    }

    @Test
    fun test2() {
        val s = "abbaccd"
        val expected = listOf("bb", "cc", "d")

        assertEquals(expected, MaximumNumberOfNonOverlappingSubstrings.maxNumOfSubstrings(s))
    }

    @Test
    fun test3() {
        val s = "abcdefghijklma"
        val expected = listOf("b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m")

        assertEquals(expected, MaximumNumberOfNonOverlappingSubstrings.maxNumOfSubstrings(s))
    }

    @Test
    fun test4() {
        val s = "abab"
        val expected = listOf("abab")

        assertEquals(expected, MaximumNumberOfNonOverlappingSubstrings.maxNumOfSubstrings(s))
    }
}