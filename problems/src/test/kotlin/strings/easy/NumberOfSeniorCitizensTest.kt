package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfSeniorCitizensTest {
    @Test
    fun test1() {
        val details = arrayOf("7868190130M7522", "5303914400F9211", "9273338290F4010")
        val expected = 2

        assertEquals(expected, NumberOfSeniorCitizens.countSeniors(details))
    }

    @Test
    fun test2() {
        val details = arrayOf("1313579440F2036", "2921522980M5644")
        val expected = 0

        assertEquals(expected, NumberOfSeniorCitizens.countSeniors(details))
    }
}