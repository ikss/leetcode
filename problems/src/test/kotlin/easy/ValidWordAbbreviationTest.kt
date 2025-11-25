package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ValidWordAbbreviationTest {
    @Test
    fun test1() {
        val word = "internationalization"
        val abbr = "i12iz4n"
        val expected = true

        assertEquals(expected, ValidWordAbbreviation.validWordAbbreviation(word, abbr))
    }
    
    @Test
    fun test2() {
        val word = "apple"
        val abbr = "a2e"
        val expected = false

        assertEquals(expected, ValidWordAbbreviation.validWordAbbreviation(word, abbr))
    }
}