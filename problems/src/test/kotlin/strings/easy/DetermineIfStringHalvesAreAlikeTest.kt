package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DetermineIfStringHalvesAreAlikeTest {

    @Test
    fun test1() {
        val s = "book"
        val expected = true

        assertEquals(expected, DetermineIfStringHalvesAreAlike.halvesAreAlike(s))
    }

    @Test
    fun test2() {
        val s = "textbook"
        val expected = false

        assertEquals(expected, DetermineIfStringHalvesAreAlike.halvesAreAlike(s))
    }
}