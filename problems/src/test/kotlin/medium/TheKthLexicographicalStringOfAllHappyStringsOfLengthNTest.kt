package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TheKthLexicographicalStringOfAllHappyStringsOfLengthNTest {
    @Test
    fun test1() {
        val n = 1
        val k = 3
        val expected = "c"

        assertEquals(expected, TheKthLexicographicalStringOfAllHappyStringsOfLengthN.getHappyString(n, k))
    }

    @Test
    fun test2() {
        val n = 1
        val k = 4
        val expected = ""

        assertEquals(expected, TheKthLexicographicalStringOfAllHappyStringsOfLengthN.getHappyString(n, k))
    }

    @Test
    fun test3() {
        val n = 3
        val k = 9
        val expected = "cab"

        assertEquals(expected, TheKthLexicographicalStringOfAllHappyStringsOfLengthN.getHappyString(n, k))
    }
}