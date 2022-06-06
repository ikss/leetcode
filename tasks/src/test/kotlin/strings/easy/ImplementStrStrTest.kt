package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ImplementStrStrTest {

    @Test
    fun test1() {
        val haystack = "hello"
        val needle = "ll"
        val expected = 2
        assertEquals(expected, ImplementStrStr.strStr(haystack, needle))
    }

    @Test
    fun test2() {
        val haystack = "aaaaa"
        val needle = "baa"
        val expected = -1
        assertEquals(expected, ImplementStrStr.strStr(haystack, needle))
    }

    @Test
    fun test3() {
        val haystack = "hello"
        val needle = ""
        val expected = 0
        assertEquals(expected, ImplementStrStr.strStr(haystack, needle))
    }
}
