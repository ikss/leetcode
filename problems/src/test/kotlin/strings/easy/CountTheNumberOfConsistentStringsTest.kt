package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountTheNumberOfConsistentStringsTest {
    @Test
    fun test1() {
        val allowed = "ab"
        val words = arrayOf("ad", "bd", "aaab", "baa", "badab")
        val output = 2

        assertEquals(output, CountTheNumberOfConsistentStrings.countConsistentStrings(allowed, words))
    }

    @Test
    fun test2() {
        val allowed = "abc"
        val words = arrayOf("a", "b", "c", "ab", "ac", "bc", "abc")
        val output = 7

        assertEquals(output, CountTheNumberOfConsistentStrings.countConsistentStrings(allowed, words))
    }

    @Test
    fun test3() {
        val allowed = "cad"
        val words = arrayOf("cc", "acd", "b", "ba", "bac", "bad", "ac", "d")
        val output = 4

        assertEquals(output, CountTheNumberOfConsistentStrings.countConsistentStrings(allowed, words))
    }
}