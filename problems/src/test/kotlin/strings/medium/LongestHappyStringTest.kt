package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestHappyStringTest {
    @Test
    fun test1() {
        val a = 1
        val b = 1
        val c = 7
        val expected = "ccaccbcc"

        assertEquals(expected, LongestHappyString.longestDiverseString(a, b, c))
    }
    
    @Test
    fun test2() {
        val a = 7
        val b = 1
        val c = 0
        val expected = "aabaa"

        assertEquals(expected, LongestHappyString.longestDiverseString(a, b, c))
    }
}