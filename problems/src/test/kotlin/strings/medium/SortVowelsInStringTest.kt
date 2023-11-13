package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SortVowelsInStringTest {
    @Test
    fun test1() {
        val s = "lEetcOde"
        val expected = "lEOtcede"

        assertEquals(expected, SortVowelsInString.sortVowels(s))
    }

    @Test
    fun test2() {
        val s = "lYmpH"
        val expected = "lYmpH"

        assertEquals(expected, SortVowelsInString.sortVowels(s))
    }
}