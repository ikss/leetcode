package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LetterCombinationsOfPhoneNumberTest {

    @Test
    fun test1cartesian() {
        val digits = "23"
        val expected = listOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")

        assertEquals(expected, LetterCombinationsOfPhoneNumber.letterCombinationsOfPhoneNumber(digits))
    }

    @Test
    fun test2cartesian() {
        val digits = ""
        val expected = emptyList<String>()

        assertEquals(expected, LetterCombinationsOfPhoneNumber.letterCombinationsOfPhoneNumber(digits))
    }

    @Test
    fun test3cartesian() {
        val digits = "7"
        val expected = listOf("p", "q", "r", "s")

        assertEquals(expected, LetterCombinationsOfPhoneNumber.letterCombinationsOfPhoneNumber(digits))
    }

    @Test
    fun test4cartesian() {
        val digits = "2"
        val expected = listOf("a", "b", "c")

        assertEquals(expected, LetterCombinationsOfPhoneNumber.letterCombinationsOfPhoneNumber(digits))
    }

    @Test
    fun test5cartesian() {
        val digits = "234"
        val expected = listOf(
            "adg",
            "adh",
            "adi",
            "aeg",
            "aeh",
            "aei",
            "afg",
            "afh",
            "afi",
            "bdg",
            "bdh",
            "bdi",
            "beg",
            "beh",
            "bei",
            "bfg",
            "bfh",
            "bfi",
            "cdg",
            "cdh",
            "cdi",
            "ceg",
            "ceh",
            "cei",
            "cfg",
            "cfh",
            "cfi"
        )

        assertEquals(expected, LetterCombinationsOfPhoneNumber.letterCombinationsOfPhoneNumber(digits))
    }

    @Test
    fun test1backtrack() {
        val digits = "23"
        val expected = listOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")

        assertEquals(expected, LetterCombinationsOfPhoneNumber.letterCombinationsBacktrack(digits))
    }

    @Test
    fun test2backtrack() {
        val digits = ""
        val expected = emptyList<String>()

        assertEquals(expected, LetterCombinationsOfPhoneNumber.letterCombinationsBacktrack(digits))
    }

    @Test
    fun test3backtrack() {
        val digits = "7"
        val expected = listOf("p", "q", "r", "s")

        assertEquals(expected, LetterCombinationsOfPhoneNumber.letterCombinationsBacktrack(digits))
    }

    @Test
    fun test4backtrack() {
        val digits = "2"
        val expected = listOf("a", "b", "c")

        assertEquals(expected, LetterCombinationsOfPhoneNumber.letterCombinationsBacktrack(digits))
    }

    @Test
    fun test5backtrack() {
        val digits = "234"
        val expected = listOf(
            "adg",
            "adh",
            "adi",
            "aeg",
            "aeh",
            "aei",
            "afg",
            "afh",
            "afi",
            "bdg",
            "bdh",
            "bdi",
            "beg",
            "beh",
            "bei",
            "bfg",
            "bfh",
            "bfi",
            "cdg",
            "cdh",
            "cdi",
            "ceg",
            "ceh",
            "cei",
            "cfg",
            "cfh",
            "cfi"
        )

        assertEquals(expected, LetterCombinationsOfPhoneNumber.letterCombinationsBacktrack(digits))
    }
}
