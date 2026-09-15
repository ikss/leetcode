package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumNumberOfNonoverlappingPalindromeSubstringsTest {
    @Test
    fun test1() {
        val s = "abaccdbbd"
        val k = 3
        val expected = 2

        assertEquals(expected, MaximumNumberOfNonoverlappingPalindromeSubstrings.maxPalindromes(s, k))
    }

    @Test
    fun test2() {
        val s = "adbcda"
        val k = 2
        val expected = 0

        assertEquals(expected, MaximumNumberOfNonoverlappingPalindromeSubstrings.maxPalindromes(s, k))
    }

    @Test
    fun test3() {
        val s = "rzdtuheehuolxbhcychbpmcmxxxxxxiywqwyierjsuusjreunvvnu"
        val k = 4
        val expected = 6

        assertEquals(expected, MaximumNumberOfNonoverlappingPalindromeSubstrings.maxPalindromes(s, k))
    }

    @Test
    fun test4() {
        val s = "wctqaietbwbwbtelubvbbvbulohknbsuylyusbqdxcelecxmomcozocmojusycwcys"
        val k = 7
        val expected = 6

        assertEquals(expected, MaximumNumberOfNonoverlappingPalindromeSubstrings.maxPalindromes(s, k))
    }
}