package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountingWordsWithGivenPrefixTest {
    @Test
    fun test1() {
        val words = arrayOf("pay", "attention", "practice", "attend")
        val pref = "at"
        val expected = 2

        assertEquals(expected, CountingWordsWithGivenPrefix.prefixCount(words, pref))
    }

    @Test
    fun test2() {
        val words = arrayOf("leetcode", "win", "loops", "success")
        val pref = "code"
        val expected = 0

        assertEquals(expected, CountingWordsWithGivenPrefix.prefixCount(words, pref))
    }
}