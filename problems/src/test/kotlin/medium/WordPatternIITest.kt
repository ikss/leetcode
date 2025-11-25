package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class WordPatternIITest {
    @Test
    fun test1() {
        val pattern = "abab"
        val s = "redblueredblue"
        val expected = true

        assertEquals(expected, WordPatternII.wordPatternMatch(pattern, s))
    }

    @Test
    fun test2() {
        val pattern = "aaaa"
        val s = "asdasdasdasd"
        val expected = true

        assertEquals(expected, WordPatternII.wordPatternMatch(pattern, s))
    }

    @Test
    fun test3() {
        val pattern = "aabb"
        val s = "xyzabcxzyabc"
        val expected = false

        assertEquals(expected, WordPatternII.wordPatternMatch(pattern, s))
    }

    @Test
    fun test4() {
        val pattern = "gh"
        val s = "i"
        val expected = false

        assertEquals(expected, WordPatternII.wordPatternMatch(pattern, s))
    }
}