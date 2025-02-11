package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveAllOccurrencesOfSubstringTest {
    @Test
    fun test1() {
        val s = "daabcbaabcbc"
        val part = "abc"
        val expected = "dab"

        assertEquals(expected, RemoveAllOccurrencesOfSubstring.removeOccurrences(s, part))
    }
    
    @Test
    fun test2() {
        val s = "axxxxyyyyb"
        val part = "xy"
        val expected = "ab"

        assertEquals(expected, RemoveAllOccurrencesOfSubstring.removeOccurrences(s, part))
    }
}