package strings.medium

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LetterCombinationsOfPhoneNumberTest {

    @Test
    fun test1() {
        val digits = "23"
        val excepted = listOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")
        assertEquals(excepted, LetterCombinationsOfPhoneNumber.letterCombinationsOfPhoneNumber(digits))
    }

    @Test
    fun test2() {
        val digits = ""
        val excepted = emptyList<String>()
        assertEquals(excepted, LetterCombinationsOfPhoneNumber.letterCombinationsOfPhoneNumber(digits))
    }

    @Test
    fun test3() {
        val digits = "7"
        val excepted = listOf("p", "q", "r", "s")
        assertEquals(excepted, LetterCombinationsOfPhoneNumber.letterCombinationsOfPhoneNumber(digits))
    }

    @Test
    fun test4() {
        val digits = "2"
        val excepted = listOf("a", "b", "c")
        assertEquals(excepted, LetterCombinationsOfPhoneNumber.letterCombinationsOfPhoneNumber(digits))
    }

    @Test
    fun test5() {
        val digits = "234"
        val excepted = listOf(
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
        assertEquals(excepted, LetterCombinationsOfPhoneNumber.letterCombinationsOfPhoneNumber(digits))
    }
}
