package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ShortestAndLexicographicallySmallestBeautifulStringTest {
    @Test
    fun test1() {
        val s = "100011001"
        val k = 3
        val expected = "11001"

        assertEquals(expected, ShortestAndLexicographicallySmallestBeautifulString.shortestBeautifulSubstring(s, k))
    }

    @Test
    fun test2() {
        val s = "1011"
        val k = 2
        val expected = "11"

        assertEquals(expected, ShortestAndLexicographicallySmallestBeautifulString.shortestBeautifulSubstring(s, k))
    }

    @Test
    fun test3() {
        val s = "000"
        val k = 1
        val expected = ""

        assertEquals(expected, ShortestAndLexicographicallySmallestBeautifulString.shortestBeautifulSubstring(s, k))
    }

    @Test
    fun test4() {
        val s = "1001000101"
        val k = 2
        val expected = "101"

        assertEquals(expected, ShortestAndLexicographicallySmallestBeautifulString.shortestBeautifulSubstring(s, k))
    }

    @Test
    fun test5() {
        val s = "01011101000111110"
        val k = 5
        val expected = "11111"

        assertEquals(expected, ShortestAndLexicographicallySmallestBeautifulString.shortestBeautifulSubstring(s, k))
    }

    @Test
    fun test6() {
        val s = "110101000010110101"
        val k = 3
        val expected = "1011"

        assertEquals(expected, ShortestAndLexicographicallySmallestBeautifulString.shortestBeautifulSubstring(s, k))
    }
}