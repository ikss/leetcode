package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReorganizeStringTest {
    @Test
    fun test1() {
        val s = "aab"
        val expected = "aba"

        assertEquals(expected, ReorganizeString.reorganizeString(s))
    }

    @Test
    fun test2() {
        val s = "aaab"
        val expected = ""

        assertEquals(expected, ReorganizeString.reorganizeString(s))
    }
}